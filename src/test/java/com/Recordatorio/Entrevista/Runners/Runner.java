package com.Recordatorio.Entrevista.Runners;

//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//
//import cucumber.api.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = { "src/test/resources/features/" }, 
//				glue = {"com.Recordatorio.Entrevista.StepsDefinition"})

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = { "src/test/resources/features/" },
 glue = {"com.Recordatorio.Entrevista.StepsDefinition" , "com.Recordatorio.Entrevista.Utilities"},
 tags = {"@ValidationOne"})
public class Runner {

}
