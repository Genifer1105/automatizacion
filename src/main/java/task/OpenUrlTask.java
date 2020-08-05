package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.LoginUI;

public class OpenUrlTask implements Task {

	private LoginUI page;
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}
	
	
	public static Performable enterToLink() {
		return instrumented(OpenUrlTask.class);
	
	}
	
}


