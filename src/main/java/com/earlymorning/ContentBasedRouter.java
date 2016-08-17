package com.earlymorning;

import com.earlymorning.model.InboundFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dario on 10/08/2016.
 */

@Configuration
@PropertySource("classpath:META-INF/com/earlymorning/properties/InboundFile.properties")
@Component
public class ContentBasedRouter {

    @Value("${path.file.input}")
    private String pathInput = "src/test/resources/input/";
    private String pathInputOld = pathInput + "old/";
    @Value("${archive.failed.path}")
    private String archiveFailedPath = "src/test/resources/output/errorsFile/";
    @Value("${max.interval.arrival")
    private String maxIntervalArrivalDay = "2";

    private static final Logger logger = LoggerFactory.getLogger(ContentBasedRouter.class);

    public boolean checkOnTime(InboundFile fileJustArrived, InboundFile fileOld) {
        // days when the file can arrive
        int afterNDays = Integer.parseInt(maxIntervalArrivalDay);
        File getterOfLastProcessing = new File(fileOld.getFilePath() + fileOld.getNameOfFile());
        if (getterOfLastProcessing.exists()) {
            long timeOfLastArrival = fileOld.getActualArrivalDate();
            long timeOfLastMod = fileJustArrived.getActualArrivalDate();

            if (timeOfLastMod - timeOfLastArrival > TimeUnit.MILLISECONDS.convert(afterNDays, TimeUnit.DAYS)) {
                return false;
            } else {
                return true;
            }
        } else {
            moveFile(fileJustArrived.getFilePath() + fileJustArrived.getNameOfFile(), pathInputOld);
            return true;
        }
    }

    public boolean checkIntegrity(InboundFile fileJustArrived) {
        return !fileJustArrived.getNameOfFile().endsWith("temp");
    }

    public void sendFileToErrorList(InboundFile fileWithMistakes) {
        moveFile(fileWithMistakes.getFilePath() + fileWithMistakes.getNameOfFile(), archiveFailedPath + fileWithMistakes.getNameOfFile());
    }

    public void moveFile(String pathFileWithName, String pathDestination) {
        try {
//            File creator;
//            if (!(creator = new File(pathDestination)).isDirectory() ){ //check IF EXIST and is a directory
//                creator.mkdirs();
//            }
            File fileIn = new File(pathFileWithName);
            File fileOut = new File(pathDestination);

            FileInputStream fIn = new FileInputStream(fileIn);

            FileOutputStream fOut = new FileOutputStream(fileOut);

            byte[] buf = new byte[1024];
            int len;

            while ((len = fIn.read(buf)) > 0) {
                fOut.write(buf, 0, len);
            }

            fIn.close();
            fOut.close();

            fileIn.delete();
        } catch (FileNotFoundException e) {
            logger.error("Error moving files: "+e.getMessage());
        } catch (IOException e) {
            logger.error("Error moving files: "+e.getMessage());
        }

    }

}
