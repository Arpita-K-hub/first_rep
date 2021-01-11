package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination {
	WebDriver driver;
	Pages.Home_Register hr;
	
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("https://www.opentable.com/");
	}
	
		
	@Given("^the application browser is launched$")
    public void the_application_browser_is_launched() throws Throwable {
        System.out.println("the application browser is launched");
    }

    @When("^user clicks Sign up button$")
    public void user_clicks_sign_up_button() throws Throwable {
    	System.out.println("user clicks Sign up button");
    	hr = new Pages.Home_Register(driver);
    	hr.clickSignUp();
    	
    }

    @Then("^the homepage is reloaded$")
    public void the_homepage_is_reloaded() throws Throwable {
    	System.out.println("the homepage is reloaded");
    }

    @Then("^error message is displayed$")
    public void error_message_is_displayed() throws Throwable {
    	System.out.println("error message is displayed");
    	String err1 = "Enter a valid email address.";
    	String err = hr.email_error();
    	org.junit.Assert.assertEquals(err1,err);
    	System.out.println(err);
    }

    @Then("^error message will be displayed$")
    public void error_message_will_be_displayed() throws Throwable {
    	System.out.println("error message will be displayed");
    }

    @And("^the Open Table homepage is opened$")
    public void the_open_table_homepage_is_opened() throws Throwable {
    	System.out.println("the Open Table homepage is opened ");
    }

    @And("^user enters the first name$")
    public void user_enters_the_first_name() throws Throwable {
    	System.out.println("user enters the first name");
    	hr.firstname();
    }

    @And("^user enters the last name$")
    public void user_enters_the_last_name() throws Throwable {
    	System.out.println("user enters the last name");
    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
    	hr.lastname();
    	
    	
    }

    @And("^user enters the email$")
    public void user_enters_the_email() throws Throwable {
    	System.out.println("user enters the email");
    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
    	hr.email();
    	    }

    @And("^user enters valid password$")
    public void user_enters_valid_password() throws Throwable {
    	System.out.println("^user enters valid password");
    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
    	hr.password();
    	
    }

    @And("^user Reenters the password$")
    public void user_reenters_the_password() throws Throwable {
    	System.out.println("user Reenters the password");
    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
    	hr.reenter_pass();
    	
    	
    }

    @And("^user selects the primary dining location$")
    public void user_selects_the_primary_dining_location() throws Throwable {
    	System.out.println("user selects the primary dining location");
    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
    	hr.dininglocation();
    	
    	
    }

    @And("^user clicks on create account button$")
    public void user_clicks_on_create_account_button() throws Throwable {
    	System.out.println("user clicks on create account button");
    	hr.clickCreateAccount();
    	
    }

    @And("^user clicks on the profile icon$")
    public void user_clicks_on_the_profile_icon() throws Throwable {
    	System.out.println("user clicks on the profile icon");
    	//driver.findElement(Profile).click();
    }

    @And("^user clicks on sign out option$")
    public void user_clicks_on_sign_out_option() throws Throwable {
    	System.out.println("user clicks on sign out option");
    	//driver.findElement(SignOut).click();
    }

    @And("^user enters invalid data in any of the required fields$")
    public void user_enters_invalid_data_in_any_of_the_required_fields() throws Throwable {
    	System.out.println("user enters invalid data in any of the required fields");
    	hr.Invaliddata();
    }


}
