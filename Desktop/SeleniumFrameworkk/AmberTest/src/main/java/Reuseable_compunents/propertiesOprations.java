package Reuseable_compunents;

import java.io.FileInputStream;
import java.util.Properties;

public  class propertiesOprations {
 
static Properties prop=new Properties();

	public static String get_Properties_by_Key(String Key) throws Exception {
		//Load Data from Properties File 
		
	String Config_path="C:\\Users\\PAWAN\\Desktop\\SeleniumFrameworkk\\AmberTest\\src\\main\\java\\Reuseable_compunents\\propertiesOprations.java";
		
		FileInputStream fi=new FileInputStream(Config_path);
		prop.load(fi);
		String Value =prop.get(Key).toString();
		
		
		
		if (Value.isEmpty())
		{
			throw new Exception ("Value is Not Specified for Key :"+Key +"inProperties file"  );
		}
		return Value;
	}
}
