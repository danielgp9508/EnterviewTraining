package com.Recordatorio.Entrevista.StepsDefinition;




import com.Recordatorio.Entrevista.PageObjects.MainPage;

import io.cucumber.java.en.Given;

public class MainPageDefinition {
	
	private MainPage mainPage;
	
	public MainPageDefinition() {
		mainPage = new MainPage();
	}

	@Given("^Access to URL$")
	public void mainPageAccess() throws Exception {
		mainPage.accessToMainPage();
	}
		

}
