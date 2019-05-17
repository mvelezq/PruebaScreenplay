package com.bancolombia.certificacion.pruebascreenplay.task;

import static com.bancolombia.certificacion.pruebascreenplay.userinterface.HomePageUI.CASE_BUTTON;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarCrearCaso implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CASE_BUTTON));
		
	}

	public static IngresarCrearCaso newCase() {
		return new IngresarCrearCaso();
	}
}
