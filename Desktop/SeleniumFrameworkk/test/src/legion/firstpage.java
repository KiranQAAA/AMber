package legion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\PAWAN\\Chromdriverfor116\\chromedriver-win64\\chromedriver.exe");
    	// WebDriverManager.chromedriver().setup();--not working
    		   
        // Create the driver object
         WebDriver driver = new ChromeDriver();
        
        //Add implicit wait 
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Mazimize window 
        driver.manage().window().maximize();

	}

}
