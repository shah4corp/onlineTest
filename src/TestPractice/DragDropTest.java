package TestPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class DragDropTest {
public static void main(String[] args) {
    RemoteWebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    SessionId sessionId = driver.getSessionId();
    System.out.println("Session Id is :" + sessionId);
    driver.get("https://www.jqueryui.com");    
    WebElement draggable = driver.findElement(By.linkText("Autocomplete"));
    Actions actions = new Actions(driver);
    actions.click(draggable).perform();
    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
    System.out.println("Total numbers of frames in draggable is : " + frames.size());
    driver.switchTo().frame(0);
    driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Selenium");
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Droppable")).click();
    driver.switchTo().frame(0);
    WebElement draggable1 = driver.findElement(By.id("draggable"));
    WebElement droppable1 = driver.findElement(By.id("droppable"));
    actions.dragAndDrop(draggable1, droppable1).build().perform();

}
}