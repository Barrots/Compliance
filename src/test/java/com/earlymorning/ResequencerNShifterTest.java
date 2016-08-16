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
import static org.junit.Assert.assertTrue;

/**
 * Created by Dario on 11/08/2016.
 */
@Configuration
@PropertySource("classpath:META-INF.com.earlymorning.properties.InboundFile.properties")
public class ResequencerNShifterTest {

    private ResequencerNShifter controller;
    @Value("${path.file.test}")
    private String pathFileTest= "src/test/resources/input/test/";
    private static final Logger logger = LoggerFactory.getLogger(ResequencerNShifterTest.class);

    @org.junit.Before
    public void setUp() throws Exception {
        controller = new ResequencerNShifter();
    }

    @org.junit.Test
    public void insertTimeStampInNameTest() throws Exception {

        String nameOfTheFile="fileWithNoTS";
        InboundFile testFileWithNoTS= new InboundFile(1, nameOfTheFile , new Date().getTime(), pathFileTest);
        File checker =new File( pathFileTest + nameOfTheFile );
        checker.createNewFile();
        controller.insertTimeStampInName(testFileWithNoTS);
        assertTrue("The file didn't changed his name", !checker.getName().equalsIgnoreCase(testFileWithNoTS.getNameOfFileWithoutExt()));
        File deleter =new File( pathFileTest + testFileWithNoTS.getNameOfFile() );
        deleter.delete();

    }

}