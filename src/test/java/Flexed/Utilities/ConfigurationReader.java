package Flexed.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFiles;

    static {
        try{
            String path = "configuration.properties";

            FileInputStream input = new FileInputStream(path);

            configFiles = new Properties();

            configFiles.load(input);

            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return configFiles.getProperty(key);
    }
}
