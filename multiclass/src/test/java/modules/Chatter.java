package modules;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Chatter extends LoginPage {

	public Chatter(WebDriver driver) 
	{  
			 super(driver);
	 }
			  
	public Chatter toChatter() throws Exception{
				  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//All tabs
			driver.findElement(By.id("AllTab_Tab")).click();
			
		    driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[6]/td[1]/a")).click();
		    
			WebElement elmntchatter =driver.findElement(By.id("publishereditablearea")); 
			
		    Actions actionchatter = new Actions(driver);
		    
		    actionchatter.moveToElement(elmntchatter).click(elmntchatter);
		    
		    Thread.sleep(2000);
		    
		    actionchatter.sendKeys("salesforce chatter Post");
		    
		    WebElement elmntchatter1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
		    
		    elmntchatter1.click();
		    
		    actionchatter.moveToElement(elmntchatter1).click(elmntchatter1);
		    
		    Thread.sleep(2000);
		    
		    actionchatter.clickAndHold(elmntchatter).perform();
		    
		    actionchatter.click();
		    
		    actionchatter.release().perform();
		    
		    driver.findElement(By.xpath(".//*[@id='publishersharebutton']")).click();
		    
			return new Chatter(driver);
				  
	}
}
