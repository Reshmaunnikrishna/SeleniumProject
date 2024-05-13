package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageOfferCode {
	WebDriver driver;
	public ManageOfferCode(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']")private WebElement manageoffercodetile;
	 @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	 @FindBy(xpath="//input[@name='offer_code']")private WebElement offercodefield;
	 @FindBy(xpath="//input[@value='yes']")private WebElement radiobutton1;
	 @FindBy(xpath="//input[@name='offer_price']")private WebElement amountfield;
	 @FindBy(xpath="//button[@name='create']")private WebElement savebutton;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	 
	 public void verifyIfUserIsAbleToClickonManageOfferCode()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",manageoffercodetile);
			manageoffercodetile.click();
		
	    }
	 public void verifyIfUserIsAbleToClickonNewButton()
	    {
		 	newbutton.click();
	    }
	 public void verifyIfUserIsAbleToEnterOfferCodeValue(String offercode)
	    {
		 offercodefield.sendKeys(offercode);
	    }
	 public void verifyIfUserIsAbleToSelectFirstOrderUser()
	    {
		 radiobutton1.click();
		 System.out.println(radiobutton1.isSelected());
	    }
	 public void verifyIfUserIsAbleToEnterAmountValue(String amount)
	    {
		 amountfield.sendKeys(amount);
	    }
	 public void verifyIfUserIsAbleToClickonSaveButton()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",savebutton);
			savebutton.click();
	    }
	 public boolean verifyIfAlertIsDisplayed()
	    {
		 	return alert.isDisplayed();
	    }
}
