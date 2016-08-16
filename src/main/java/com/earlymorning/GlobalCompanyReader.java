package com.earlymorning;

import com.earlymorning.model.ClientGenerali;
import com.earlymorning.model.InboundFile;
import com.earlymorning.model.ItemAsRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16/08/16.
 */

@Configuration
@PropertySource("classpath:META-INF.com.earlymorning.properties.InboundFile.properties")
@Component
public class GlobalCompanyReader {

    @Value("${path.file.input}")
    private static String pathInput = "src/test/resources/input/";
    @Value("${name.file.export.global.company}")
    private static String nameGlobalCompanyFile = "GlobalCompany.csv";

    private FileReader fstreamIn;
    private BufferedReader in;
    private List<ClientGenerali> listCLients = new ArrayList();

    private static final Logger logger = LoggerFactory.getLogger(GlobalCompanyReader.class);

    public GlobalCompanyReader() {
    }

    public List<ClientGenerali> convertCsvToList(InboundFile globalCompanyFile) {
        initRead(globalCompanyFile);
        int numClientsAffected = InsertInListAllClients(globalCompanyFile);
        try {
            in.close();
            fstreamIn.close();
        } catch (IOException e) {
            logger.error("Error closing file after splitting it: " + e.getMessage());
        }
        if (numClientsAffected > -1) {
            return listCLients;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        long numFile = 0;
        File gcFile = new File(pathInput);
        for (File controllerForGCF : gcFile.listFiles()) {
            if (controllerForGCF.getName().equalsIgnoreCase(nameGlobalCompanyFile)) {
                InboundFile globalCompanyFile = new InboundFile(numFile, nameGlobalCompanyFile, controllerForGCF.lastModified(),
                        pathInput);
                GlobalCompanyReader gCR = new GlobalCompanyReader();
                gCR.convertCsvToList(globalCompanyFile);
                break;
            }
        }
    }

    public void initRead(InboundFile fileToOpen) {
        try {
            fstreamIn = new FileReader(fileToOpen.getFilePath() + fileToOpen.getNameOfFile());
            in = new BufferedReader(fstreamIn);

        } catch (FileNotFoundException e) {
            logger.info("Error opening file: " + e.getMessage());
        }
    }

    public int InsertInListAllClients(InboundFile fileToOpen) {
        int numClientAffected = 0;
        try {
            String line;
            while ((line = in.readLine()) != null) {
                if (numClientAffected != 0) {

                    ClientGenerali row = new ClientGenerali(line, ";");
                    numClientAffected++;
                    listCLients.add(row);
                }
                numClientAffected++;
            }
        } catch (IOException e) {
            logger.error("Error reading file, the list result will be null. Exception: " + e.getMessage());
            return -1;
        }
        return numClientAffected;
    }
}
