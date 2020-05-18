package PagePack.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PagePack.base.basePage;
import PagePack.util.Constants;

public class LoginPage extends basePage {
	
	//WebDriver driver=null;
	//ExtentTest eTest=null;
	

	@FindBy(id="login_id")
	public WebElement emailField;
	
	@FindBy(id="nextbtn")
	public WebElement nextButton;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="nextbtn")
	public WebElement signInButton;
	

public LoginPage(WebDriver driver,ExtentTest eTest) {
	this.driver=driver;
	this.eTest=eTest;
	
		
}

public boolean doLogin() {
	
	emailField.sendKeys(Constants.USERNAME);
	eTest.log(LogStatus.INFO,"Username got entered into email field on the login page");
	nextButton.click();
	eTest.log(LogStatus.INFO, "next button got clicked");
	passwordField.sendKeys(Constants.PASSWORD);
	eTest.log(LogStatus.INFO, " Password got entered into password field on the login page");
	signInButton.click();
	eTest.log(LogStatus.INFO, "signbutton got clicked");
	
	HomePage homepage=new HomePage(driver,eTest);
	PageFactory.initElements(driver, homepage);
	boolean loginStatus= homepage.verifyDisplayHomePage();
	return loginStatus;
}
//reusable method



}