package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact {
	WebDriver driver;
	public  ManageContact(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
		    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")private WebElement managecontact;
		    @FindBy(xpath="//a[@role='button']")private WebElement editbutton;
		    @FindBy(xpath="//input[@id='phone']")private WebElement phonefield;
		    @FindBy(xpath="//button[@name='Update']")private WebElement updatefield;
		    @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertpopup;
		    
		    public void verifyIfUserIsAbleToClickManageContact()
		    {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",managecontact);
		    }
		    public void verifyIfUserIsAbleToClickonEditButtonUnderManageContact()
		    {
		    	editbutton.click();
		    }
		    public void enterPhoneNumToBeEdited(String phone)
		    {
		    	phonefield.sendKeys(phone);
		    }
		    public void clickOnUpdateButton()
		    {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",updatefield);
		    }

		    public boolean isAlertPopupDisplayed()
		    {
		    	return alertpopup.isDisplayed();
		    }
		    
}
