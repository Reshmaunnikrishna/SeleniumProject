package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Create a class loginpage inside src/main/java and logintest in src/test/java
public class LoginPage {
	
	public WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	
		
	    @FindBy(xpath="//input[@type='text']")private WebElement usernamefield;
	    @FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordfield;
	    @FindBy(xpath="//button[@type='submit']")private WebElement submitbutton;
	    @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertbutton;
	    @FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	    

	public void enterUserNameOnUserNameField(String username)
	{
		usernamefield.sendKeys(username);
		
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordfield.sendKeys(password);
		
	}
	
	public void submitButtonClick()
	{
		submitbutton.click();
	}

	
	public boolean alertDisplay()
	{
		return alertbutton.isDisplayed();
	}
	
	public boolean isDashboardLoaded()
	{
		return dashboard.isDisplayed();
	}
	
}
