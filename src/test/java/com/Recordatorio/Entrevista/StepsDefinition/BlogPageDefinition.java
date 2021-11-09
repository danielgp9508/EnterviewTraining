package com.Recordatorio.Entrevista.StepsDefinition;



import com.Recordatorio.Entrevista.PageObjects.BlogPage;
import com.Recordatorio.Entrevista.PageObjects.MainPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPageDefinition {
	
	private BlogPage blogPage;
	
	public BlogPageDefinition() {
		blogPage = new BlogPage();
	}

	 
	
	
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
