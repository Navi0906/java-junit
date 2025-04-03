package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {
    private final String testFile = "src/test/java/com/bridgelabz/testFile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp(){
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void remove(){
        File file = new File(testFile);
        if(file.exists()){
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException{
        String content = "Welcome to test case!!!";
        fileProcessor.writeToFile(testFile,content);

        String readContent = fileProcessor.readFromFile(testFile);
        assertEquals(content,readContent);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException{
        fileProcessor.writeToFile(testFile,"Demo testing!!");
        File file = new File(testFile);
        assertTrue(file.exists());
    }

    @Test
    void testReadNotExistException(){
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("donotexist.txt"));
    }
}
