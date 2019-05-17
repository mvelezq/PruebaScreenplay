package com.bancolombia.certificacion.pruebasecreenplay.definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;

import org.hamcrest.core.StringContains;

import com.bancolombia.certificacion.pruebascreenplay.questions.Title;
import com.bancolombia.certificacion.pruebascreenplay.task.Autentication;
import com.bancolombia.certificacion.pruebascreenplay.utils.Navegator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginDefinitions {
	
	@Before
	
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
		
	}

	@Given("^the (.*) is in the SAS AML home page$")
	public void theUserIsInTheSASAMLHomePage(String user){
	    OnStage.theActorCalled(user).can(BrowseTheWeb.with(Navegator.chrome()));;
	}

	@When("^the user enter the credentials$")
	public void theUserEnterTheCredentials()  {
	   theActorInTheSpotlight().attemptsTo(Autentication.InSAS());
	}

	@Then("^the user should see the tittle (.*)$")
	public void theUserShouldSeeTheTittleSASAntiMoneyLaundering(String titleHome) {
	    theActorInTheSpotlight().should(seeThat(Title.ofPage(), containsString(titleHome)));
	}

	
}
