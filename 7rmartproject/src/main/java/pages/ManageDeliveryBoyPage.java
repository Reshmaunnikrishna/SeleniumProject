package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	
	WebDriver driver;
	public  ManageDeliveryBoyPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
		    @FindBy(xpath="//p[text()='Manage Delivery Boy']")private WebElement deliveryboytile;
		    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchicon;
		    @FindBy(xpath="//input[@placeholder='Name']")private WebElement namefield;
		    @FindBy(xpath="//button[@type='submit']")private WebElement searchbutton ;
		    @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']")private WebElement table;
		    
		    public void verifyIfUserIsAbleToClickManageDeliveryBoyTile()
		    {
		    	deliveryboytile.click();
		    }
		    
		    public void verifyIfUserIsAbleToClickSearchButton()
		    {
		    	searchicon.click();
		    }
		    public void verifyIfUserIsAbleToEnterNameOnNameField(String name)
		    {
		    	namefield.sendKeys(name);
		    }
		    public void verifyIfUserIsAbleToClickTheSearchButtonUnderNameField()
		    {
		    	searchbutton.click();
		    }
		    public boolean verifyTheTableContainingTheDeliveryBoyNameDetailsDisplayed()
		    {
		    	return (table.isDisplayed());
		    }
		    
		    


}
