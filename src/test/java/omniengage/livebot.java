package omniengage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class livebot extends Nodefiller {
@Test(priority=5)
public void livebotopener () throws AWTException
{
	this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div[4]")).click();
	this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div[3]/div")).click();
	
	 Actions act = new Actions(driver);
	    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
}
}
