package com.qa.test;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import java.util.*;
public class ambertask extends BaseClass{

	@Test (enabled=true , priority =0)
	public void Validate_title_and_location_of_property() throws Exception {

		
		driver.findElement(By.xpath("//input[@placeholder='Search by City, University or Property']/following-sibling::button")).click();
		WebElement Searchbar = driver.findElement(By.xpath("//input[@placeholder='Search by City, University or Property']"));
		Searchbar.click();
		Searchbar.sendKeys("London");Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='listbox']//div[text()='London']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

		driver.findElement(By.xpath("//span[text()='   More Filters ']")).click();
		driver.findElement(By.xpath("//label[@class='amber-Checkbox-label amber-1jf3re']//div[text()='Private Room']")).click();
		driver.findElement(By.xpath("//label[text()='Private Bathroom']")).click();
		driver.findElement(By.xpath("//span[text()='Show ']")).click();

		System.out.println("Verifying the Filter search results has started");

		List<WebElement>  Locations =driver.findElements(By.xpath("//div[@class='search-list-inner-container']"));
		for (WebElement Locaction : Locations) {
			//System.out.println("Locaction text:" + Locaction.getText());
			List<WebElement> spans = Locaction.findElements(By.tagName("a"));
			for(WebElement Span:spans)
				Span.getAttribute("href");
			//System.out.println(spans.size());

			System.out.println("Verifying the Filter search results has Finished ");

			spans.get(1).click();

			System.out.println("Verifying the Sceond search results has started");

			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

			System.out.println("Verifying the Sceond search results has Finshed ");

			// Assert the title and location of the property
			WebElement propertyTitle = driver.findElement(By.xpath("//h1[@class='amber-Text-root amber-Title-root amber-1n5melx']"));
			String ActualTitle = propertyTitle.getText();
			WebElement propertyLocation = driver.findElement(By.xpath("//div[@class='amber-Text-root amber-1gvc0gz']"));
			String location = propertyLocation.getText();

			// Print the title and location
			System.out.println("Title: " + ActualTitle);
			System.out.println("Location: " + location);

			Assert.assertEquals(ActualTitle , "East Central House, London", "Title");
			Assert.assertEquals(location , "Lever St, London, EC1V 3RH, United Kingdom", "location");

			System.out.println("Verifing title and location of the property successfully Finished");
			
			ExtentTest test =extent.createTest(" Tittle  and Location of selected property Test").assignAuthor("kiran").assignCategory("Regression Testing");  //Create Test Node
	        
			 
			test.pass(" Tittle  and Location of selected property Test done Successfully" ,MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.getScrenshotpatth()).build()) ; // Create Step Node 

		}
	}

	@Test (enabled=false , priority =1)
	public void Bonus_Task_1() throws Exception {

	
		driver.findElement(By.xpath("//input[@placeholder='Search by City, University or Property']/following-sibling::button")).click();
		WebElement Searchbar = driver.findElement(By.xpath("//input[@placeholder='Search by City, University or Property']"));
		Searchbar.click();


		Set<String> allCities = new HashSet<>();
		Map<String, Set<String>> countryCitiesMap = new HashMap<>();

		List<WebElement> countryTabs = driver.findElements(By.xpath("//div[contains(@class, \"amber-1s8spa1\")]"));
		System.out.println("Total Countries are :"+countryTabs.size());

		for (WebElement countryTab : countryTabs) {
			countryTab.click();
			String id = driver.findElement(By.xpath("(//div[contains(@class, \"amber-1s8spa1\")]/parent::button)[1]")).getAttribute("id");
			System.out.println(countryTab.getText() + id);

			String countryName = countryTab.getText();
			System.out.println("  Contry  is added in map:" +countryName);
			countryCitiesMap.put(countryName, new HashSet<>());


			System.out.println(countryCitiesMap);



			List<WebElement> cities = driver.findElements(By.xpath("(//div[@class='amber-Text-root amber-fl0sq1']/following-sibling::div)"));

			List<String> Popular_cities=new ArrayList<String>();  
			for (WebElement city : cities) {
				String cityName = city.getText();
				//System.out.println(cityName);
				Popular_cities.add(cityName);
				//System.out.println(Popular_cities);
			}
		}


		//			System.out.println(countryCitiesMap);

	}



}



