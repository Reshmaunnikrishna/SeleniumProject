package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage {
	
	WebDriver driver;
	public ManagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	 @FindBy(xpath="//p[text()='Manage Pages']")private WebElement managepagetile;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/edit?edit=1301&page_ad=1']")private WebElement deleteicon;
	// @FindBy(xpath="")private WebElement deliveryboytile;
	
	 
	 public void verifyIfUserIsAbleToClickonManagePages()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",managepagetile);
			managepagetile.click();
		
	    }
	 
	 public void verifyIfUserIsAbleToClickonDeleteButton()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
		 	executor.executeScript("arguments[0].click();",deleteicon);
		 	deleteicon.click();
		 
	    }
	 public void verifyIfAlertPopupIsDisplayed()
	    {

	    }
	 
}
