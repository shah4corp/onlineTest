package TestPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class ForEachTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	SessionId sessionId = driver.getSessionId();
	System.out.println("SessionId is : "+ sessionId);
	
	driver.get("http:\\www.adp.com");
	List<WebElement> elems =driver.findElements(By.xpath("//*"));
	int linksCount = 0;
	int adpcount = 0;
	for(WebElement ele : elems)
	{
		if(ele.getTagName().equalsIgnoreCase("a"))
		{
			linksCount++;
		}
		String text = ele.getText();
		if(text.contains("adp"))
		{
			adpcount++;
		}
	}
	System.out.println("No of elements with links are " + elems.size());
	System.out.println("No of links are " + linksCount);
	System.out.println("No of elements with adp are " + adpcount);
}
}
