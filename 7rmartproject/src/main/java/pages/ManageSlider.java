package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;

public class ManageSlider {
	WebDriver driver;
	public ManageSlider(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider']")private WebElement manageslidertile;
	 @FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	 @FindBy(xpath="//input[@id='main_img']")private WebElement choosefilebutton;
	 @FindBy(xpath="//input[@id='link']")private WebElement linktextfield;
	 @FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	 @FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alert;
	 @FindBy(xpath="//a[contains(@onclick,'return confirm')]") private WebElement deleteicon;

	 public void manageSliderTileClick()
	 {
	 	manageslidertile.click();
	 }

	 public void newButtonClick()
	 {
	 	newbutton.click();
	 }

	 public void chooseFileButtonClick() throws AWTException
	 {
	 	FileUploadUtility fileuploadutility = new FileUploadUtility();
	 	//fileuploadutility.fileuploadUsingRobertClass(choosefilebutton, Constants.MANAGESLIDERIMAGE);
	 	fileuploadutility.fileUploadUsingSendKeys(choosefilebutton, Constants.IMAGE);
	 }

	 public void passingValueTolinkTextField(String txt)
	 {
	 	linktextfield.sendKeys(txt);
	 }

	 public void saveButtonClick()
	 {
	 	savebutton.click();
	 }

	 public boolean isAlertDisplayed()
	 {
	 return alert.isDisplayed();

	 }
	 public void deleteButtonClick()
	 {
	 	deleteicon.click();
	 	driver.switchTo().alert().accept();
	   
	 }
	 

}
