package PagePack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import PagePack.base.basePage;

public class HomePage extends basePage{
	//WebDriver driver=null;
	//ExtentTest eTest=null;
	
    @FindBy(css="[class^='_logo-chat _logo-x96']")
	public WebElement cliqOption;
	
	@FindBy(css="[class^='_logo-crm _logo-x96']")
	public WebElement crmOption;
	
	@FindBy(css="[class^='_logo-calendar _logo-x96']")
	public WebElement calenderOption;
	
	//@FindBy(id="ver_id")
	//public WebElement verifyOption;
	
	public HomePage(WebDriver driver,ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
		
	}

	 //reusable method
	public boolean verifyDisplayHomePage() {
		return isElementPresent(crmOption);
		
	}	
}