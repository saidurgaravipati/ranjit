package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.AppLauncher;
import modules.Case;
import modules.Chatter;
import modules.LoginPage;
import modules.LogoutPage;
import modules.Opportunity;


public class StepDefinition {
	
	WebDriver driver;
	LoginPage login;
	LogoutPage lop;
	Opportunity opp;
	Chatter chat;
	Case cas;
	AppLauncher Apl;
	
	@Given("^Login to salesforce$")
	public void login_to_salesforce() throws Throwable {
		//web driver execution file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Desktop\\Amulya\\prolific\\chromedriver.exe");
		//new driver initiation
		driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
	}

	@And("^enter into Home Page$")
	public void enter_into_Home_Page() throws Throwable {
		//passing driver to Login
		login = new LoginPage(driver);
		//perform navigate method
	    login.navigateTo();
	}

	@When("^enter Username and Password$")
	public void enter_Username_and_Password() throws Throwable {
			
		login.loginWithUsername();
	}

	@Then("^logout the application$")
	public void logout_the_application() throws Throwable {
		lop = new LogoutPage(driver);
		lop.LogoutApplication();
	}
	
	@Then("^create new opportunity$")
	public void create_new_opportunity() throws Throwable {
	    
		opp = new Opportunity(driver);	
		opp.toOpportunity();
	}
	
	@Then("^create new Chatter$")
	public void create_new_Chatter() throws Throwable {
	    
		chat = new Chatter(driver);
		chat.toChatter();
	}

	@Then("^create new case post$")
	public void create_new_case_post() throws Throwable {
	    cas = new Case(driver);
	    cas.toCase();
		
	}

	@Then("^create events from app launcher$")
	public void create_events_from_app_launcher() throws Throwable {
	    Apl = new AppLauncher(driver);
	    Apl.toAppLauncher();
	}

}
