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
import pages.PushNotificationsPage;
import utilities.ExcelUtility;

public class PushNotificationsTest extends Base {
  @Test
  public void VerifyIfUserIsAbleToEnterDetailsOnPushNotification() throws IOException {
	  
		  //String username="admin";
		 // String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		  LoginPage loginpage=new LoginPage(driver);
		  loginpage.enterUserNameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		  
		  String title ="Hello";
		  String description="hello123";
		  PushNotificationsPage pushnotificationspage=new PushNotificationsPage(driver);
		  pushnotificationspage.verifyIfUserIsAbleToClickOnPushNotifications();
		  pushnotificationspage.verifyIfUserIsAbleToEnterOnTitleField(title);
		  pushnotificationspage.verifyIfUserIsAbleToEnterDescriptionOnDescriptionField(description);
		  pushnotificationspage.verifyIfUserIsAbleToClickOnSendButton();
		  boolean isAlertDisplayed =pushnotificationspage.verifyIfAlertMessageIsDisplayed();
		  Assert.assertTrue(isAlertDisplayed, "Alert is not displayed");	  
  }
}
