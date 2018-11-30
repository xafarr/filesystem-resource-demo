package com.example.filesystemresourcedemo;

import com.example.filesystemresourcedemo.demo.DemoClass;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Class description here
 *
 * @author Muhammad Zafar (xafarr@gmail.com)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles({"xml"})
public class ResourceXmlConfigTests {

    @Autowired
    private DemoClass demoClass;

    @Test
    public void testPathStringFromResource() throws IOException {
        String externalForm = demoClass.getFileLocation().getURL().toExternalForm();
        String fileLocation = "file:/etc/anyFile";
        Assertions.assertThat(externalForm).isEqualTo(fileLocation);
    }
}
