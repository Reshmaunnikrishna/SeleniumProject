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
import pages.ManagePage;
import utilities.ExcelUtility;

public class ManagePageTest extends Base {
  @Test (retryAnalyzer=retry.Retry.class,groups= {"regression"})
  public void veryfyingDeleteButtonUnderManagePages() throws IOException {
	  //String username="admin";
	 // String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 3, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManagePage managepage=new ManagePage(driver);
	  managepage.verifyIfUserIsAbleToClickonManagePages();
	  managepage.verifyIfUserIsAbleToClickonDeleteButton();
	  managepage.verifyIfAlertButtonIsClicked();
	  boolean alertmsg=managepage.verifyIfAlertPopupIsDisplayed();
	  Assert.assertTrue(alertmsg,"Alert message not displayed on clicking delete button");
	 
  }
}
