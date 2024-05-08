package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePage;

public class ManagePageTest extends Base {
  @Test
  public void veryfyingDeleteButtonUnderManagePages() {
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManagePage managepage=new ManagePage(driver);
	  managepage.verifyIfUserIsAbleToClickonManagePages();
	  managepage.verifyIfUserIsAbleToClickonDeleteButton();
	  boolean alertmessage=managepage.verifyIfAlertPopupIsDisplayed();
	  Assert.assertTrue(alertmessage,"Alert message not displayed on clicking delete button");
	 
  }
}
