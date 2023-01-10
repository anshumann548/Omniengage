package omniengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Nodes {
	WebDriver driver;

	WebDriverWait wait;

	Nodes() {

		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void Login() {

		driver.navigate().to("http:app.outgrow.chat/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("anshumann.singh@venturepact.com");
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[4]/div[1]/input")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[5]/input")).click();
	}

	
	@Test(priority = 1)
	public void Botmaker() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[3]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\'cb\']")).sendKeys("Bot" + Math.random()*5);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/button\n")).click();
		}
}
