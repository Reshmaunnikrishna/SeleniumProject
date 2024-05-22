package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageSlider;
import utilities.ExcelUtility;

  public class ManageSliderTest extends Base {
	  @Test
	  public void AddSlider() throws Exception 
	  
	  {
		  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		  String link="https://www.amazon.in/";
		  LoginPage loginpage=new LoginPage(driver);
		  loginpage.enterUserNameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		  
		  
		  ManageSlider manageslider = new ManageSlider(driver);
		  manageslider.manageSliderTileClick();
		  manageslider.newButtonClick();
		  manageslider.chooseFileButtonClick();
		  manageslider.passingValueTolinkTextField(link);
		  manageslider.saveButtonClick();
		  boolean isalertdisplayed = manageslider.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed, "Alert not displayed");
		 // manageslider.manageSliderTileClick();
	     // manageslider.deleteButtonClick();

	  }
}
