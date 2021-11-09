package com.Recordatorio.Entrevista.PageObjects;


import com.Recordatorio.Entrevista.Utilities.*;


public class MainPage extends Hook {
	
	
	public void accessToMainPage() throws Exception {
		driver.get(System.getProperty("url"));
	}
	
	

}
