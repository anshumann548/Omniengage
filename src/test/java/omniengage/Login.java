
package omniengage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class Login {
	WebDriver driver;
	WebDriverWait wait;

	
@Test
	public void Loginpage( WebDriver driver) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		this.driver = driver;

		this.driver.manage().window().maximize(); // maximizing window

		this.driver.navigate().to("https://app.outgrow.chat/login"); // navigating to url

//		this.driver.manage().window().maximize(); // maximizing window

		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[3]/div/input"))
		
		.sendKeys("anshumann.singh@venturepact.com");
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[4]/div[1]/input"))
		
		.sendKeys("Pass@123");
		// Sending user name and password

		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[5]/input")).click();
		// Clicking submit
	}

}
