package com.Single_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_Reader {
	
	public static Properties p;
	
	public Test_Reader() throws IOException {

		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Single_Properties\\src\\main\\java\\com\\Single_Properties\\TestCase.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}
	
	public String get_Browser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String get_Url() {
		
		String url = p.getProperty("url");
		
		return url;

	}
	
	public String get_Email() {
		
		String email = p.getProperty("email");
		
		return email;

	}
	
	public String get_Password() {
		
		String password = p.getProperty("password");
		
		return password;

	}
	


	
}
