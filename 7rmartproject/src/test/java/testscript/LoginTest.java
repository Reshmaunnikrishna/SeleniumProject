package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
  @Test
  public void verifyTheUserIsAbleToLoginWithValidCredentials() 
  {
	  String username="admin";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid credentials");
	  
  }
  @Test
  public void verifyTheUserIsAbleToLoginWithInvalidUsername() 
  {
	  String username="admin123";
	  String password="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid username");
	  
  }
  @Test
  public void verifyTheUserIsAbleToLoginWithInvalidPassword() 
  {
	  String username="admin";
	  String password="admin123";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid password");
	  
  }
  
}
