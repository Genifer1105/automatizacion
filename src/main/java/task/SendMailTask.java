package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import ui.HomeUI;
import ui.NewMailUI;

public class SendMailTask implements Task {

	public <T extends Actor> void performAs(T actor) {

		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		actor.attemptsTo(Click.on(HomeUI.BTN_MENSAJE_NUEVO));
		
					
		actor.attemptsTo(Enter.theValue("genifer1105@gmail.com").into(NewMailUI.INP_PARA));
		 		
      /*  actor.attemptsTo(Hit.the(Keys.ENTER).into(NewMailUI.INP_PARA)); */
		
		actor.attemptsTo(Hit.the(Keys.ENTER).into(NewMailUI.INP_PARA));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		actor.attemptsTo(Enter.theValue("Prueba").into(NewMailUI.INP_ASUNTO));

		actor.attemptsTo(Enter.theValue("Descripción de amoecito").into(NewMailUI.INP_CUERPO_CORREO));
	
		actor.attemptsTo(Click.on(NewMailUI.BTN_ENVIAR));
	
	}

	public static Performable enviar() {
		return instrumented(SendMailTask.class); 

	}
}
