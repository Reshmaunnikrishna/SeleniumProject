package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOfferCode;

public class ManageOfferCodeTest extends Base {
  @Test
  public void veryfyingAddNewButtonUnderManageOfferCode() {
	  
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManageOfferCode manageoffercode=new ManageOfferCode(driver);
	  manageoffercode.verifyIfUserIsAbleToClickonManageOfferCode();
	  manageoffercode.verifyIfUserIsAbleToClickonNewButton();
	  manageoffercode.verifyIfUserIsAbleToEnterOfferCodeValue("ABCOFF");
	  manageoffercode.verifyIfUserIsAbleToSelectFirstOrderUser();
	  manageoffercode.verifyIfUserIsAbleToEnterAmountValue("1500");
	  manageoffercode.verifyIfUserIsAbleToClickonSaveButton();
	  boolean alertmsg= manageoffercode.verifyIfAlertIsDisplayed();
	  Assert.assertTrue(alertmsg, "Alert message is not displayed");
  }
}
