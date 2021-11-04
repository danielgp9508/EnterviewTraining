package com.Recordatorio.Entrevista.StepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.Recordatorio.Entrevista.PageObjects.BlogPage;
import com.Recordatorio.Entrevista.PageObjects.MainPage;

public class BlogPageDefinition {
	
	@Steps
	BlogPage blogPage;
	
	
	@When("^Open Blog section$")
	public void openBlogSection() throws Exception {
		blogPage.openBlogSection();
	}
	
	@And("^Serch specific post by name (.*)$")
	public void serchPost(String postName) throws InterruptedException {
		blogPage.serchPost(postName);
	}
	
	@Then("^Validate inside the Blog (.*)$")
	public void validateSelectedBlog(String postName) throws InterruptedException {
		blogPage.validateSelectedBlog(postName);
	}
	
	@When("^Suscribe to the newsletter (.*)$")
	public void suscribeNewsletter(String mail){
		blogPage.suscribeNewsletter(mail);
	}
	
	@Then("^Validate Suscription$")
	public void validateSuscription() {
		blogPage.validateSuscription();
	}
	
	@And("^Print all Blogs$")
	public void printBlogs() {
		blogPage.printBlogs();
	}

}
