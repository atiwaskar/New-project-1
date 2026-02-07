package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SiteGenerator {

    public static void main(String[] args) throws IOException {

        File dir = new File("target/site");
        dir.mkdirs();

        try (FileWriter html = new FileWriter("target/site/index.html")) {
            html.write("""
                <!DOCTYPE html>
                <html>
                <head>
                  <title>Java Static Site</title>
                </head>
                <body>
                  <h1>Hello from Java + Maven + GitHub Actions</h1>
                </body>
                </html>
                """);
        }

        try (FileWriter css = new FileWriter("target/site/style.css")) {
            css.write("""
                body {
                    font-family: Arial, sans-serif;
                }
                """);
        }
    }
}
