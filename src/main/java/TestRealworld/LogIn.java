/**
 * 
 */
package TestRealworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author pc
 *
 */
public class LogIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	  
	     //URL launch
	     driver.get("https://angular.realworld.io/");
		
		
	     
		 
		 WebElement signin = driver.findElement(By.partialLinkText("Sign in"));
		 signin.click();
	     
		 WebElement email = driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control"));
		 email.sendKeys("tuto@gmail.com");
		
		 WebElement password =  driver.findElement(By.xpath("//input[@type=\'password\']"));	
		 password.click();
		 password.sendKeys("Wxcvbn12345");
		
		
		WebElement btn_signin = driver.findElement(By.cssSelector(".btn"));
		btn_signin.click();
			
	}

}
