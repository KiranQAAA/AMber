package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src\\test\\java\\Features\\PlaceValidations.feature"},
		
		glue = {"StepDefination"}, 
		
		plugin = {"pretty"}

		
		)


public class AddApi extends AbstractTestNGCucumberTests{

	
}
