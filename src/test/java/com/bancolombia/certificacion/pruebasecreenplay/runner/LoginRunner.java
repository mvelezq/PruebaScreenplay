package com.bancolombia.certificacion.pruebasecreenplay.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resource/feature/logueo.feature",
					snippets=SnippetType.CAMELCASE,
					glue="com.bancolombia.certificacion.pruebasecreenplay.definitions")

public class LoginRunner {

	
	
}
