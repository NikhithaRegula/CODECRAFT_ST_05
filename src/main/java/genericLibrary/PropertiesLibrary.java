package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameworkConstant{

	public FileInputStream fis;
	public FileOutputStream fos;
	public Properties propertyobj;

	public String readData(String key) {

		try {
			fis = new FileInputStream(propertiespath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		propertyobj = new Properties();

		try {
			propertyobj.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return propertyobj.getProperty(key);
	}
}

