package TestPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class TestOne {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	SessionId sessionId = driver.getSessionId();
	System.out.println("sessionId : "+ sessionId);
	
}
}
