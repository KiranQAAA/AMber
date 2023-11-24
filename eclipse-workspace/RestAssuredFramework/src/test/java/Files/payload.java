package Files;

public class payload {

	
	public static String corsePrice() {
		
		
		
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"www.abc.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
		
		
	}
	
	public static String Addbook() {
		String Payload="[\r\n"
				+ "    {\r\n"
				+ "        \"book_name\": \"Learn Appium Automation with Java\",\r\n"
				+ "        \"isbn\": \"bcd\",\r\n"
				+ "        \"aisle\": \"2926\",\r\n"
				+ "        \"author\": \"John foer\"\r\n"
				+ "    }\r\n"
				+ "]";
		return Payload;
	}
}
