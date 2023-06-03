package com.Single_Properties;

import java.io.IOException;

public class File_Reader {
	
	private File_Reader() {
		
		
	}
	
	public static File_Reader get_Instance_FR() {
		
		File_Reader fr = new File_Reader();
		
		return fr;

	}
	
	public Test_Reader get_Instance_TR() throws IOException {
		
		Test_Reader tr = new Test_Reader();
		
		return tr;

	}
	
	

	
}
