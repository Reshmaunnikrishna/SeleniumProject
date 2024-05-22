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
import pages.ManageExpense;
import utilities.ExcelUtility;

public class ManageExpenseTest extends Base{
  @Test
  public void veryfyingIfUserIsAbleToAddNewItemUnderManageExpense() throws IOException {
	 // String username="admin";
	  //String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  int orderid=13;
	  int purchaseid=15;
	  String amount="150";
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
	  manageexpense.verifyIfeUserIsAbleToGoBackOnManageExpense();
	  manageexpense.verifyIfUserIsAbleToClickonDeleteButton();
	  boolean alert1=manageexpense.isAlertDisplayed();
	  Assert.assertTrue(alert1, "Alert not displayed");
	  
	
	  

  }
}
