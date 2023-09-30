package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigProperties {
    public static void main(String[] args) throws IOException {
        //Locate the file
        // String path = "C:\\Users\\salih\\IdeaProjects\\gitProjects\\SDET Batch 17\\Files\\Config.properties";
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        //System.out.println(path);
        //Moves the file from permanent storage into the RAM
        FileInputStream fis = new FileInputStream(path);
        //That one class/software that will assist us to read write data from the file
        Properties properties = new Properties();
        //Loads the data from txt file into the
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("fbgddf"));
        System.out.println(properties.get("URL"));
        // This line here gives the location of your intellij project on your computer
        System.out.println(System.getProperty("user.dir"));


    }
}
