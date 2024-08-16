package BookingStayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingStays
{
	
	
	// variable
	
	@FindBy(xpath = "//input[@name='ss']") private WebElement StartJourny;
	@FindBy(xpath = "//span[contains(text(),'Check-in')]") private WebElement CheckInDate;
	@FindBy(xpath = "(//div[@class='ec7ca45eb7'])[8]") private WebElement Flexible;
	@FindBy(xpath = "//div[text()='A week']") private WebElement Week;
	@FindBy(xpath = "//span[text()='Sep']") private WebElement month;
	@FindBy(xpath = "//span[text()='Select dates']") private WebElement dates;
	@FindBy(className = "a6391e882c") private WebElement adultes;
	@FindBy(xpath = "//span[text()='Done']") private WebElement doneButton;
	@FindBy(xpath = "//span[text()='Search']") private WebElement searchButton;
	
	
	//constructor
	
	public BookingStays(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method 
	
    public void MyStartJournyPoint() 
    {
    	StartJourny.sendKeys("Pune");	
    }
	
    public void EnterCheckInDate() 
    {
    	CheckInDate.click();
    	
    }
	
    public void ClickOnFlexible() 
    {
    	Flexible.click();
    }
    
    public void selectWeek() 
    {
    	Week.click();
    }
    
    public void selectOnMonth() 
    {
    	month.click();
    }
    
    public void selectOnDates() 
    {
    	dates.click();
    }
    
    public void selectOnAdults() 
    {
    	adultes.click();
    }
    
    public void clickOnDoneButton() 
    {
    	doneButton.click();
    }
    
    public void clickOnSearchButton() 
    {
    	searchButton.click();
    }
}
