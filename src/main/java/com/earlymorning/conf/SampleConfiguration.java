package com.earlymorning.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by bizza on 17/08/16.
 */
@Configuration
@PropertySource(value={"classpath:META-INF/com/earlymorning/properties/InboundFile.properties"})
//@PropertySource(value={"/Users/bizza/bizzozero_consulting/projects/Compliance/src/test/resources/META-INF/com/earlymorning/properties/InboundFile.properties"})
//@ComponentScan({"com.earlymorning.*"})
public class SampleConfiguration {

    /**
     * Property placeholder configurer needed to process @Value annotations
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
