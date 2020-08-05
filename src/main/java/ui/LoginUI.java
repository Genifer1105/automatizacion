package ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://outlook.live.com/owa/")

public class LoginUI extends PageObject {
	
	
	
	public static final Target BTN_INICIAR_SESION =
			Target.the("Botón de ingresar").located(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
	
	public static final Target INP_CORREO = 
	  Target.the("Campo de usuario").located(By.id("i0116"));	
	
	public static final Target BTN_SIGUIENTE =
			Target.the("Botón de ingresar").located(By.xpath("//*[@id='idSIButton9']"));
	
	public static final Target INP_CONTRASENA =
		Target.the("Campo de contraseña").located(By.id("i0118"));	
	
	public static final Target BTN_INGRESAR =
			Target.the("Botón de ingresar").located(By.id("idSIButton9"));
			
	
}
