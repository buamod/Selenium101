package Testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FacebookTesting {

	String Actualtext;
    WebDriver driver = new FirefoxDriver();
	
	public void load_url()
	
	{ 
        WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com"); 
	}
	
	public void checking_method() 
    { 
    	Actualtext = driver.findElement(By.xpath("//h2/span")).getText(); 
    	Assert.assertEquals(Actualtext, "Tuesday, 29 January 2014"); 
    	System.out.print("\n assertion_method_1() -> Part executed"); 

    } 
// to be moved to @ Test
    public static void main (String[] args) {
    

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.facebook.com");

        //get the input by css and store that element as a WebElement send input into the element

        WebElement textbox = driver.findElement(By.cssSelector("#email"));

        textbox.sendKeys("your_email@yahoo.com");

        textbox = driver.findElement(By.cssSelector("#pass"));

        textbox.sendKeys("YourPassword");

        textbox.submit();
        
        
        
        
        

        //sign out

        driver.findElement(By.id("userNavigationLabel")).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        //returns an error because element (located in the dropdown menu) is a hidden element and only appears on the DOM for selenium to find after selenium loads the DOM at the beggiging

        //Need to look into a way to tell Selenium to refresh the DOM and in this newly updated DOM find me the element below (Log Out) to click

        driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div[1]/div/div/div[2]/ul/li[1]/div/a/span")).click();


        //close browser

        driver.close();

        

    }

    

}


