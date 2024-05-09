package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//Add new location by selecting country,state,location,delivery charge--> save and check alert message displayed
public class ManageLocation {
	WebDriver driver;
	public  ManageLocation(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
	 @FindBy(xpath="//p[text()='Manage Location']")private WebElement managelocationtile;
	 @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	 @FindBy(xpath="//select[@name='country_id']")private WebElement countrydropdown;
	 @FindBy(xpath="//select[@name='state_id']")private WebElement statedropdown;
	 @FindBy(xpath="//input[@name='location']")private WebElement locationfield;
	 @FindBy(xpath="//input[@name='delivery']")private WebElement deliverycharge;
	 @FindBy(xpath="//button[@name='create']")private WebElement savebutton;
	 @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertdisplay;
	 
	 public void verifyIfUserIsAbleToClickMangeLocationTile()
	 {
		 managelocationtile.click();
	 }
	 public void verifyIfUserIsAbleToClickOnNewButton()
	 {
		 newbutton.click();
	 }
	 public void countryDropdownfieldValue(int num)
	 {
		 Select select=new Select(countrydropdown);
		 select.selectByIndex(num);
		 
	 }
	 public void stateDropdownfieldValue(int num)
	 {
		 Select select=new Select(statedropdown);
		 select.selectByIndex(num);
		 
	 }
	 public void enterLocation(String location)
	 {
		 locationfield.sendKeys(location);
		 
	 }
	 public void enterDeleiveryCharge(String charge)
	 {
		 deliverycharge.sendKeys(charge);
		 
	 }
	 public void verifyIfUserIsAbleToClickOnSaveButton()
	 {
		 savebutton.click();
	 }
	 
	 public boolean verifyIfAlertMessageDisplayed()
	 {
		 return alertdisplay.isDisplayed();
	 }
	 
	 
	 
	 
}
