package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base{
  @Test
  public void verifyingDeliveryBoyDetailsFoundInListDeliveryBoyPage() throws IOException //search element is present in table or not
  {
	  //String username="admin";
	 // String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String name=ExcelUtility.getStringData(1, 0, "ManageDeliveryBoy");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	
	  ManageDeliveryBoyPage managedeliveryboypage=new ManageDeliveryBoyPage(driver);
	  managedeliveryboypage.verifyIfUserIsAbleToClickManageDeliveryBoyTile();
	  managedeliveryboypage.verifyIfUserIsAbleToClickSearchButton();
	  managedeliveryboypage.verifyIfUserIsAbleToEnterNameOnNameField(name);
	  managedeliveryboypage.verifyIfUserIsAbleToClickTheSearchButtonUnderNameField();
	 boolean isTableDisplayed= managedeliveryboypage.verifyTheTableContainingTheDeliveryBoyNameDetailsDisplayed();
	 Assert.assertTrue(isTableDisplayed, "Table is not displayed");
	  
	 
  }
}
