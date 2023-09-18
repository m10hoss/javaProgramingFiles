package ExceptionHandlersSection9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {
        String path = "/Users/armanhossain/IdeaProjects/learning java/src/ExceptionHandlersSection9/test.properties";

        Properties prop =  new Properties();
        FileInputStream fs = new FileInputStream(path);

        prop.load(fs);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
    }

}
