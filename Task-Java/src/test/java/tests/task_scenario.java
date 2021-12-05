package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.searchPage;

public class task_scenario extends TestBase {
	

	HomePage homeObject;
	searchPage searchObject;

	@BeforeClass
	public void setuppp() 
	{
		homeObject = new HomePage(driver); 
		searchObject = new searchPage(driver); 

		
	}

	@Test(priority = 1, alwaysRun = true)
	public void Verify_title_of_search()  {

		
		
		homeObject.search();
		Assert.assertEquals(searchObject.search.getText(),"300+ stays in Metropolitan City of Rome" );

	}
//	@Test(priority = 2, alwaysRun = true)
//	public void Verify_Search() throws InterruptedException  {
//
//		
//		searchObject.Show();
//
//	}
	
	



}
