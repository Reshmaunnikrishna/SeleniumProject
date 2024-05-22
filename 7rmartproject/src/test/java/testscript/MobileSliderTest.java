package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MobileSlider;
import utilities.ExcelUtility;

public class MobileSliderTest extends Base{
  @Test  
  public void veryfyingIfUserIsAbleToAddNewItemInMobileSlider() throws IOException {
	  
	 // String username="admin";
	 // String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String category="Apple";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  MobileSlider mobileslider=new MobileSlider(driver);
	  mobileslider.verifyIfUserIsAbleToClickonMobileSlider();
	  mobileslider.verifyIfUserIsAbleToClickonNewbutton();
	  mobileslider.verifyIfUserIsAbleToSelectCategory(category);
	  mobileslider.verifyIfUserIsAbleToSaveTheItem();
	  boolean isAlertDisplayed=mobileslider.verifyIfAlertIsDisplayed();
	  Assert.assertTrue(isAlertDisplayed, "Alert is not displayed");
	  
	  
  }
}
