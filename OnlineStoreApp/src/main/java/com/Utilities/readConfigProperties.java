package com.Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class readConfigProperties {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:/Users/akshay/git/com.Project/OnlineStoreApp/src/main/java/com/Utilities/configFile");
        prop.load(ip);
        
        System.out.println(prop.getProperty("Username"));
        System.out.println(prop.getProperty("url"));
		
	}

}
