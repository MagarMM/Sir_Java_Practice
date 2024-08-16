package bookingBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	static protected WebDriver driver;

	public void openBrowser() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://booking.com/");
		driver.manage().window().maximize();

	}

	public void tearDown() {
		driver.close();
	}
}
