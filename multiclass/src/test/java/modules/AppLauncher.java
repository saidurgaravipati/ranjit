package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AppLauncher extends LoginPage{

		public AppLauncher(WebDriver driver) 
		{  
					 super(driver);
		}
					  
		public AppLauncher toAppLauncher() throws Exception{
						  
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					//All tabs
					driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath("//*[@id='Sales']/div[1]/span/img")).click();
					WebElement elmnt =driver.findElement(By.id("publishereditablearea"));   
				    Actions action = new Actions(driver);
				    action.moveToElement(elmnt).click(elmnt);
				    Thread.sleep(2000);
				    action.sendKeys("Sales Post");
				    WebElement elemnt1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    		elemnt1.click();
				    action.moveToElement(elemnt1).click(elemnt1);
				    Thread.sleep(2000);
				    action.clickAndHold(elmnt).perform();
				    action.click();
				    action.release().perform();  
				    //service
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath("//*[@id='Service']/div[1]/span/img")).click();
					WebElement elmntservice =driver.findElement(By.id("publishereditablearea"));   
				    Actions actionservice = new Actions(driver);
				    actionservice.moveToElement(elmntservice).click(elmntservice);
				    Thread.sleep(2000);
				    actionservice.sendKeys("Service Post");
				    WebElement elemnt1service = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    		elemnt1service.click();
				    		actionservice.moveToElement(elemnt1service).click(elemnt1service);
				    Thread.sleep(2000);
				    actionservice.clickAndHold(elmntservice).perform();
				    actionservice.click();
				    action.release().perform();
				  //marketing
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath("//*[@id='Marketing']/div[1]/span")).click();
					WebElement elmntmarket =driver.findElement(By.id("publishereditablearea"));   
				    Actions actionmarket = new Actions(driver);
				    actionmarket.moveToElement(elmntmarket).click(elmntmarket);
				    Thread.sleep(2000);
				    actionmarket.sendKeys("market Post");
				    WebElement elmntmarket1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    elmntmarket1.click();
				    		actionmarket.moveToElement(elmntmarket1).click(elmntmarket1);
				    Thread.sleep(2000);
				    actionmarket.clickAndHold(elmntmarket).perform();
				    actionmarket.click();
				    actionmarket.release().perform();
				  //work.com
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath(".//*[@id='Work']/div[1]/span/img")).click();
					WebElement elmntwork =driver.findElement(By.id("publishereditablearea"));   
				    Actions actionwork = new Actions(driver);
				    actionwork.moveToElement(elmntwork).click(elmntwork);
				    Thread.sleep(2000);
				    actionwork.sendKeys("work.com Post");
				    WebElement elmntwork1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    elmntwork1.click();
				    actionwork.moveToElement(elmntwork1).click(elmntwork1);
				    Thread.sleep(2000);
				    actionwork.clickAndHold(elmntwork).perform();
				    actionwork.click();
				    actionwork.release().perform();
				  //community
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath(".//*[@id='Community']/div[1]/span/img")).click();
					WebElement elmntcom =driver.findElement(By.id("publishereditablearea"));   
				    Actions actioncom = new Actions(driver);
				    actioncom.moveToElement(elmntcom).click(elmntcom);
				    Thread.sleep(2000);
				    actioncom.sendKeys("community Post");
				    WebElement elmntcom1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    elmntcom1.click();
				    actioncom.moveToElement(elmntcom1).click(elmntcom1);
				    Thread.sleep(2000);
				    actioncom.clickAndHold(elmntcom).perform();
				    actioncom.click();
				    actioncom.release().perform();
				    //Salesforce chatter
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath(".//*[@id='Chatter']/div[1]/span/img")).click();
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
				  //content
				    driver.findElement(By.id("AllTab_Tab")).click();
					driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
					driver.findElement(By.xpath(".//*[@id='Content']/div[1]/span")).click();
					WebElement elmntcontent =driver.findElement(By.id("publishereditablearea"));   
				    Actions actioncontent = new Actions(driver);
				    actioncontent.moveToElement(elmntcontent).click(elmntcontent);
				    Thread.sleep(2000);
				    actioncontent.sendKeys("content Post");
				    WebElement elmntcontent1 = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
				    elmntcontent1.click();
				    actioncontent.moveToElement(elmntcontent1).click(elmntcontent1);
				    Thread.sleep(2000);
				    actioncontent.clickAndHold(elmntcontent1).perform();
				    actioncontent.click();
				    actioncontent.release().perform();
					return new AppLauncher(driver);
						  
			}
}
