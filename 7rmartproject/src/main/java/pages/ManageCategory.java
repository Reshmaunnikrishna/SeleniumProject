package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory {
	WebDriver driver;
	public  ManageCategory(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}
		    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")private WebElement categorytile;
		    @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
		    @FindBy(xpath="//input[@placeholder='Enter the Category']")private WebElement categoryfield;
		    @FindBy(xpath="//li[@id='134-selectable']")private WebElement selectgroup;
		    @FindBy(xpath="//li[@id='134-selection']")private WebElement selectedgroup;
		    @FindBy(xpath="//input[@value='yes' and @name='top_menu']")private WebElement radio1;
		    @FindBy(xpath="//input[@value='yes' and @name='show_home']")private WebElement radio2;
		    @FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
		    @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertdisplay;

		    public void verifyIfUserIsAbleToClickCategoryTile()
			 {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",categorytile);
		   
			 }
			 public void verifyIfUserIsAbleToClickOnNewButton()
			 {
				 newbutton.click();
			 }
			 public void verifyIfUserIsAbleToEnterCategory(String category)
			 {
				 categoryfield.sendKeys(category);
			 }
			 public void verifyIfUserIsAbleToSelectGroups()
			 {
				 Actions action=new Actions(driver);
				 action.moveToElement(selectgroup).build().perform();
				 action.doubleClick(selectgroup).build().perform();
				 action.dragAndDrop(selectgroup, selectedgroup).build().perform();
			 }
			 public void verifyIfUserIsAbleToSelectRadioButton1()
			 {
				 radio1.click();
			 }
			 public void verifyIfUserIsAbleToSelectRadioButton2()
			 {
				 radio2.click();
			 }
			 
			 public void verifyIfUserIsAbleToClickOnSaveButton()
			 {
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",savebutton);
				
			 }
			 
			 public boolean isAlertPopupDisplayed()
			 {
				 return alertdisplay.isDisplayed();
			 }
			    
}
