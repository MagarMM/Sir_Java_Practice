package BookingTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BookingStayPOM.BookingStayResultPage;
import BookingStayPOM.BookingStays;
import bookingBase.Base;

public class testBaseUtilityForStays extends Base
{

	
	BookingStayResultPage resultPage;
	BookingStays stays;
	
	
	@BeforeTest
	public void initializeElement() throws InterruptedException 
	{
		
		openBrowser();
		
		
		resultPage=new BookingStayResultPage(driver);
		stays=new BookingStays(driver);
		
	}
	
	@BeforeClass
	public void preConditions() throws InterruptedException 
	{
		Thread.sleep(2000);
		stays.MyStartJournyPoint();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		stays.EnterCheckInDate();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		stays.ClickOnFlexible();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.selectWeek();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.selectOnMonth();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.selectOnDates();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.selectOnAdults();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.clickOnDoneButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        stays.clickOnSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
	}
	
	@Test
	public void displaySortButton() throws InterruptedException 
	{
		Thread.sleep(6000);
		  boolean display = resultPage.displaySortButton();
		  Assert.assertTrue(display, "Sort Not Display");
	}
	
	@AfterClass
	public void closeTest() throws InterruptedException 
	{
		Thread.sleep(2000);
		tearDown();
		Thread.sleep(2000);
	}
	
	
	
	
}

