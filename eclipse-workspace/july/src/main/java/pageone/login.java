package pageone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	private static Object WebElemenet;

	public static void main(String[] args) {
		
		
		
	   WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	   
	   
	 //  ChromeOptions chromeOptions = new ChromeOptions();
	  // Map<String, Integer> timeouts = new HashMap<>();
	 //  timeouts.put("implicit", 3000);
	  // chromeOptions.setCapability("timeouts", timeouts);

	//   WebDriver  driver = new ChromeDriver(chromeOptions);
	   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    //its not working
	   
	   
           //Launching URL 
       driver.get("https://www.rahulshettyacademy.com/client");
   
   //Passing Username 
       WebElement Username = driver.findElement(By.id("userEmail"));     //   kiran8989@gmail.com
       Username.sendKeys("kiran8989@gmail.com");
  
       WebElement Password =driver.findElement(By.id("userPassword"));    //     Kiran@123
       Password.sendKeys("Kiran@123") ;
    
  //Clicking Submit button 
      WebElement submit=driver.findElement(By.id("login"));
      submit.click();
    
   
      List<WebElement>Products =driver.findElements(By.cssSelector(".mb-2"));
      
      for (WebElement i : Products)
      {
    	  System.out.println(i);
      }
      
 //WebElement  zara =  (WebElement) Products.stream().filter(product->product.findElement(By.cssSelector("b"))) ;  //Filter 
    	
     
   //  zara.findElement(By.linkText(" Add To Cart")).click();
     
      
      
      
   
 
 
 

}
}
