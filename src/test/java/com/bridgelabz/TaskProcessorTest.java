package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskProcessorTest {
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void longTaskTest() throws InterruptedException{
        TaskProcessor processor = new TaskProcessor();
        String result = processor.longRunningTask();
        assertEquals("Task Completed!", result);
    }
}
