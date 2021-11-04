package com.Recordatorio.Entrevista.PageObjects;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Recordatorio.Entrevista.Utilities.*;


public class BlogPage extends Hook {
	
	Utilities utilities = new Utilities();
	
	By btnBlogMenu = By.id("menu-item-3960");
	
	public List<WebElement> lblBlogName() {
		return driver.findElements(By.xpath("//article/div[@class='post-template__info']/h2/a"));
	} 
	
	By lblBlogName = By.xpath("//article/div[@class='post-template__info']/h2");
	By btnNumberBlogPages = By.className("page-item");
	public WebElement btnBlogPage(String page) {
		return driver.findElement(By.xpath("//li[@class='page-item']//*[contains(text(),'"+ page + "')]"));
	}
	By lblBlogTitle = By.xpath("//h1");
	By inputEmailSuscription = By.name("EMAIL");
	By btnSuscribe = By.cssSelector("button[type='submit']");
	By lblSuccessSuscribe = By.xpath("//form[@id='mc4wp-form-1']//p");


	
	
	public void openBlogSection() throws Exception {
		utilities.click(btnBlogMenu);
	}
	
	public void serchPost(String postName) throws InterruptedException {
		boolean post = false;
		try {
			for(int i = 0; i < driver.findElements(btnNumberBlogPages).size() ; i++) {
				for(int j = 0; j < lblBlogName().size(); j++) {
					if(lblBlogName().get(j).getText().equals("Why Fintech in Latin America Is Having a Boom")) {
						System.out.println(lblBlogName().get(j).getText());
						lblBlogName().get(j).click();
						post = true;
						break;
					}
					else {
						post = false;
					}
				}
				if(post) {
					break;
				}else {
					btnBlogPage(String.valueOf(i + 1)).click();
				}
			}
		}catch(Exception e) {
			System.out.println("Some error happpens " + e);
		}
		
	}
	
	public void validateSelectedBlog(String postName)  {
		String currentURL = driver.getCurrentUrl();
		
		assertEquals(System.getProperty("blog.url"), currentURL);
		assertEquals(postName, driver.findElement(lblBlogTitle).getText());
	}
	
	public void suscribeNewsletter(String mail){
		try {
			utilities.scrollToWebElement(driver.findElement(btnSuscribe));
			utilities.sendKeys(inputEmailSuscription, mail);
			utilities.click(btnSuscribe);
		}catch(Exception e) {
			System.out.println("Some error happpens " + e);
		}
	}
	
	public void validateSuscription() {
		assertEquals(System.getProperty("suscription.message"), driver.findElement(lblSuccessSuscribe).getText());
	}
	
	public void printBlogs() {
		utilities.scrollToWebElement(driver.findElement(btnBlogMenu));
		utilities.click(btnBlogMenu);
		for(int i = 1; i < driver.findElements(btnNumberBlogPages).size() ; i++) {
			btnBlogPage(String.valueOf(i)).click();
			for(int j = 0; j < lblBlogName().size(); j++) {
				utilities.scrollToWebElement(lblBlogName().get(j));
				System.out.println("Titulo blog : " + lblBlogName().get(j).getText() + 
						" related link: "+ lblBlogName().get(j).getAttribute("href"));
			}
		}
	}

}
