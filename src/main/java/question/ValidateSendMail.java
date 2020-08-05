package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.NewMailUI;


public class ValidateSendMail implements Question<Object> {

	@Override
	public Object answeredBy(Actor actor) {
		
		boolean tituloVisible = true;
		
		tituloVisible = NewMailUI.TITULO_CONFIG.resolveFor(actor).isVisible();
		
		if (tituloVisible = true) {
			return true;
		} else {
			return false; 
		}
	}
	
	public static ValidateSendMail validarEnvio() {
		return new ValidateSendMail();
	}

	} 

