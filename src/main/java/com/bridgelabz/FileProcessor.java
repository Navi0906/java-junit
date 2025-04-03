package com.bridgelabz;

import java.io.*;
public class FileProcessor {
    public void writeToFile(String filename, String content){
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;

        while((line = reader.readLine())!=null){
            content.append(line).append("\n");
        }
        return content.toString().trim();
    }
}
