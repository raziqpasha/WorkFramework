package com.testignwithrazu.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// File - read the data from the data.properties -(key, value)
public class propertyReader {
    public static String readKey(String key) {
        Properties p=null;
        try{
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\testignwithrazu\\resource\\data.properities");
            p = new Properties();
            p.load(inputStream);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }

}