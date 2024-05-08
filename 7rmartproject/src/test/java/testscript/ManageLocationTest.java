package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocation;

public class ManageLocationTest extends Base{
  @Test
  public void veryfingAddNewLocation() {
	  
	  String username="admin";
	  String password="admin";
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
