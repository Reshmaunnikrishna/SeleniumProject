package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PushNotificationsPage;

public class PushNotificationsTest extends Base {
  @Test
  public void VerifyIfUserIsAbleToEnterDetailsOnPushNotification() {
	  
		  String username="admin";
		  String password="admin";
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
