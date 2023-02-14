
	package omniengage;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class Login extends Nodes{ 
		WebDriver driver;
		WebDriverWait wait;
		
		@Test
		public void Loginpage() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
			driver = new ChromeDriver();
			this.driver.navigate().to("https://app.omniengage.co/login");
			this.driver.manage().window().maximize();
			this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[3]/div/input"))
					.sendKeys("anshumann.singh@venturepact.com");
			this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[4]/div[1]/input"))
					.sendKeys("Pass@123");
			this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/form/div/div[5]/input")).click();
			
		}

	}



