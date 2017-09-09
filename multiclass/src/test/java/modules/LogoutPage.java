package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends LoginPage{
	
	public LogoutPage(WebDriver driver) 
	  {  
		    super(driver);
	  }
	public void LogoutApplication(){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='userNav']")).click();
		
		driver.findElement(By.className("menuButtonMenuLink")).click();
		
		driver.quit();
	}
}
