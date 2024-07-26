package com.E_commerce.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
public String getDataFromPropertiesFile(String key) throws IOException {
	
	FileInputStream fis=new FileInputStream("./configAppdata/commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
}
}
