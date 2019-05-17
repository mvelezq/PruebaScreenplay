package com.bancolombia.certificacion.pruebascreenplay.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Navegator {

	public static WebDriver chrome() {
		WebDriver driver;

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://lbmdebdsas01v.ambientesbc.lab:8343/SASComplianceSolutionsMid");
		
		return driver;
	}
	

	
}
