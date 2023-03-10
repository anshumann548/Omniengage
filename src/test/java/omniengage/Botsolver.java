package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Botsolver extends livebot {
	@Test(priority = 6)
	public void botsolver() throws AWTException, InterruptedException {
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator(); //getting all windows handle

		String parentid = (String) iterator.next();
		String childid = (String) iterator.next();

		driver.switchTo().window(childid); //switching to the child window

		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")));
		
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
	
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[3]/div[2]/div/div")));
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[3]/div[2]/div/div")).click();
		
		Thread.sleep(2000);
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[5]/div[2]/div/div")).click();
		
		Thread.sleep(2000);
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[7]/div[2]/div/div")).click();
//Clicking all three buttons
		
		driver.switchTo().window(parentid);
//Returning to parent window
		
	}
}