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

	
	public void runner() throws InterruptedException {
		Calculateresult obj = new Calculateresult();
		//functions called,you have to call the last function at first to create inverse calling hierarchy 
		obj.Loginpage();
		obj.BotmakerNode();
		obj.dragndropNode();
		obj.Calcnode();

	}
}