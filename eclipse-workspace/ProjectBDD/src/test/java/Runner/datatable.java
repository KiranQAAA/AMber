package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\Feature\\datatable.feature"},
		 glue= {"steps"},
		plugin= {"pretty"}
		
		)



public class datatable extends AbstractTestNGCucumberTests {

	
	
}
