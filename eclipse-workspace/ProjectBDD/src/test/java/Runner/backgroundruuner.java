package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\Feature\\backgrounddemo.feature"},
		 glue= {"steps"},
	
		plugin = { "pretty" }
		)









public class backgroundruuner {

}
