package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.HomeUI;


public class ValidateLogin  implements Question<Object> { /*implements Question<String>*/

	boolean buscadorVisible = false;
	boolean botonVisible = false;
	
    @Override
	public Object answeredBy(Actor actor) {
		// TODO Auto-generated method stub
	
		buscadorVisible = HomeUI.BUSCADOR.resolveFor(actor).isVisible();
		botonVisible = HomeUI.BTN_MENSAJE_NUEVO.resolveFor(actor).isVisible();
		
		if ((buscadorVisible = true) && (botonVisible = true)) 
			return true;
			else
			return false;
		
	/*	return Text.of(HomePageUI.BTN_MENSAJE_NUEVO).viewedBy(actor).asString(); */
		
	}	
	
	public static ValidateLogin validarLogin() {
		return new  ValidateLogin();
	}
		
	}

