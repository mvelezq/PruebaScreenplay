package com.bancolombia.certificacion.pruebasecreenplay.definitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.bancolombia.certificacion.pruebascreenplay.task.Autentication;
import com.bancolombia.certificacion.pruebascreenplay.task.IngresarCrearCaso;
import com.bancolombia.certificacion.pruebascreenplay.utils.Navegator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateCaseDefinitions {

@Before
	
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
		
	}
	
@Given("^the user is in the create manual case page$")
public void theUserIsInTheCasePage(String user) throws Exception {
	OnStage.theActorCalled(user).can(BrowseTheWeb.with(Navegator.chrome()));
	theActorInTheSpotlight().attemptsTo(Autentication.InSAS());
	OnStage.theActorInTheSpotlight().attemptsTo(IngresarCrearCaso.newCase());
	
}



@When("^the user enter the necessary data$")
public void theUserEnterTheNecessaryData() throws Exception {
    
}

@Then("^the user should see the new case created$")
public void theUserShouldSeeTheNewCaseCreated() throws Exception {
   
}

	
}
