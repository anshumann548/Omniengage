package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dragndropnode extends Botmaker {

	@Test(priority = 3)
	public void dragndropNode() throws InterruptedException {
		Thread.sleep(3000);

		Actions act = new Actions(this.driver);
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-5\']/div[3]/div")));
		WebElement from = this.driver.findElement(By.xpath("//*[@id=\'node-5\']/div[3]/div"));
        act.dragAndDropBy(from, 50, -250).build().perform();
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[2]/div[3]")).click();
//Button 1
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-6\']/div[2]/div/div[2]/div[2]/div/div")));
		WebElement fromagain = this.driver.findElement(By.xpath("//*[@id=\'node-6\']/div[2]/div/div[2]/div[2]/div/div"));
        act.dragAndDropBy(fromagain, 40, -100).build().perform();
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[2]/div[3]")).click();
//Button 2
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-7\']/div[2]/div/div[2]/div[2]/div/div")));
		WebElement fromagainnext = this.driver.findElement(By.xpath("//*[@id=\'node-7\']/div[2]/div/div[2]/div[2]/div/div"));
        act.dragAndDropBy(fromagainnext, -400, 90).build().perform();
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[2]/div[3]")).click();
//Button 3
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'node-8\']/div[2]/div/div[2]/div[2]/div/div")));
		WebElement fromforcalc = this.driver.findElement(By.xpath("//*[@id=\'node-8\']/div[2]/div/div[2]/div[2]/div/div"));
        act.dragAndDropBy(fromforcalc, -500, 50).build().perform();
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[3]/div[1]/div[2]/div[7]")).click();
//Result node
	
		
	}

}
