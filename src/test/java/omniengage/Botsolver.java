package omniengage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Botsolver extends livebot{
	@Test(priority=6)
	public void botsolver () throws AWTException, InterruptedException
{
		Thread.sleep(2000);
	WebElement ele = this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[3]/div[2]/div/div/p"));
	ele.click();
	System.out.println(ele	
				
				
					
			);
	
	
	

	}
}