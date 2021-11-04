package com.Recordatorio.Entrevista.StepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.Recordatorio.Entrevista.PageObjects.BlogPage;
import com.Recordatorio.Entrevista.PageObjects.MainPage;

public class MainPageDefinition {
	
	@Steps
	MainPage mainPage;
	
	@Given("^Access to URL$")
	public void mainPageAccess() throws Exception {
		mainPage.accessToMainPage();
	}
		

}
