package com.example.filesystemresourcedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/demo-config.xml"})
public class FilesystemResourceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilesystemResourceDemoApplication.class, args);
    }
}
