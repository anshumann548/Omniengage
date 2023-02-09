package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Audiencetrigger extends audiencenode {
	@Test(priority = 8)
	public void rfopener() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));
		Actions act = new Actions(this.driver);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/div/a/div/div[2]")));
//		this.driver
//				.findElement(By.xpath(
//						"//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/div/a/div/div[2]"))
//				.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-9\"]/div[3]/div")));
//		WebElement fromresultnode = this.driver.findElement(By.xpath("//*[@id=\"node-9\"]/div[3]/div"));
//
//		act.dragAndDropBy(fromresultnode, -700, 290).build().perform();
//		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[10]")).click();
//		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/button")).click();
//
//		WebElement webhookpuller = this.driver.findElement(By.xpath("//*[@id=\"node-10\"]/div[3]/div"));
//		WebElement webhookdropper = this.driver.findElement(By.xpath("//*[@id=\"node-4\"]/div[1]/div"));
//		act.dragAndDrop(webhookpuller, webhookdropper).build().perform();
//
//		this.driver.findElement(By.xpath("//*[@id=\"node-10\"]/div[2]/div/div/div[1]/div/div[2]")).click();
//		Thread.sleep(2000);
//		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/button[1]")).click();
//		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")));
		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div"));
		this.driver.findElement(By.xpath("//*[@id=\"cb\"]")).sendKeys("Bot" + Math.random() * 4);
		this.driver
				.findElement(By
						.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/button\n"))
				.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-5\"]/div[3]/div")));
		WebElement msgnode = this.driver.findElement(By.xpath("//*[@id=\"node-5\"]/div[3]/div"));
		act.dragAndDropBy(msgnode, -200, 90).build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[10]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-6\"]/div[3]/div")));
		WebElement audiencenode = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[3]/div"));
		act.dragAndDropBy(audiencenode, -200, 90).build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[12]\n")).click();
		Thread.sleep(3000);
		this.driver.findElement(By.xpath("//*[@id=\"phone\"]/div/div/div[1]/div")).click();
		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div[2]/div/input")).click();
	
		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[4]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[4]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"phone\"]/div/div/div[1]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/div[1]/div[2]/div/div/span")).click();
		
	
	}
}

// Work pending need to complete segment selection and so on