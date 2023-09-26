package MvTesting.MVtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Directory = System.getProperty("user.dir");		
		System.setProperty("WebDriver.chrome.driver", Directory +"//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		 WebElement From_searchBox=  driver.findElement(By.xpath("//input[contains (@class,'ng-tns-c57-8 ui-inputtext ui-widget')]"));
	     
		 From_searchBox.sendKeys("Pune");
		 
		
		 
		 WebElement To_searchBox=driver.findElement(By.xpath("//input[contains (@class,'ng-tns-c57-9 ui-inputtext ui-widget')]"));
		 
		 To_searchBox.sendKeys("Mumbai");
		 
	//	 WebElement Calender = driver.findElement(By.xpath("//p-calendar/span/input"));
	//	 Calender.click();
		 
		
		
	}

}
