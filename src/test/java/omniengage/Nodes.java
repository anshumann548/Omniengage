package omniengage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Nodes {
	WebDriver driver ;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		
		// Check if parameter passed from TestNG is 'firefox'
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			// create firefox instance
			
			System.setProperty("webdriver.gecko.driver", "/home/anshumann/Downloads/geckodriver");
			
			this.driver = new FirefoxDriver(); // initializing driver
		
		} 
		
		// Check if parameter passed as 'chrome'
		
		else if (browser.equalsIgnoreCase("chrome")) {
		
			// set path to chromedriver.exe
			
			System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
			
			// create chrome instance
			
			this.driver = new ChromeDriver();
		}

		// Check if parameter passed as 'Edge'
		
		else if (browser.equalsIgnoreCase("Edge")) {
		
			// set path to Edge.exe
			
			System.setProperty("webdriver.edge.driver", "/home/anshumann/Downloads/msedgedriver");
			
			// create Edge instance
				this.driver = new EdgeDriver();
		}
		
		else {
			
			// If no browser passed throw exception
			
			throw new Exception("Browser is not correct");
		}
		
		Thread.sleep(5000);

	}
	public void controller() throws InterruptedException, AWTException {

		Chatanalytics obj = new Chatanalytics();

		// functions called,you have to call the last function at first to create
		// inverse calling hierarchy

		obj.Loginpage(this.driver);
		obj.BotmakerNode();
		obj.dragndropNode();
		obj.inserter();
		obj.livebotopener();
		obj.botsolver();
		obj.audienceopener();
		obj.rfopener();
	    obj.Chatcheck();
	}
}