package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;

public class LoginTask implements Task {

	private final String usuario;
	private final String contrasena;

	public LoginTask(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Click.on(LoginUI.BTN_INICIAR_SESION));

		actor.attemptsTo(Enter.theValue(usuario).into(LoginUI.INP_CORREO));

		actor.attemptsTo(Click.on(LoginUI.BTN_SIGUIENTE));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actor.attemptsTo(Enter.theValue(contrasena).into(LoginUI.INP_CONTRASENA));

		actor.attemptsTo(Click.on(LoginUI.BTN_INGRESAR));
	}

	
	public static Performable login(String usuario, String contrasena) {
		return instrumented(LoginTask.class, usuario, contrasena); /* uarios y contra */

	}
}
