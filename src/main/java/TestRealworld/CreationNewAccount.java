package TestRealworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreationNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
	    
	    
		//URL launch
	    driver.get("https://angular.realworld.io/");
	    
	
	    
	    driver.findElement(By.partialLinkText("Sign up")).click();
	    
	    
	    driver.findElement(By.cssSelector(".ng-valid")).sendKeys("test7");
	    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();			
		
	    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("tutoS5@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@type=\'password\']")).click();
	    driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Azert1234");
	    driver.findElement(By.cssSelector(".btn")).click();
	 
	    /*
	    driver.findElement(By.partialLinkText("Sign in")).click();        
	    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("tutoS5@gmail.com");
	    driver.findElement(By.xpath("//input[@type=\'password\']")).click();
	    driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Azert1234");
	    driver.findElement(By.cssSelector(".btn")).click();
		*/
		
	}

}
