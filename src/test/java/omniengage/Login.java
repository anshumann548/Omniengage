
	package omniengage;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class Login {
		WebDriver driver;

		WebDriverWait wait;

		Login() {

			System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
			driver = new ChromeDriver();
		}

		@Test
		public void Loginpage() throws InterruptedException {
			driver.navigate().to("http:app.outgrow.chat/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[3]/div/input"))
					.sendKeys("anshumann.singh@venturepact.com");
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[4]/div[1]/input"))
					.sendKeys("Pass@123");
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[5]/input")).click();
			Thread.sleep(5000);
		}

	}



