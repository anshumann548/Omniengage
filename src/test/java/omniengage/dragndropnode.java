package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class dragndropnode {
	WebDriver driver;

	WebDriverWait wait;

	dragndropnode() {

		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		driver = new ChromeDriver();
		}

	
	
	
	
	@Test(priority = 2)
	public void dragndropNode() throws InterruptedException {
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(60000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'drawflow\']")));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'drawflow\']"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-5\']/div[3]/div")));
		WebElement from = driver.findElement(By.xpath("//*[@id=\'node-5\']/div[3]/div"));

		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[3]/div[6]")).click();
	}

}
