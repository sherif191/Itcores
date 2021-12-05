package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class searchPage extends PageBase
{
	public searchPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
		//WebDriverWait waitt = new WebDriverWait(driver, 15);

	}
//
//    public IWebElement adminbutton => Helper.LocateElement(Locators.ID, "menu_admin_viewAdminModule");
//    public IWebElement search_userName => Helper.LocateElement(Locators.ID, "searchSystemUser_userName");
//    public IWebElement search_button => Helper.LocateElement(Locators.ID, "searchBtn");
//    public IList<IWebElement> listtt =>Helper.LocateElements(Locators.ID, "//tr[@class='left']");
//    public IWebElement user => Helper.LocateElement(Locators.Xpath, "//td[@class='left']/a");
//
//    public IWebElement username => Helper.LocateElement(Locators.ID, "systemUser_userName");
	
	@FindBy(id ="searchSystemUser_userName")
	public WebElement search_userName ; 

	
	@FindBy(id="searchBtn")
	public WebElement search_button ; 

	
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Location'])[1]/following::div[1]")
	public WebElement title; 
	
	@FindBy(xpath="//h1[@class='_78tyg5']")
	public WebElement search; 
	@FindBy(xpath="//button[@aria-label='Filters']")
	public WebElement Filter; 
	@FindBy(xpath="//button[@data-testid='filterItem-rooms_and_beds-stepper-min_bedrooms-0-increase-button']")
	public WebElement Add_BedRooms; 
//	@FindBy(xpath="//*[@id=\"filterItem-facilities-checkbox-amenities-7-row-checkbox\"]")
//	public WebElement Pool; 
	@FindBy(xpath="//*[@id=\"filterItem-amenities-checkbox-amenities-7\"]/label/div/div[1]")
	public WebElement Pool; 
	//div[@id='filterItem-amenities-checkbox-amenities-7']/label/div/div/span/span
	@FindBy(xpath="//a[contains(text(),'Show')]")
	public WebElement show; 
	@FindBy(xpath="//div[@aria-labelledby='title_37701630'")
	public WebElement First_proprtity; 
	
	
	

	@FindBy(id = "systemUser_employeeName_empName")
    public WebElement emplyee;
	

    @FindBy(id = "systemUser_userName")
    public WebElement usernamefield;
	

	
	public void searchforuser(String enter_user_tosearch) 
	{
		 search_userName.sendKeys(enter_user_tosearch);
         search_button.click();
        // user_details.click();

	
	}
	
	public void searchforusher(String enter_user_tosearch) 
	{
		 search_userName.sendKeys(enter_user_tosearch);
         search_button.click();
        // user_details.click();

	
	}
	

	public void Show() throws InterruptedException {
		
Filter.click();
for(int i=0;i<5;i++) {
	Add_BedRooms.click();
	
}



Pool.click();
show.click();

First_proprtity.click();

	}

	
	

}
