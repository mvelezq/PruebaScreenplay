package com.bancolombia.certificacion.pruebascreenplay.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Read {

	public static String propertie(String value) {
		Properties propertie=new Properties();
		try {
			InputStream file = new FileInputStream("datos.properties");
			propertie.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertie.getProperty(value);
		
	}
}
