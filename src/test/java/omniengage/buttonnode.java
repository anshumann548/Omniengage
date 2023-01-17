package omniengage;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class buttonnode extends dragndropnode { 
	@Test(priority = 4)
	public void butnode() throws InterruptedException {
	Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));

	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-6\']/div[2]/div/div[2]/div[2]/div/div")));
    WebElement from = this.driver.findElement(By.xpath("//*[@id=\'node-6\']/div[2]/div/div[2]/div[2]/div/div"));

  
	Actions act = new Actions(this.driver);
    act.dragAndDropBy(from, 50,50).build().perform();
   this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[2]/div[4]")).click();
}
	}
