package org.example.day13.propetiesdata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertiesFile {
    private static final Logger log= LogManager.getLogger(ReadingDataFromPropertiesFile.class);
    public static void main(String[] args) throws IOException {
        log.info("Properties file object created");
        Properties properties=new Properties();
        log.info("Reading data from config file");
        FileInputStream inputStream=new FileInputStream(new File("src/main/resources/config.properties"));
        log.info("data loaded into the properties object");
        properties.load(inputStream);
        log.info("Print the user name");
        System.out.println(properties.getProperty("user"));
        log.info(properties.getProperty("user"));
        log.info("Print the password");
        System.out.println(properties.getProperty("password"));
        log.info(properties.getProperty("password"));
        log.info("data clearing........");
        properties.clear();
        log.info("Data cleard.....");
    }
}
