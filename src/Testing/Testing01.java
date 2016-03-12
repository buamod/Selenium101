package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		//Webelement
      //  WebElement textbox = driver.findElement(By.cssSelector("#email"));
        WebElement textbox = driver.findElement(By.cssSelector("#email"));


		
				
		

	}

}
