package com.example.filesystemresourcedemo.demo;

import org.springframework.core.io.Resource;

/**
 * Class description here
 *
 * @author Muhammad Zafar (xafarr@gmail.com)
 */
public class DemoClass {

    private Resource fileLocation;

    public DemoClass() {
    }

    public Resource getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(Resource fileLocation) {
        this.fileLocation = fileLocation;
    }
}
