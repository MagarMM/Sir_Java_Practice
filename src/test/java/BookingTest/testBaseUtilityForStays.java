package BookingTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BookingStayPOM.BookingStayResultPage;
import BookingStayPOM.BookingStays;
import bookingBase.Base;
//@Listeners(BookingUtility.Listners.class)
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
		Reporter.log("Send City Name", true);
		stays.MyStartJournyPoint();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Enter Check In Date", true);
		stays.EnterCheckInDate();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Click On Flexible", true);
		stays.ClickOnFlexible();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Select Week", true);
        stays.selectWeek();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Reporter.log("Select Month", true);
        stays.selectOnMonth();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Reporter.log("Select Dates", true);
        stays.selectOnDates();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Reporter.log("Select Addults", true);
        stays.selectOnAdults();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Reporter.log("Click On Done Button", true);
        stays.clickOnDoneButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Reporter.log("Click On Search Button", true);
        stays.clickOnSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
	}
	
	@Test
	public void displaySortButton() throws InterruptedException 
	{
		Reporter.log("Validate Sort Button", true);
		Thread.sleep(6000);
		  boolean display = resultPage.displaySortButton();
		  Assert.assertTrue(display, "Sort Not Display");
	}
	
	@AfterClass
	public void closeTest() throws InterruptedException 
	{
		Reporter.log("Close TC", true);
		Thread.sleep(2000);
		tearDown();
		Thread.sleep(2000);
	}
	
	
	
	
}

