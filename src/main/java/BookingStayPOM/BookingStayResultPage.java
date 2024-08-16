package BookingStayPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingStayResultPage 
{

	//variables
	
	@FindBy(xpath = "//h1[contains(text(),' properties found')]") private WebElement text;
	@FindBy(xpath = "//div[@data-testid='property-card']") private List<WebElement> banners;
	@FindBy(className = "ace7a8247e") private WebElement sortButton;
	
	//constructor
	
	public BookingStayResultPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//method
	
	public int resultFromText() 
	{
		String[] ar = text.getText().split(" ");
		int textInInt = Integer.parseInt(ar[1]);
		return textInInt;
	}
	
	public int resultFromBanners() 
	{
		int sizeOfBanners = banners.size();
		return sizeOfBanners;
	}
	
	public boolean displaySortButton() 
	{
		boolean result = sortButton.isDisplayed();
		return result;
	}
	
}



