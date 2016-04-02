/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author Princa
 */
public class FileRead {

    private String path;
    
    public FileRead(String path) {
        this.path = path;
    }

    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        int i;

        for (i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }
    int readLines() throws IOException{
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        
        while ((aLine=bf.readLine())!= null){
            numberOfLines++;
        }
        bf.close();
        
        return numberOfLines;
    }
}