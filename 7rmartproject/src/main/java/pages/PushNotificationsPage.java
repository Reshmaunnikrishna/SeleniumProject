package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationsPage {
	
	WebDriver driver;
	public PushNotificationsPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
		
		@FindBy(xpath="//p[text()='Push Notifications']")private WebElement pushnotification;
		@FindBy(xpath="//input[@id='title']")private WebElement titlefield;
		@FindBy(xpath="//input[@id='description']")private WebElement descriptionfield;
		@FindBy(xpath="//button[@type='submit']")private WebElement sendbutton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	    
	public void verifyIfUserIsAbleToClickOnPushNotifications()
	{
		 pushnotification.click();
	}
	public void verifyIfUserIsAbleToEnterOnTitleField(String title)
	{
		titlefield.sendKeys(title);
	}
	public void verifyIfUserIsAbleToEnterDescriptionOnDescriptionField(String description)
	{
		descriptionfield.sendKeys(description);
	}
	public void verifyIfUserIsAbleToClickOnSendButton()
	{
		sendbutton.click();
	}
	
	public boolean verifyIfAlertMessageIsDisplayed()
	{
		return alert.isDisplayed();
	}
	

}
