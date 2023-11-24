package Runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\Feature\\hook.feature"},
		 glue= {"steps","hooks"},
		plugin= {"pretty"}
		
		)




public class hooksrunner extends AbstractTestNGCucumberTests{

}
