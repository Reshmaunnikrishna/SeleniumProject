package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageExpense {

		WebDriver driver;
		public ManageExpense(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver , this);
		}

		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/expense']")private WebElement manageexpensetile;
		@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
		@FindBy(xpath="//select[@name='user_id']")private WebElement userdropdown;
		@FindBy(xpath="//input[@id='ex_date']")private WebElement date;
		@FindBy(xpath="//table/tbody/tr[3]/td[2]") private WebElement dateselection;
		@FindBy(xpath="//select[@name='ex_cat']")private WebElement categorydropdown;
		@FindBy(xpath="//select[@name='order_id']")private WebElement orderiddropdown;
		@FindBy(xpath="//select[@name='purchase_id']")private WebElement purchaseiddropdown;
		@FindBy(xpath="//select[@name='ex_type']")private WebElement expensetypedropdown;
		@FindBy(xpath="//input[@name='amount']")private WebElement amountfield;
		@FindBy(xpath="//textarea[@name='remarks']")private WebElement remarksfield;
		@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;

		public void verifyIfeUserIsAbleToClickOnManageExpense()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",manageexpensetile);
			//manageexpensetile.click();
		}
		public void verifyIfUserIsAbleToClickOnNewIcon()
		
		{
			newbutton.click();
		}
		public void verifyIfUserIsAbleToSelectTheUser(int user)
		{
			Select select=new Select(userdropdown);
			select.selectByIndex(user);
		}
		public void verifyIfUserIsAbleToChooseTheDate()
		{
			date.click();
			dateselection.click();
		}

		public void verifyIfUserIsAbleToSelectTheCategory(int category)
		{
			Select select=new Select(categorydropdown);
			select.selectByIndex(category);
		}
		public void verifyTheUserIsAbleToSelectTheOrderID(int orderid)
		{
			Select select=new Select(orderiddropdown);
			select.selectByIndex(orderid);
		}
		public void verifyTheUserIsAbleToSelectThePurchaseID(int purchaseid)
		{
			Select select=new Select(purchaseiddropdown);
			select.selectByIndex(purchaseid);
		}
		public void verifyTheUserIsAbleToSelectTheExpenseType(int expensetype)
		{
			Select select=new Select(expensetypedropdown);
			select.selectByIndex(expensetype);
		}
		public void verifyTheUserIsAbleToEnterTheAmount(int amount)
		{
			 String amountString = String.valueOf(amount);
			    amountfield.sendKeys(amountString);
		}
		public void verifyTheUserIsAbleToEnterTheRemarks( String remarks)
		{
			remarksfield.sendKeys(remarks);
		}
		public void verifyTheUserIsAbleToSaveTheItem()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",savebutton);
			savebutton.click();
		}
		public boolean isAlertDisplayed()
		{
			return alerttext.isDisplayed();
		}	


}
