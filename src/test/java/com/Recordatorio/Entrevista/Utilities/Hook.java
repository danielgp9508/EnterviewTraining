package com.Recordatorio.Entrevista.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hook  {
	
	
	public static WebDriver driver;
	public static String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "properties" + File.separator + 
			"application.properties";
	
	
	
	
	@Before
	public static void  chromeDriverConnection() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties prop = new Properties();
		Properties systemProperties = System.getProperties();
		prop.load(new FileInputStream(path));
		System.setProperties(prop);
		prop.putAll(systemProperties);
	}
	
	@After
	public static void quit() {	
		//driver.quit();
	}
	


}
