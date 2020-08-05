package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	
	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions (

			// ruta de la feature que deseamos ejecutar 
			features = "src/test/resources/features/EnviarCorreo.feature",
			
		  // ruta del paquete donde se encuentra el step definition de la feature
			glue = "stepDefinitions"
			)
			
	//tags = {"@SuccessfullCase"}, 
	
		

	public class RunnerSendMail {
		
}
