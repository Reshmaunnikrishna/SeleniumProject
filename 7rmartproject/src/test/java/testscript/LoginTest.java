package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test
	@DataProvider(name="credentials")
	public Object[][] testData()
	{
		Object[][] input=new Object[2][2];
		input[0][0]="admin";
		input[0][1]="demo";
		input[1][0]="admin";
		input[1][1]="admin";
		return input;
	}
  @Test(dataProvider="credentials")
  public void verifyTheUserIsAbleToLoginWithValidCredentials(String username,String password) throws IOException 
  {
	
	 // String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  //String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid credentials");
	  
  }
  @Test(description = "veryfying user is able to login with invalid username")
  public void verifyTheUserIsAbleToLoginWithInvalidUsername() throws IOException 
  {
	  String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(2, 1, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid username");
	  
  }
  @Test
  public void verifyTheUserIsAbleToLoginWithInvalidPassword() throws IOException 
  {
	  String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid password");
	  
  }
  @Test
  public void verifyTheUserIsAbleToLoginWithInvalidCredentials() throws IOException 
  {
	  String username=ExcelUtility.getStringData(4, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(4, 1, "LoginPage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	  boolean ishomepageloaded=loginpage.isDashboardLoaded();
	  Assert.assertTrue(ishomepageloaded, "Home page is not loaded when user is entering invalid credentials");
	  
  }
  
}
