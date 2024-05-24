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
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
  @Test(retryAnalyzer=retry.Retry.class)
  public void verifyingIfUserisAbleToAddNewsUnderManageNews() throws IOException {
	  
	  //String username="admin";
	  //String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String news="newsheadline";
	  String newsedit="sportsnews";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  
	  ManageNewsPage managenewspage=new ManageNewsPage(driver);
	  managenewspage.verifyIfUserIsAbleToClickMangeNewsTile();
	  managenewspage.verifyIfUserIsAbleToClickonNewButtonUnderMangeNews();
	  managenewspage.verifyIfUserIsAbleToEnterNews(news);
	  managenewspage.verifyIfUserIsAbleToSaveTheChanges();
	  boolean alertdisplay =managenewspage.verifyIfAlertDisplayed();
	  Assert.assertTrue(alertdisplay, "Alert is not displayed");
	  
	  managenewspage.verifyIfUserIsAbleToClickMangeNewsTile();
	  managenewspage.clickOnEditButton();
	  managenewspage.updateNewsField(newsedit);
	  managenewspage.clickOnUpdateButton();
	  boolean alertdisplay1 =managenewspage.verifyIfAlertDisplayed();
	  Assert.assertTrue(alertdisplay1, "Alert is not displayed");
	  
  }
}
