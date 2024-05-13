package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageExpense;

public class ManageExpenseTest extends Base{
  @Test
  public void veryfyingIfUserIsAbleToAddNewItemUnderManageExpense() {
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  int orderid=13;
	  int purchaseid=15;
	  int amount=150;
	  String remarks="test123";
	  
	  ManageExpense manageexpense=new ManageExpense(driver);
	  manageexpense.verifyIfeUserIsAbleToClickOnManageExpense();
	  manageexpense.verifyIfUserIsAbleToClickOnNewIcon();
	  manageexpense.verifyIfUserIsAbleToSelectTheUser(3);
	  manageexpense.verifyIfUserIsAbleToChooseTheDate();
	  manageexpense.verifyIfUserIsAbleToSelectTheCategory(2);
	  manageexpense.verifyTheUserIsAbleToSelectTheOrderID(orderid);
	  manageexpense.verifyTheUserIsAbleToSelectThePurchaseID(purchaseid);
	  manageexpense.verifyTheUserIsAbleToSelectTheExpenseType(2);
	  manageexpense.verifyTheUserIsAbleToEnterTheAmount(amount);
	  manageexpense.verifyTheUserIsAbleToEnterTheRemarks(remarks);
	  manageexpense.verifyTheUserIsAbleToSaveTheItem();
	  boolean alert=manageexpense.isAlertDisplayed();
	  Assert.assertTrue(alert, "Alert not displayed");
	
	  

  }
}
