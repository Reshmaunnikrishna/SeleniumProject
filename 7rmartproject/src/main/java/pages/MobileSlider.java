package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobileSlider {
	
	WebDriver driver;
	public MobileSlider(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider']")private WebElement mobileslidertile;
	 @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	 @FindBy(xpath="//select[@id='cat_id']")private WebElement selectcategory;
	 @FindBy(xpath="//button[@type='submit']")private WebElement savebtn;
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertmsg;

	 public void verifyIfUserIsAbleToClickonMobileSlider()
	    {
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",mobileslidertile);
			mobileslidertile.click();
		
	    }
	 public void verifyIfUserIsAbleToClickonNewbutton()
	    {
		 	newbutton.click();
	    }
	 public void verifyIfUserIsAbleToSelectCategory(String category)
	    {
		 Select select=new Select(selectcategory);
		 select.selectByVisibleText(category);
	    }
	 public void verifyIfUserIsAbleToSaveTheItem()
	 	{
		 savebtn.click();
	 	}
	 public boolean verifyIfAlertIsDisplayed()
	    {
		 	return alertmsg.isDisplayed();
	    }
	 
}
