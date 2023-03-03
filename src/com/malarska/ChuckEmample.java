package com.malarska;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckEmample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream));
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                System.out.println(line.substring(line.indexOf("\"value\":")+8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
