package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")));
		this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")).click();
		Thread.sleep(3000); //Getting on dashboard
		
		
		
		this.driver.findElement(By.xpath("//*[@id=\"cb\"]")).sendKeys("Bot" + Math.random() * 4);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/button\n")).click();
		Thread.sleep(5000);
                                //Creating another bot to send segment
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-5\"]/div[3]/div")));
		WebElement msgnode = this.driver.findElement(By.xpath("//*[@id=\"node-5\"]/div[3]/div"));
        act.dragAndDropBy(msgnode, -200, 90).build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[10]")).click(); // getting the segment node
	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/button")).click(); // clicking on pop-up of alert after adding segment  

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-6\"]/div[3]/div")));
		WebElement audiencenode = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[3]/div"));
        act.dragAndDropBy(audiencenode, 200, 90).build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[12]\n")).click(); // getting the send email node

		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sendEmail-head']")));
		this.driver.findElement(By.xpath("//*[@class='sendEmail-head']")).click();  // clicking over email receiver's field
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='rightSidebar-tarea condition']"))
				.sendKeys("anshumann.singh@venturepact.com");   // email reciever config setting

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_TAB); //email subject

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_TAB);  // email body

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[2]/div")).click(); // clicking over config fields to expand dropdown
		
		List<WebElement> configlist = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[2]/div/div/ul/li")); //getting every element of list

		for (WebElement element : configlist) {

			String desiredconfig = element.getText();
			String stm = "gmailsmtp";

			if (desiredconfig.equalsIgnoreCase(stm)) {
				element.click();   //comparing all elements with desired config
				break;
			}

		}
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[3]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[4]/div[3]/button")).click();
		           Thread.sleep(3000);
		//81-85 waiting for the save configuration button and saving it 
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[4]")).click(); // Publishing bot

		this.driver.findElement(By.xpath("//*[@id=\"phone\"]/div/div/div[1]/div/div[2]")).click();  // clicking over node normally
		Thread.sleep(3000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[4]/div/div[2]/div/button[1]")).click();// first
																													// node
																													// maker
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/div[1]/div[2]/div/div"))
				.click();  //clicking over field to get expanded dd
		Thread.sleep(4000);

		List<WebElement> botlist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div/ul/li")));
		Thread.sleep(3000); //getting all the elements of dd i.e. bot list

		for (WebElement element : botlist) {
			String desiredbot = element.getText();

			if (desiredbot.contains("bot0.9807084275897515 (Bot)")) {
				element.click();
				break;
				// Whole loop and if statement looking for desired bot
			}
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/div[2]/div[2]")).click();
		// Selecting time to send campaign

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[2]/div/button[2]\n")).click();
		// Sending campaign
	}
}
