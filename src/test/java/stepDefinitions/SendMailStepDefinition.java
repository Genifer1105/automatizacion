package stepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import question.ValidateSendMail;
import task.LoginTask;
import task.SendMailTask;


public class SendMailStepDefinition {

	@Managed
	 (driver = "chrome")
	 private WebDriver herBrowser;
	
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^El usuario se loguee en la pagina$")
	public void el_usuario_se_loguee_en_la_pagina() {
		theActorCalled("Admin").attemptsTo(Open.url("https://outlook.live.com/owa/"));
		theActorCalled("Admin").wasAbleTo(LoginTask.login("genitatiana@hotmail.com", "Genifer1105*"));
	}

	@When("^Ingrese los datos del correo y lo envie$")
	public void ingrese_los_datos_del_correo_y_lo_envie() {
		theActorCalled("Admin").wasAbleTo(SendMailTask.enviar());
		System.out.println("Se envío el correo");
	}

	@Then("^se debe enviar el correo correctamente$")
	public void se_debe_enviar_el_correo_correctamente() {
	theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSendMail.validarEnvio(), is(true))); 
	
		/*sam.attemptsTo(Enter.theValue("40").into(AGE_FIELD).thenHit(Keys.ENTER),
			    Ensure.that(AGE).text().isEqualTo("40") ); */
		
		System.out.println("Envio de correo exitoso");
	}

	
		 
}
