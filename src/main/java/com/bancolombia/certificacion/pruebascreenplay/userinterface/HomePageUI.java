package com.bancolombia.certificacion.pruebascreenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

	public static final Target TITLE_HOME_PAGE = Target.the("Titulo de la pagina principal").locatedBy("//span[@ng-bind-html='::vm.resources.aml.navbar.title']");
	public static final Target CASE_BUTTON= Target.the("Boton de casos en pagina principal").locatedBy("(//button[@ng-class='{ active : vm.$state.includes(area.state.name, area.state.params) }'] )[2]");
	
	
}
