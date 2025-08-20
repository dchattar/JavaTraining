package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessor {

    public void processFile(String inputFilePath) throws IOException {
        File inputFile = new File(inputFilePath);

         List<String> lines = Files.lines(inputFile.toPath())
                            .filter(line -> !line.startsWith("#"))
                            .map(String::trim) // Trim whitespace from each line
                            .filter(line -> !line.isEmpty()) // Filter out empty lines
                            .map(String::toUpperCase) // Convert each line to uppercase
                            .collect(Collectors.toList());

           System.out.println(lines);
        }

    public static void main(String[] args) {
        FileProcessor fileObje = new FileProcessor();
        try {
            fileObje.processFile("/Users/dchattar/IdeaProjects/JavaTraining/README.md");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}