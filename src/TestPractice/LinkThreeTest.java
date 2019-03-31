package TestPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class LinkThreeTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	SessionId s = driver.getSessionId();
	System.out.println("session id is : " + s);
	driver.navigate().to("https://www.google.com/");
	String str = driver.getTitle();
	System.out.println("pagesource is :" + str);
	driver.findElement(By.name("q")).sendKeys("Selenium by ramesh anupati");
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ENTER).perform();
    String str1 = driver.getTitle();
	System.out.println("pagesource123  is :" + str1);
    driver.findElement(By.xpath("//*[contains(text(),'Selenium : Selenium WebDriver By Ramesh Anapati')]")).click();
    List<WebElement> elems = driver.findElements(By.tagName("a"));
    int el=0;
    int dl=0;
    for(WebElement ele : elems){
    	if(ele.isEnabled()&&ele.isDisplayed())
    	{
    		el++;
    	}
    	else
    	{
    		dl++;
    	}    
    	}
    System.out.println("enabled links" + el);
    System.out.println("disabled links"+ dl);
}
}
