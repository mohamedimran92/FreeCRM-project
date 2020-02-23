package util;


import java.io.FileReader;
import java.util.Properties;

public class TestUtil {
	protected static Properties prop;
	
	public void propertiesFileReader() throws Exception{
		prop=new Properties();
	FileReader reader = new FileReader("C:\\Users\\sumi\\workspace\\FreeCRM\\src\\main\\java\\config\\config.properties");
			prop.load(reader);
}
	
}

/*
 * Utility Class (AKA Functions Class): Utility class (TestUtil.java) stores and
 * handles the functions (The code which is repetitive in nature such as waits,
 * actions, capturing screenshots, accessing excels, sending email etc.,) which
 * can be commonly used across the entire framework. The reason behind creating
 * utility class is to achieve reusability. This class extends the TestBase
 * class to inherit the properties of TestBase in TestUtil.
 */
