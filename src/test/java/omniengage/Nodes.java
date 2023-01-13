package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class Nodes {
	WebDriver driver;

	WebDriverWait wait;

	Nodes() {

		System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	public void LoginIN() throws InterruptedException {
		Login obj = new Login();
		obj.Loginpage();

	}

	public void Botmakerin() throws InterruptedException {
		Botmaker obj = new Botmaker();
		obj.BotmakerNode();
	}

	public void dragndropNodein() throws InterruptedException {
		dragndropnode obj = new dragndropnode();
		obj.dragndropNode();
	}

	public void calculateresultin() throws InterruptedException {
		Calculateresult obj = new Calculateresult();
		obj.Calcnode();

	}
}