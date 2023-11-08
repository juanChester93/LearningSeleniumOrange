package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

    public static String getPropertyData(String key) {
        File file = new File("C:\\Users\\juan.gonzales\\Desktop\\testData.properties");

        try{
            FileReader reader = new FileReader(file);
            Properties prop = new Properties();
            prop.load(reader);
            return prop.get(key).toString();
        }catch(FileNotFoundException fne) {
            System.out.println("The specified file could not be found");
        }catch(IOException ioe) {
            System.out.println("File could not be loaded");
        }
        return "";
    }
}
