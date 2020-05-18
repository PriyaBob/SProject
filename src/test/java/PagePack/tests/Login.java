package PagePack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;

import PagePack.pages.LaunchPage;
import PagePack.tests.base.base;
import PagePack.util.Constants;



public class Login extends base{
	//moved to Base parent class to use globally
	//public ExtentReports eReport= ExtentManager.getInstance();
	//public ExtentTest eTest= null;	
	
	
	@Test
	public void testLogin() {
		
	
	 eTest = eReport.startTest("Login");
	 eTest.log(LogStatus.INFO,"Login Test has Started");
    
	 openBrowser(Constants.BROWSER_TYPE);	
	 
	 //Connecting to Launch page
	 LaunchPage launchpage =new LaunchPage(driver,eTest);
	 PageFactory.initElements(driver, launchpage);
	 
     boolean loginStatus= launchpage.goToLoginPage();
     if(loginStatus) {
    	 reportPass("Login Testcase is passed");
     }else {
    	reportFail("Login Test failed");
    	//takeScreenshot();
    	
     }
    
	
	}
	@AfterMethod
	public void testClosure() {
		
		if (eReport!=null) {
			eReport.endTest(eTest);
			eReport.flush();
		}
		if (driver!=null) {
			
		    driver.quit();
		}
	}
	
	
	


	
	

}
