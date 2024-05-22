package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContact;
import pages.ManageExpense;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
  @Test
  public void verifyingEditEmailUnderManageContact() throws IOException {
	  
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String phone="1234567";
	  String name=ExcelUtility.getStringData(1, 0, "ManageDeliveryBoy");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManageContact managecontact=new ManageContact(driver);
	  managecontact.verifyIfUserIsAbleToClickManageContact();
	  managecontact.verifyIfUserIsAbleToClickonEditButtonUnderManageContact();
	  managecontact.enterPhoneNumToBeEdited(phone);
	  managecontact.clickOnUpdateButton();
	  boolean alert=managecontact.isAlertPopupDisplayed();
	  Assert.assertTrue(alert, "Alert not displayed");
	  
  }
}
