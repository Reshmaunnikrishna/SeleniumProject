package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MobileSlider;

public class MobileSliderTest extends Base{
  @Test  
  public void veryfyingIfUserIsAbleToAddNewItemInMobileSlider() {
	  
	  String username="admin";
	  String password="admin";
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
