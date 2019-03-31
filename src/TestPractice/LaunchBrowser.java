package TestPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser{
	WebDriver driver;
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			driver.get("https:\\www.gmail.com");
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			driver.get("https:\\www.gmail.com");
	    }
		else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS); 
}
}
	public static void main(String[] args) {
		LaunchBrowser open = new LaunchBrowser();
	    open.openBrowser("chrome");
	}
}
