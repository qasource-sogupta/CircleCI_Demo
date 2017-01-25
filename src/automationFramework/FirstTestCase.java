package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
 
	public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.gmail.com");
		
		String title = driver.getTitle();
		
		if( title == "Gmail")
			System.out.println("Pass");
		else {
			System.out.println("Fail");
		}
			
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website ");
        // Close the driver
        driver.quit();
    }
}