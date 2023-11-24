package pageone;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homepage extends login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
     //Launching URL 
        driver.get("https://www.saucedemo.com/");
	//Username and Pssword 	
        WebElement Username = driver.findElement(By.name("user-name"));
        Username.sendKeys("standard_user");
        
        WebElement Password =driver.findElement(By.name("password"));
        Password.sendKeys("secret_sauce") ;
          
        //Clicking Submit button 
        WebElement submit=driver.findElement(By.name("login-button"));
        submit.click();
        
        
        //verify Header Presnt or not 
        WebElement Header=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        
		if(Header.isDisplayed())
		{
			System.out.println("Header present ");
		}
		else {
			System.out.println("Header NOt presnt ");
		}
		//Verify (Twiwter, Facebook , LinkedIn )Links are active or not 
		
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		
		
        WebElement TwitterLink=driver.findElement(By.linkText("Twitter"));
		
		TwitterLink.click();
		
		// Now iterate using Iterator
		
		}
		//switch to the parent window
	//	driver.switchTo().window();

		
		
		
	//	WebElement FacebookLink =driver.findElement(By.linkText("Facebook"));
	//	FacebookLink.click();
		
	//	WebElement LinkedIn=driver.findElement(By.linkText("LinkedIn"));
	//	LinkedIn.click();
		

	}


