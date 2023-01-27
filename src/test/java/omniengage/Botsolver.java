package omniengage;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Botsolver extends livebot{
	@Test(priority=6)
	public void botsolver () throws AWTException, InterruptedException
{
	Set <String> handles  =	driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	
	String parentid = (String)iterator.next();
	String childid = (String)iterator.next();
	
	
	driver.switchTo().window(childid);
	
		Thread.sleep(4000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[3]/div[2]/div/div")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[5]/div[2]/div/div")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[7]/div[2]/div/div")).click();
	
		driver.switchTo().window(parentid);
	}
}