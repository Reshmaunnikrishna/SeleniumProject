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

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {
  @Test
  public void verifyingIfUserisAbleToAddNewEntryInAdminUsersPage() throws IOException 
  {
	 // String username="admin";
	 // String password="admin";
	  
	  String username=ExcelUtility.getStringData(1, 2, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String usernametest=ExcelUtility.getStringData(1, 0, "AdminUsers");
	  String passwordtest=ExcelUtility.getStringData(1, 1, "AdminUsers");
	  String textsample=ExcelUtility.getStringData(1, 2, "AdminUsers");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  
	  AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	  adminuserspage.verifyIfUserIsAbleToClickAdminUsersTile();
	  adminuserspage.verifyIfUserIsAbleToClickonNewButtonUnderAdminUsers();
	  adminuserspage.enterUsernameInUsernameField("usernametest");
	  adminuserspage.enterPasswordInPasswordField("passwordtest");
	  adminuserspage.selectUserTypeFromDropdown();
	  adminuserspage.clickOnSaveButton();
	  boolean isAlertDisplayed = adminuserspage.isAlertPopupDisplayed();
    Assert.assertTrue(isAlertDisplayed,"Alert is not displayed on clicking save button");	 
	  
  }
}
