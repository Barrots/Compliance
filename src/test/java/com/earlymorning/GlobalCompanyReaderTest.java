package com.earlymorning;

import com.earlymorning.model.InboundFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by root on 16/08/16.
 */




/**
 * Created by Dario on 11/08/2016.
 */
@Configuration
@PropertySource("classpath:META-INF.com.earlymorning.properties.InboundFile.properties")
public class GlobalCompanyReaderTest {


    private GlobalCompanyReader controller;
    @Value("${path.file.test}")
    private static String pathTest = "src/test/resources/input/test/";
    @Value("${name.file.export.global.company.test}")
    private static String nameGlobalCompanyFileTest = "GlobalCompanyTest.csv";

    private static final Logger logger = LoggerFactory.getLogger(GlobalCompanyReaderTest.class);

    @org.junit.Before
    public void setUp() throws Exception {
        controller = new GlobalCompanyReader();
    }

    @org.junit.Test
    public void convertCsvToListTest() throws Exception {

        File gcFile = new File(pathTest + nameGlobalCompanyFileTest);
        InboundFile globalCompanyFile = new InboundFile(1, nameGlobalCompanyFileTest, gcFile.lastModified(),
                pathTest);

        assertTrue("The Result list is empty",controller.convertCsvToList(globalCompanyFile).size() > 1);
    }

}