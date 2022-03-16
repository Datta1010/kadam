package Com.BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void inc(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Datta\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get(url);
	
	
	}

}
