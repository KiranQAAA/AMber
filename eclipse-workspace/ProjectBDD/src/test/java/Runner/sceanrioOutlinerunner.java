package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\Feature\\scenarioOutline.feature"},
		 glue= {"steps"},
		publish=true
		)
public class sceanrioOutlinerunner extends AbstractTestNGCucumberTests {

}
