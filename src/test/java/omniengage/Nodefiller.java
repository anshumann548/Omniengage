package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
//Filling button node
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		
//Saving button node
		
		driver.findElement(By.xpath("//*[@id=\'node-7\']/div[2]/div")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[2]/div[4]/div/div/label/span")).click();
		
		WebElement buttonametwo = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[1]"));
		buttonametwo.sendKeys("b");
	
		
		WebElement buttonvaltwo = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[2]"));
		buttonvaltwo.sendKeys("9");
//Filling button node

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
//Saving button node
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'node-8\']/div[2]/div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[2]/div[4]/div/div/label/span")).click();
		
		WebElement buttonamethree = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[1]"));
		buttonamethree.sendKeys("c");
		Thread.sleep(3000);
		
		WebElement buttonvalthree = driver
				.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div/div[3]/div/div[2]/input[2]"));
		buttonvalthree.sendKeys("9");
//Filling button node

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
//Saving button node

		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'phone\']/div/div/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div[3]/div[1]/textarea")).sendKeys("20*20");
	
	//	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div[3]/div[3]/div/div/label/span")).click();
//Filling calculate result node
		
	    Thread.sleep(2000);
//		
//		robo.keyPress(KeyEvent.VK_TAB);
//		robo.keyRelease(KeyEvent.VK_TAB);
//
//		robo.keyPress(KeyEvent.VK_TAB);
//		robo.keyRelease(KeyEvent.VK_TAB);
//
//		
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[3]/button")).click();
		
//Saving calculate result node
		Thread.sleep(2000);
	
		
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div[4]")).click();

	
	
	}

}
