package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base{
  @Test
  public void verifyingDeliveryBoyDetailsFoundInListDeliveryBoyPage() //search element is present in table or not
  {
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  String name="test";
	  ManageDeliveryBoyPage managedeliveryboypage=new ManageDeliveryBoyPage(driver);
	  managedeliveryboypage.verifyIfUserIsAbleToClickManageDeliveryBoyTile();
	  managedeliveryboypage.verifyIfUserIsAbleToClickSearchButton();
	  managedeliveryboypage.verifyIfUserIsAbleToEnterNameOnNameField(name);
	  managedeliveryboypage.verifyIfUserIsAbleToClickTheSearchButtonUnderNameField();
	 boolean isTableDisplayed= managedeliveryboypage.verifyTheTableContainingTheDeliveryBoyNameDetailsDisplayed();
	 Assert.assertTrue(isTableDisplayed, "Table is not displayed");
	  
	 
  }
}
