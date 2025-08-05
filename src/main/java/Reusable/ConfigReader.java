package Reusable;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {


    private Properties prop;

    public ConfigReader(){
        prop = new Properties();

       try( FileInputStream file = new FileInputStream("src/main/resources/Config.properties")){
           prop.load(file);
       }catch(Exception e){
           e.printStackTrace();
       }

    }

    public String getProperty(String key){
        String value = prop.getProperty(key);
        if(value==null){
            System.out.println("Warning : Key : "+key+" is missing in config file....");
            return "";
        }
        return value;
    }


}
