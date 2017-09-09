package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage{
	
	  public LoginPage(WebDriver driver) 
	  {  
		    super(driver);
	  }
	  
	  public LoginPage navigateTo() {
		  
		    driver.navigate().to("https://login.salesforce.com");
		    
		    return new LoginPage(driver);
		    
		  }
	  public LoginPage loginWithUsername() {
		  
		  	driver.findElement(By.className("username")).sendKeys("perlaamulya1@prolific.com");
		
		  	driver.findElement(By.id("password")).sendKeys("Prolific@123");
		
		  	driver.findElement(By.id("Login")).click();
		
		  	return new LoginPage(driver);
	  }
}
