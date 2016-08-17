package com.earlymorning;

import com.earlymorning.model.ClientGenerali;
import com.earlymorning.model.InboundFile;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by root on 16/08/16.
 */




/**
 * Created by Dario on 11/08/2016.
 */
@ContextConfiguration(classes = {App.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class GlobalCompanyReaderTest {


    private static final Logger logger = LoggerFactory.getLogger(GlobalCompanyReaderTest.class);

    private GlobalCompanyReader controller;

    @Value("${path.file.test}")
    private String pathTest;

    @Value("${name.file.export.global.company}")
    private String nameGlobalCompanyFileTest;

    @org.junit.Before
    public void setUp() throws Exception {
        controller = new GlobalCompanyReader();
    }

    @org.junit.Test
    public void convertCsvToListTest() throws Exception {


        logger.debug("nameGlobalCompanyFileTest: " + nameGlobalCompanyFileTest);
        assertTrue(nameGlobalCompanyFileTest != null && !nameGlobalCompanyFileTest.equals(""));

        logger.debug("pathTest: " + pathTest);
        assertTrue(pathTest != null && !pathTest.equals(""));

        File gcFile = new File(pathTest + nameGlobalCompanyFileTest);
        logger.debug(gcFile.getAbsolutePath());
        InboundFile globalCompanyFile = new InboundFile(1, nameGlobalCompanyFileTest, gcFile.lastModified(),
                pathTest);

        List<ClientGenerali> generaliList = controller.convertCsvToList(globalCompanyFile);
        assertTrue("The Result list is empty", generaliList.size() > 1);

        for (ClientGenerali clientGenerali : generaliList) {
            logger.debug(clientGenerali.toString());
//            System.out.println(clientGenerali);
        }
    }

}