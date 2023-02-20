package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class livebot extends Nodefiller {
@Test(priority=5)
public void livebotopener () throws AWTException, InterruptedException
{
	
	this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div[3]/div")).click();
	((JavascriptExecutor) driver).executeScript("window.open()");// launching a new tab
	
	Robot robo = new Robot();

	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);

	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);

	Thread.sleep(3000);
	
	robo.keyPress(KeyEvent.VK_BACK_SPACE);
	robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
//21-45 Pasting the copied link into the new tab	
    }
}
