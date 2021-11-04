package com.Recordatorio.Entrevista.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import com.Recordatorio.Entrevista.Utilities.Hook;

public class Utilities{
	
	//WebDriver driver = Hook.driver;
	
	public void ImplicitWait(long time) {
		Hook.driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	public void click(By by) {
		Hook.driver.findElement(by).click();
	}
	
	public void sendKeys(By by, String element) {
		Hook.driver.findElement(by).sendKeys(element);
	}
	
	public void scrollToWebElement(WebElement element) {
		new Actions(Hook.driver).moveToElement(element).build().perform();
		
	}
	
}
