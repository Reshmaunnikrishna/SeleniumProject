package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//check if user is able to add new news under this page and also edit news function is working
public class ManageNewsPage {
	WebDriver driver;
	public  ManageNewsPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
	 @FindBy(xpath="//p[text()='Manage News']")private WebElement managenewstile;
	 @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newicon;
	 @FindBy(xpath="//textarea[@name='news']")private WebElement newsfield;
	 @FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertdisplay;
	 @FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'][1]")private WebElement editicon;
	 @FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement editnewsfield;
	 @FindBy(xpath="//button[@name='update']")private WebElement updatebutton;
	 
	 public void verifyIfUserIsAbleToClickMangeNewsTile()
	    {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",managenewstile);
			managenewstile.click();
	    }
	 
	 public void verifyIfUserIsAbleToClickonNewButtonUnderMangeNews()
	    {
	    	newicon.click();
	    }
	 public void verifyIfUserIsAbleToEnterNews(String news)
	    {
		 newsfield.sendKeys(news);
	    }
	 
	 public void verifyIfUserIsAbleToSaveTheChanges()
	    {
		 savebutton.click();
	    }
	 
	 public boolean verifyIfAlertDisplayed()
	    {
	    	return alertdisplay.isDisplayed();
	    }
	 public void clickOnEditButton()
	    {
		 editicon.click();
	    }
	 public void updateNewsField(String newsedit)
	    {
		 editnewsfield.sendKeys(newsedit);
	    }
	 public void clickOnUpdateButton()
	    {
		 updatebutton.click();
	    }
	
	 
	
}
