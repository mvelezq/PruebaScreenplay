package com.bancolombia.certificacion.pruebascreenplay.questions;

import static com.bancolombia.certificacion.pruebascreenplay.userinterface.HomePageUI.TITLE_HOME_PAGE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Title implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TITLE_HOME_PAGE).viewedBy(actor).asString();
	}
	
	public static Title ofPage() {
		return new Title();
	}
	
}
