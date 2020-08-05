package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewMailUI extends PageObject {

	
	public static final Target TITULO_CONFIG = Target.the("Título de configuración one drive")
			.located(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div/div/div/span"));

	public static final Target INP_PARA = Target.the("Correo para").located(By.xpath(
			"//*[@id='app']/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/input"));

	public static final Target INP_ASUNTO = Target.the("Asunto del correo").located(By.id("TextField204"));

	public static final Target INP_CUERPO_CORREO = Target.the("Cuerpo del correo").located(By.xpath(
			"//*[@id='app']/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[2]/div[1]"));

	public static final Target BTN_ENVIAR = Target.the("Botón enviar").located(By.xpath(
			"//*[@id='app']/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/span/button[1]/span"));

}
