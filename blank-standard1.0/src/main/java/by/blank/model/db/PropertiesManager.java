package by.blank.model.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    public static Properties getProperties(String filiPath){
        Properties props = new Properties();
        try(FileReader fr = new FileReader(Thread.currentThread().getContextClassLoader().getResource(filiPath).getPath())) {
            props.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}
