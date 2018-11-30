package com.example.filesystemresourcedemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.FileSystemResource;

/**
 * Class description here
 *
 * @author Muhammad Zafar (xafarr@gmail.com)
 */
@Configuration
@Profile("java")
public class DemoConfig {

    private String fileLocation;

    public DemoConfig(@Value("${file.location}") String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Bean
    public DemoClass demoClass() {
        DemoClass demoClass = new DemoClass();
        demoClass.setFileLocation(new FileSystemResource(fileLocation));
        return demoClass;
    }
}
