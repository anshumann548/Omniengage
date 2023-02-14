package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class audiencenode extends Botsolver {

	   @Test(priority = 7)
 	   public void audienceopener() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/ul/li[5]")).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[4]/div/div/div[2]/div[2]/button[1]")));
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div/div/div[2]/div[2]/button[1]")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/ul/li[1]/a")).click(); 
		
		// roaming into audience node
	}

}
