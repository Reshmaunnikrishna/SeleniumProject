package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//check if delete function is working and alert pop up is displayed
public class ManagePage {
	
	WebDriver driver;
	public ManagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	 @FindBy(xpath="//p[text()='Manage Pages']")private WebElement managepagetile;
	 @FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")private WebElement deleteicon;
	 @FindBy(xpath="//a[@onclick=\"return confirm('Do you want to delete this Page?')\"]")private WebElement alertbutton;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertsuccess;
	
	 
	 public void verifyIfUserIsAbleToClickonManagePages()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",managepagetile);
			managepagetile.click();
		
	    }
	 
	 public void verifyIfUserIsAbleToClickonDeleteButton()
	    {
		 
		 	deleteicon.click();
		 	driver.switchTo().alert().accept();
		 
	    }
	 
	 public void verifyIfAlertButtonIsClicked()
		{
			alertbutton.click();
			driver.switchTo().alert().accept();
		}
		
	 public boolean verifyIfAlertPopupIsDisplayed()
	    {
		 	return alertsuccess.isDisplayed();
	    }
	 
}
