package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base {
  @Test
  public void verifyingIfUserisAbleToAddNewEntryInAdminUsersPage() 
  {
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  
	  AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	  adminuserspage.verifyIfUserIsAbleToClickAdminUsersTile();
	  adminuserspage.verifyIfUserIsAbleToClickonNewButtonUnderAdminUsers();
	  adminuserspage.enterUsernameInUsernameField("auto1234");
	  adminuserspage.enterPasswordInPasswordField("test12345");
	  adminuserspage.selectUserTypeFromDropdown();
	  adminuserspage.clickOnSaveButton();
	  boolean isAlertDisplayed = adminuserspage.isAlertPopupDisplayed();
      Assert.assertTrue(isAlertDisplayed,"Alert is not displayed on clicking save button");	 
	  
  }
}
