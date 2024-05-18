package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategory;
import pages.ManageLocation;
import utilities.ExcelUtility;

public class CategoryTest extends Base {
  @Test
  public void veryfingAddNewCategory() throws IOException {
	  
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String category="Check123456";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManageCategory managecategory=new ManageCategory(driver);
	  managecategory.verifyIfUserIsAbleToClickCategoryTile();
	  managecategory.verifyIfUserIsAbleToClickOnNewButton();
	  managecategory.verifyIfUserIsAbleToEnterCategory(category);
	  managecategory.verifyIfUserIsAbleToSelectGroups();
	  managecategory.verifyIfUserIsAbleToSelectRadioButton1();
	  managecategory.verifyIfUserIsAbleToSelectRadioButton2();
	  managecategory.verifyIfUserIsAbleToClickOnSaveButton();
	  boolean alertpopup=managecategory.isAlertPopupDisplayed();
	  Assert.assertTrue(alertpopup,"Alert message not displayed after saving the changes");
	  
  }
}
