package co.com.sofka.certificacion.mystore.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverWeb {
	
	private DriverWeb() {}
	
	public static WebDriver andEnterThe(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized --incognito --disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
	}
}
