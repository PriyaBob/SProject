package PagePack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PagePack.base.basePage;
import PagePack.util.Constants;

public class LaunchPage extends basePage {
	//WebDriver driver= null;
	//ExtentTest eTest=null;
	
	
	//Launch page WebElements
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-login")
	public WebElement Login;
	
	@FindBy(className="zh-signup")
	public WebElement FreeSignUp;
	
	
	//creating constructor
	public LaunchPage(WebDriver driver, ExtentTest eTest) {
		
		//left sidedriver is  instancevariable, rightside driver is parameter
		this.driver=driver;
		this.eTest=eTest;
		
	}

	
	public boolean goToLoginPage() {
		//Reusable methods
		driver.get(Constants.APP_URL);
		eTest.log(LogStatus.INFO, "Application Url"+Constants.APP_URL+ "got opened");
		Login.click();
		eTest.log(LogStatus.INFO, "Login Page opened");
		
		LoginPage loginpage=new LoginPage(driver,eTest);
		PageFactory.initElements(driver, loginpage);
		boolean loginStatus = loginpage.doLogin();
		return loginStatus;
	}
	
	
	

}
