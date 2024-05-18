package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOfferCode;
import utilities.ExcelUtility;

public class ManageOfferCodeTest extends Base {
  @Test
  public void veryfyingAddNewButtonUnderManageOfferCode() throws IOException {
	  
	 // String username="admin";
	  //String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
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
