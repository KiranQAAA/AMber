package MvTesting.MVtesting;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ABC {

	
	   static WebDriver driver ;
		
		@BeforeTest
		public static void setup1() 
		{
		String Directory = System.getProperty("user.dir");		
		System.setProperty("WebDriver.chrome.driver", Directory +"//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		}
		
		@Test
		public static void Validate_Tittle() {
	
		
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle() .contains("IRCTC Next Generation eTicketing System"));
		}
		
		
	//	WebElement Login_button=  driver.findElement(By.xpath("//input[contains (@class,'ng-tns-c57-8 ui-inputtext ui-widget')]"));
    //    Login_button.click();

		@Test
		public  static void Validate_Jounerny() {
		 WebElement FromsearchBox=  driver.findElement(By.xpath("//input[contains (@class,'ng-tns-c57-8 ui-inputtext ui-widget')]"));
	     
		 FromsearchBox.sendKeys("Pune");
		 
		
		 
		 WebElement To_searchBox=driver.findElement(By.xpath("//input[contains (@class,'ng-tns-c57-9 ui-inputtext ui-widget')]"));
		 
		 To_searchBox.sendKeys("MUMBAI CENTRAL - MMCT (MUMBAI)");
		 
	//	 WebElement Popup_page=driver.findElement(By.xpath("//a[contains(@class,'fa-window-close')]"));
	//	 Popup_page.click();
		}
		
		@Test
		public static void validate_Train_menu()
		{
		 Actions a =new Actions(driver);
		 WebElement Trains=driver.findElement(By.xpath("//a//strong[text()='TRAINS']"));
		 a.moveToElement(Trains).perform();
		 
		 List<WebElement> Train_options =driver.findElements(By.xpath("//strong[text()='TRAINS']/parent::span/parent::a/following-sibling::ul/li/a/span"));
	
		 List<String> Trains_String=new ArrayList<String>();
		 
	     for(WebElement Dropdown_vaules:Train_options)
	    	 {
	    	 System.out.println(Dropdown_vaules.getText());
	    	 Trains_String.add(Dropdown_vaules.getText());
	    	 }
	    
	 if (Trains_String.size()<=0)
	 {
		 System.out.println(Trains_String.size() +"List Is empty");
		
	}
	 
	
	 driver.close();
	 }

		
		


         
	       

		 
		 
		 
		
		
	}


