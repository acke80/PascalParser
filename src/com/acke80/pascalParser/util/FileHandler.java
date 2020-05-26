package com.acke80.pascalParser.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class FileHandler {

    private FileHandler(){
    }

    public static String getFileAsString(String fileName){
        String fileContent = "";

        try{
            fileContent = readFileAsString(fileName);
        }catch (IOException e){
            e.printStackTrace();
        }

        return fileContent;
    }

    private static String readFileAsString(String dir) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                FileHandler.class.getResourceAsStream("/" + dir)));

        String line;

        while ((line = br.readLine()) != null)
            sb.append(line).append("\n");

        br.close();

        return sb.toString();
    }

}
