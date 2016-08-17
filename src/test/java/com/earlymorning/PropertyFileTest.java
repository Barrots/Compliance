package com.earlymorning;

import com.earlymorning.conf.SampleConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by bizza on 17/08/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SampleConfiguration.class})
public class PropertyFileTest {

    private static final Logger logger = LoggerFactory.getLogger(PropertyFileTest.class);

    @Value("${pippo}")
    private String pippo;

    @Test
    public void testGetProperty() throws Exception {

        logger.debug("pippo: " + pippo);
        assertTrue(pippo != null && !pippo.equals(""));


    }
}
