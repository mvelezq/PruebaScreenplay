package com.bancolombia.certificacion.pruebascreenplay.task;

import static com.bancolombia.certificacion.pruebascreenplay.userinterface.LoginUserInterface.BUTTON_LOGIN;
import static com.bancolombia.certificacion.pruebascreenplay.userinterface.LoginUserInterface.INPUT_PASSWORD;
import static com.bancolombia.certificacion.pruebascreenplay.userinterface.LoginUserInterface.INPUT_USER;

import com.bancolombia.certificacion.pruebascreenplay.userinterface.LoginUserInterface;
import com.bancolombia.certificacion.pruebascreenplay.utils.Read;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autentication implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(Read.propertie("user")).into(INPUT_USER),
				Enter.theValue(Read.propertie("password")).into(INPUT_PASSWORD),
				Click.on(BUTTON_LOGIN)
				);
		
		
	}
	
	public static Autentication InSAS() {
		return new Autentication();
	}
	
}
