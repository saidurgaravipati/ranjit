package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Case extends LoginPage {

	public Case(WebDriver driver) 
	{  
				 super(driver);
	}
				  
	public Case toCase() throws Exception{
					  
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//All tabs
				driver.findElement(By.id("AllTab_Tab")).click();
				
				driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[5]/td[1]/a")).click();
				
				driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
				
				Select status = new Select(driver.findElement(By.id("cas7")));
				
				status.selectByIndex(1);
				
				Select caseOrigin = new Select(driver.findElement(By.id("cas11")));
				
				caseOrigin.selectByIndex(2);
				
				driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]")).click();
			    
				return new Case(driver);
					  
		}
}
