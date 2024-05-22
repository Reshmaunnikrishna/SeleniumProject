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
import pages.ManageLocation;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base{
  @Test
  public void veryfingAddNewLocation() throws IOException {
	  
	  //String username="admin";
	  //String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManageLocation managelocation=new ManageLocation(driver);
	  managelocation.verifyIfUserIsAbleToClickMangeLocationTile();
	  managelocation.verifyIfUserIsAbleToClickOnNewButton();
	  managelocation.countryDropdownfieldValue(1);
	  managelocation.stateDropdownfieldValue(1);
	  managelocation.enterLocation("Kochi");
	  managelocation.enterDeleiveryCharge("100");
	  managelocation.verifyIfUserIsAbleToClickOnSaveButton();
	  boolean alertdisplay=managelocation.verifyIfAlertMessageDisplayed();
	  Assert.assertTrue(alertdisplay, "Alert message not displayed after saving the changes");
	  
	  
  }
}
