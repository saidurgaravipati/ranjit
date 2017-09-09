package modules;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Opportunity extends LoginPage{

		
		  public Opportunity(WebDriver driver) 
		  {  
			    super(driver);
		  }
		  
		  public Opportunity toOpportunity() {
			  
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  //All tabs
			  driver.findElement(By.id("AllTab_Tab")).click();
			  //opportunity
			  driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[6]/td[2]/a")).click();
			  //new
			  driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
			  //name
			  driver.findElement(By.id("opp3")).sendKeys("Name");
			  
			  driver.findElement(By.xpath(".//*[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
			  //ownership
			  Select ownership = new Select(driver.findElement(By.id("opp11")));
			  
			  ownership.selectByVisibleText("Prospecting");
			  
			  driver.findElement(By.xpath("//*[@id='topButtonRow']/input[1]")).click();
			  
			  return new Opportunity(driver);
			    
			  }
}