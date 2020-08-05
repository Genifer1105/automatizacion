package ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI extends PageObject{

	
	 public static final Target BUSCADOR = Target.the("Barra de buscador").
			located(By.xpath("//*[@id='searchBoxId-Mail']/div[2]/div/input")); 

	public static final Target BTN_MENSAJE_NUEVO = Target.the("Botón de nuevo mensaje").
			located(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button"));
}
