package com.earlymorning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("classpath:META-INF/com/earlymorning/properties/InboundFile.properties")
@ComponentScan({"com.earlymorning.*"})
@Import({SplitterNChecker.class})
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
