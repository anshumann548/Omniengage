package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Nodefiller extends dragndropnode {

	@Test(priority = 4)
	public void inserter() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//*[@id=\'button_1\']")).click();
		
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[2]/div[4]/div/div/label/span")).click();
		
        WebElement buttoname = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[1]"));
		buttoname.sendKeys("a");
		Thread.sleep(3000);
		WebElement buttonval = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[2]"));
		buttonval.sendKeys("9");

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		
		driver.findElement(By.xpath("//*[@id=\'node-7\']/div[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[2]/div[4]/div/div/label/span")).click();
		WebElement buttonametwo = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[1]"));
		buttonametwo.sendKeys("b");
		Thread.sleep(3000);
		WebElement buttonvaltwo = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[2]"));
		buttonvaltwo.sendKeys("9");

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//*[@id=\'node-8\']/div[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[2]/div[4]/div/div/label/span")).click();
		WebElement buttonamethree = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[1]"));
		buttonamethree.sendKeys("b");
		Thread.sleep(3000);
		WebElement buttonvalthree = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[2]"));
		buttonvalthree.sendKeys("9");

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'phone\']/div/div/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div[3]/div[1]/textarea")).sendKeys("20*20");
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div[3]/div[3]/div/div/label/span")).click();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
//a*a + b*b + c*c + 2ab + 2bc + 2ca