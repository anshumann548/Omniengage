package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Chatanalytics extends Audiencetrigger 

{

@Test(priority = 9)
public void	Chatcheck() throws InterruptedException{

	
	driver.findElement(By.className("chats")).click();
	//opening chat
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/button[1]")).click();
	//handling pop up
	
	Thread.sleep(3000);
	
	
    
    WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'on-hover\']/li[113]")));
    JavascriptExecutor js = (JavascriptExecutor) driver ;
    js.executeScript("arguments[0].scrollIntoView(true);", ele);

    driver.findElement(By.xpath("//*[@id=\'on-hover\']/li[113]")).click();
          }
	
	
}
