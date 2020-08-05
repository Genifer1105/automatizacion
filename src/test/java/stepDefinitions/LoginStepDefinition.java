package stepDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import question.ValidateLogin;
import task.LoginTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.WebDriver;



public class LoginStepDefinition {
	
	
	@Managed
	 (driver = "chrome")
	 private WebDriver herBrowser;
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast()); 
	}
		
	@Given("^El usuario ingrese al link de la pagina$")
	public void el_usuario_ingrese_al_link_de_la_pagina() {
		theActorCalled("Admin").attemptsTo(Open.url("https://outlook.live.com/owa/"));
	}

	@When("^El usuario de ingrese sus credenciales$")
	public void el_usuario_de_ingrese_sus_credenciales() {
		theActorCalled("Admin").wasAbleTo(LoginTask.login("genitatiana@hotmail.com", "Genifer1105*")); 
	    System.out.println("Ingreso credenciales");
	}

	@Then("^El usuario debe visualizar la pagina de inicio$")
	public void el_usuario_debe_visualizar_la_pagina_de_inicio() {	
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(
				ValidateLogin.validarLogin(),is(true)));
	
	}
	
 /* System.out.println(ValidateLogin.opciones());
		theActorInTheSpotlight().asksFor(ValidateLogin.opciones().equals("true"));
		theActorInTheSpotlight().should(seeThat(ValidateLogin.opciones(),is(true))); */

	
}
