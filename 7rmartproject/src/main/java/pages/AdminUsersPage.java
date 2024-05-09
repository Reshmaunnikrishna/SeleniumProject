package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//Add new user in this page by giving uname,pwd and usertype --> save
public class AdminUsersPage {
	WebDriver driver;
	public  AdminUsersPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
		    @FindBy(xpath="//p[text()='Admin Users']")private WebElement adminuserstile;
		    @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
		    @FindBy(xpath="//input[@name='username']")private WebElement usernamefield;
		    @FindBy(xpath="//input[@name='password']")private WebElement passwordfield;
		    @FindBy(xpath="//select[@name='user_type']")private WebElement dropdown;
		    @FindBy(xpath="//button[@name='Create']")private WebElement savebutton;
		    @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertpopup;
		    
		    
		    
		    public void verifyIfUserIsAbleToClickAdminUsersTile()
		    {
		    	adminuserstile.click();
		    }
		    public void verifyIfUserIsAbleToClickonNewButtonUnderAdminUsers()
		    {
		    	newbutton.click();
		    }
		    public void enterUsernameInUsernameField(String uname)
		    {
		    	usernamefield.sendKeys(uname);
		    }
		    public void enterPasswordInPasswordField(String pwd)
		    {
		    	passwordfield.sendKeys(pwd);
		    }
		    public void selectUserTypeFromDropdown()
		    {
		    	Select select=new Select(dropdown);
		    	select.selectByIndex(1);
		    }	
		    public void clickOnSaveButton()
		    {
		    	savebutton.click();
		    }
		    public boolean isAlertPopupDisplayed()
		    {
		    	return alertpopup.isDisplayed();
		    }
		    
		    
}
