package managers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManagers {
    private static Properties properties;

    public static void initializeProperties(){
        properties = new Properties();
        String propertiesFilePath = "src/main/resources/config.properties";

        try {
            properties.load(new FileReader(propertiesFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowserType(){
        if (properties == null) initializeProperties();
        String browserType = properties.getProperty("browserType");

        if (browserType != null){
            return browserType;
        } else {
            throw new RuntimeException("The browser type was not defined");
        }
    }

    public static String getApplicationURL(){
        if (properties == null) initializeProperties();
        String url = properties.getProperty("url");

        if (url != null){
            return url;
        } else {
            throw new RuntimeException("The browser type was not defined");
        }
    }
}
