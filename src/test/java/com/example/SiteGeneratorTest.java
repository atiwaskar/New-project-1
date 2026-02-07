package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;

class SiteGeneratorTest {

    @Test
    void testFilesAreGenerated() throws Exception {
        SiteGenerator.main(null);

        assertTrue(new File("target/site/index.html").exists());
        assertTrue(new File("target/site/style.css").exists());
    }
}
