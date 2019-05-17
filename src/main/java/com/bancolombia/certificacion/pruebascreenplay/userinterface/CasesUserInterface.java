package com.bancolombia.certificacion.pruebascreenplay.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CasesUserInterface {

	public static final Target BUTTON_CREATE_CASE = Target.the("Boton crear caso").located(By.id("button-create-case"));
	public static final Target INPUT_CASE_DESCRIPTION = Target.the("Descripcion del caso").located(By.id("caseDescription"));
	public static final Target SELECT_CASE_PRIORITY = Target.the("Prioridad del caso").located(By.id("priority"));
	public static final Target PRIORITY_HIGH = Target.the("Prioridad Alta").locatedBy("(//select[@id='priority']/option)[2]");
	public static final Target PRIORITY_MEDIUM = Target.the("Prioridad Medio").locatedBy("(//select[@id='priority']/option)[3]");
	public static final Target PRIORITY_LOW = Target.the("Prioridad Bajo").locatedBy("(//select[@id='priority']/option)[4]");
	public static final Target CHECK_UNASSIGNED = Target.the("Check de sin asignación").located(By.id("routeToUnassigned"));
	public static final Target SELECT_CASE_CATEGORY = Target.the("Seleccionar categoria del caso").located(By.id("caseCategory"));
	public static final Target SELECT_CASE_SUBCATEGORY = Target.the("Seleccionar subcategoria del caso").located(By.id("caseSubcategory"));
	public static final Target SELECT_ROUTE_TO_QUEUE = Target.the("Seleccionar route queue").located(By.id("routeToQueue"));
	public static final Target BUTTON_EMPLOYEE_INDI = Target.the("Boton employee indicator").located(By.id("employeeInd"));
	public static final Target BUTTON_CREATE_CAS = Target.the("Boton para crear el caso").located(By.id("button-create-manual-invest"));

	
	
	
	
	

	
	
	

	
}
