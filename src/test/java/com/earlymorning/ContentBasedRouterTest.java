package com.earlymorning;

import com.earlymorning.model.InboundFile;
import org.joda.time.DateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Dario on 10/08/2016.
 */
@Configuration
@PropertySource("classpath:META-INF.com.earlymorning.properties.InboundFile.properties")
public class ContentBasedRouterTest {

    @Value("${archive.failed.path}")
    private String archiveFailedPath = "src/test/resources/output/errorsFile/";
    @Value("${path.file.test}")
    private String pathFileTest = "src/test/resources/input/test/";
    @Value("${max.interval.arrival")
    private String maxIntervalArrivalDay = "2";

    private ContentBasedRouter controller;
    private static final Logger logger = LoggerFactory.getLogger(ContentBasedRouterTest.class);

    @org.junit.Before
    public void setUp() throws Exception {
        controller = new ContentBasedRouter();
    }

    @org.junit.Test
    public void checkOnTimeTest() throws Exception {
        int afterNDays= Integer.parseInt(maxIntervalArrivalDay);
        File fileArrived = new File(pathFileTest + "report.csv");
        if (!fileArrived.exists()){
            fileArrived.createNewFile();
        } else{
            fileArrived.delete();
            fileArrived.createNewFile();
        }
        File fileArrivedOld = new File(pathFileTest + "reportOld.csv");
        if (!fileArrivedOld.exists()){
            fileArrivedOld.createNewFile();
        }else{
            fileArrivedOld.delete();
            fileArrivedOld.createNewFile();
        }

        InboundFile testFileNew = new InboundFile(1, "report.csv", fileArrived.lastModified(),pathFileTest);
        InboundFile testFileOld = new InboundFile(1, "reportOld.csv", fileArrived.lastModified()- TimeUnit.MILLISECONDS.convert(afterNDays, TimeUnit.DAYS) *2 , pathFileTest);

            assertFalse("The InboundFile was beyond the limit time of arrival but ContentBasedRouter returned true",
                    controller.checkOnTime(testFileNew, testFileOld));
    }

    @Test
    public void checkIntegrityTest() throws Exception {
        InboundFile testFileWhole= new InboundFile(2, "testFile.csv", new Date().getTime(), pathFileTest);
        InboundFile testFileTemp = new InboundFile(3, "testFile.csv.temp", new Date().getTime(), pathFileTest);

        assertTrue("The file was not whole but ContentBasedRouter returned true", controller.checkIntegrity(testFileWhole));
        assertFalse("The file was whole but ContentBasedRouter returned false", controller.checkIntegrity(testFileTemp));
    }

    @Test
    public void sendFileToErrorListTest() throws Exception {
        String nameOfTheFile="fileThrash.csv";
        InboundFile testFileInTheTrash= new InboundFile(4, nameOfTheFile , new Date().getTime(), pathFileTest);
        File checker =new File( pathFileTest + nameOfTheFile );
        checker.createNewFile();
        File createDelete;
        if (!( createDelete= new File(archiveFailedPath)).isDirectory()){
            createDelete.mkdirs();
        }
        controller.sendFileToErrorList(testFileInTheTrash);
        createDelete = new File( archiveFailedPath + nameOfTheFile );
        assertTrue("The file with errors is not in the archive",createDelete.exists() );
        checker.delete();
        if (createDelete.exists()) createDelete.delete();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}