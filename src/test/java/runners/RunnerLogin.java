package runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		// ruta de la feature que deseamos ejecutar 
		features = "src/test/resources/features/abrirPag.feature",

	    // ruta del paquete donde se encuentra el step definition de la feature
		glue = "stepDefinitions")
		//tags = {"@SuccessfullCase"}, 

public class RunnerLogin {
	
	}
