
package MainSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinu-Laptop
 */
public class SystemConfig {
    
public static String DB_Urls = null;
public static String DB_Port = null;
public static String DB_Name = null;
public static String DB_Username = null;    
public static String DB_Password = null;

    public SystemConfig() {
        Properties prop = new Properties();
	InputStream input = null;

    try {
        input = new FileInputStream("config.properties");
        } 
    catch (FileNotFoundException ex) {
        Logger.getLogger(SystemConfig.class.getName()).log(Level.SEVERE, null, ex);
    }


        if(input==null){
    	    System.out.println("Sorry,Config File missing ");
            JOptionPane.showMessageDialog(null,"Sorry,Config File missing= Default will be created", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            Properties prop1 = new Properties();
            OutputStream output1 = null;

            try {

		output1 = new FileOutputStream("config.properties");

		// set the properties value
		prop1.setProperty("DB_Urls", "itp2016ver1fdgd.cht0bvbob1wj.us-west-2.rds.amazonaws.com");
                prop1.setProperty("DB_Port", "3306");
                prop1.setProperty("DB_Name", "garmentsystem");
		prop1.setProperty("DB_Username", "rosliit216v");
		prop1.setProperty("DB_Password", "JS9sd56dss5");

		// save properties to project root folder
		prop1.store(output1, null);

            } catch (IOException io) {
		io.printStackTrace();
            } finally {
		if (output1 != null) {
			try {
				output1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

            }
    	}
    // CLOSING FIRST CONNECTION
    if (input != null) 
    {
        try {
        input.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
        
    }
    
    public void setSystemConfig(String DBurl,String DBport,String DBName,String DBUserName,String DBpassword)
    {
    Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.properties");

		// set the properties value
		prop.setProperty("DB_Urls", DBurl);
                prop.setProperty("DB_Port", DBport);
                prop.setProperty("DB_Name", DBName);
		prop.setProperty("DB_Username", DBUserName);
		prop.setProperty("DB_Password", DBpassword);

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
    
    }
    public void getSystemConfig(){
    Properties prop = new Properties();
	InputStream input = null;

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
                System.out.println(prop.getProperty("DB_Urls"));
                DB_Urls=prop.getProperty("DB_Urls");
                System.out.println(prop.getProperty("DB_Port"));
                DB_Port=prop.getProperty("DB_Port");                
		System.out.println(prop.getProperty("DB_Name"));
                DB_Name=prop.getProperty("DB_Name");
		System.out.println(prop.getProperty("DB_Username"));
                DB_Username=prop.getProperty("DB_Username");
		System.out.println(prop.getProperty("DB_Password"));
                DB_Password=prop.getProperty("DB_Password");

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

    }
    
    

}
