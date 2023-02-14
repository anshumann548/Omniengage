package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Botmaker extends Login{ 

	Botmaker() {
	
	}
    
	@Test(priority = 2)
	public void BotmakerNode() throws InterruptedException {
	
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")));
		
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")).click();
		this.driver.findElement(By.xpath("//*[@id=\'cb\']")).click();
		this.driver.findElement(By.xpath("//*[@id=\'cb\']")).sendKeys("Bot" + Math.random() * 5);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/button\n")).click();
	
		Thread.sleep(5000);
	}

}
//Creating a bot