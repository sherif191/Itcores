package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	
	

	
	@FindBy(id ="bigsearch-query-location-input")
	public WebElement location ; 
	
	@FindBy(xpath ="//*[@id=\"bigsearch-query-location-suggestion-0\"]")
	public WebElement firstopetion ; 
	
			@FindBy(xpath ="//*[@data-testid='structured-search-input-field-split-dates-0']")
			public WebElement calener ; 
//	@FindBy(xpath ="//div[@id='panel--tabs--0']/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr/td[5]/div/div")
//	public WebElement checkins ; 
	@FindBy(xpath ="//div[@data-testid='datepicker-day-2021-12-07']")
	public WebElement checkin ; 
	@FindBy(xpath ="//div[@data-testid='datepicker-day-2021-12-14']")
	public WebElement checkout ; 
	

			
			@FindBy(xpath ="//div[@data-testid='structured-search-input-field-guests-button']")
			public WebElement guestt ; 
	
//			
			@FindBy(xpath ="//div[@id='stepper-adults']/button[2]/span")
			public WebElement add_adult ; 
			@FindBy(xpath ="//div[@id='stepper-children']/button[2]/span")
			public WebElement add_child; 
			
			
			@FindBy(xpath ="//div[@id='search-tabpanel']/div/div[5]/div[4]/button/span/span")
			public WebElement Search; 
			
			@FindBy(xpath="//div[@class='_1g5ss3l']")
			public WebElement titlee; 
			

	
	

	
	
	


	
	public void search()  
	{
		location.click();
		location.sendKeys("Roma");
		firstopetion.click();
		checkin.click();
		checkout.click();
		
		//

		guestt.click();
		for(int i=0;i<2;i++) {
			add_adult.click();
			
		}
	add_child.click();
	
	Search.click();
	//System.out.print(titlee.isDisplayed());
		
	}
	
	

	
	
	

}
