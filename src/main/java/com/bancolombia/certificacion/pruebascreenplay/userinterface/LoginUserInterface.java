package com.bancolombia.certificacion.pruebascreenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUserInterface {

	public static final Target INPUT_USER = Target.the("Field user").located(By.id("username"));
	public static final Target INPUT_PASSWORD = Target.the("Field password").located(By.id("password"));
	public static final Target BUTTON_LOGIN = Target.the("Button loging").locatedBy("//button[@title='Sign In']");
}
