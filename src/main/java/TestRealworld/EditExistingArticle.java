package TestRealworld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditExistingArticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	WebDriverManager.chromedriver().setup();
		
	    WebDriver driver = new ChromeDriver();
	    
	    //implicit wait
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 	
	    driver.get("https://angular.realworld.io/");
		
	
		 driver.findElement(By.partialLinkText("Sign in")).click();        
		 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("tuto@gmail.com");
		// driver.findElement(By.xpath("//input[@type=\'password\']")).click();
		 driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Wxcvbn12345");
		 driver.findElement(By.cssSelector(".btn")).click();
		 System.out.println(driver.getTitle());
		 
		 
		 driver.findElement(By.linkText("New Article")).click();
		 
		 driver.findElement(By.cssSelector(".form-control-lg")).click();
		 driver.findElement(By.cssSelector(".form-control-lg")).sendKeys("rgetAgaa1");
		 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ergtgetRT");
		 driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
		 driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).sendKeys("ergetg \"\'rfrz");
		 driver.findElement(By.cssSelector(".btn")).click();
		 
		
		 driver.findElement(By.linkText("Edit Article")).click();
		 driver.findElement(By.cssSelector(".form-control-lg")).click();
		 driver.findElement(By.cssSelector(".form-control-lg")).sendKeys("rgetAgaauu2");
		 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ergtgetRT22");
		 driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
		 driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).sendKeys("ergetg \"\'rfrz22");
		 driver.findElement(By.cssSelector(".btn")).click();
		 
		 
		// driver.findElement(By.cssSelector("app-article-meta:nth-child(1) .btn-outline-danger")).click();
		 
		  driver.findElement(By.cssSelector(".form-control")).click();
		  driver.findElement(By.cssSelector(".form-control")).sendKeys("test");
		  driver.findElement(By.cssSelector(".btn-primary")).click();
		 
	}

}
