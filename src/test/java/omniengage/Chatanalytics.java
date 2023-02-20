package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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
    
 // roaming into pricing page
    
    
    Thread.sleep(3000);
	
 		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[4]/div/div[1]/div[1]")).click();
 		
 		
 		driver.findElement(By.xpath("//*[@id=\"logout-user\"]/ul/li[2]/span")).click(); 
 		
 		Thread.sleep(4000);
 		
 		String pricingplanmonthly = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]")).getText();
 		
 		String enterpriseplan = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[2]")).getText();
 		
 		System.out.println(enterpriseplan);
 		
 		String expectedplanmonthly = "Recommended" +" "
 			+	"Plus plan" +" "
 			+	"Scale up with ease" +" "
 			+	"Starts at"+" "
 			+	"$22"+" "
 			+	"/month"+" "
 			+	"Upgrade"+" "
 			+ 	"Min. Bill amount $22/month"+" "
 			+	"5000 monthly push web notification"+" "
 			+	"10,000 monthly emails" ;
	
 		String expectedenterprise = "Enterprise plan" + " "+
 		"Unleash your full potential"+" "+
 		"Custom"+" "+
 		"Contact us"+" "+
 		"Upgrade to Plus or Enterprise to enjoy more features."+" "+
 		"Perfect for businesses with high volume requirements"+" "+
 		"Take advantage of special rates and customized plans" ;

 		
 		
 		SoftAssert softAssert = new SoftAssert();
 		
 		softAssert.assertEquals(pricingplanmonthly,expectedplanmonthly,"Monthly pricing is not matching");
 		softAssert.assertEquals(enterpriseplan,expectedenterprise,"Monthly pricing is not matching");
 		
 		softAssert.assertAll();
 		
 		Thread.sleep(4000);

        }
	
	
}
