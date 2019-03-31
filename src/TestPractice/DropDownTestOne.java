package TestPractice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestOne {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	RemoteWebDriver webDriver = new ChromeDriver();
	webDriver.navigate().to("https://www.facebook.com");
	
//codes for select methods
    WebElement element_Day = webDriver.findElement(By.id("day"));
    
    Select select = new Select(element_Day);
    if(select.isMultiple()){
    	System.out.println("multiselect");
    }else
    {
    	System.out.println("X not a multiselect ");
    }
    select.selectByIndex(12);
    select.selectByIndex(28);
    select.selectByValue("22");
    select.selectByVisibleText("9");
    
    List<WebElement> dropdown = select.getOptions();
    System.out.println("total elements " + dropdown.size());
    
    Set set = new HashSet();
    	set.add(dropdown);
	System.out.println("number of non duplicated "+ set.size());
}
}
