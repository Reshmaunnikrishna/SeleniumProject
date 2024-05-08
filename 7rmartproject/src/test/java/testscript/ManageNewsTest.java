package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
  @Test
  public void verifyingIfUserisAbleToAddNewsUnderManageNews() {
	  
	  String username="admin";
	  String password="admin";
	  String news="newscheck123";
	  String newsedit="news456";
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
	  
	  managenewspage.clickOnEditButton();
	  managenewspage.updateNewsField(newsedit);
	  managenewspage.clickOnUpdateButton();
	  
  }
}
