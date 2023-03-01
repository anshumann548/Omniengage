package omniengage;


import org.openqa.selenium.By;
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
	
    
   driver.navigate().to("https://app.outgrow.chat/settings");	
   // roaming into pricing page
   
   driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/div[1]/div[2]/ul/li[5]\n")).click();
   
   Thread.sleep(4000);
 	
   String pricingplanmonthly = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]")).getText();
 		
 		String enterpriseplan = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[2]")).getText();
 		
 		
 		String expectedplanmonthly = "Recommended" + "\n"
 			+	"Plus plan" + "\n "
 			+	"Scale up with ease" +"\n "
 			+	"Starts at"+"\n "
 			+	"$22"+" \n"
 			+	"/month"+"\n "
 			+	"Upgrade"+"\n "
 			+ 	"Min. Bill amount $22/month"+"\n "
 			+	"5000 monthly push web notification"+"\n "
 			+	"10,000 monthly emails" ;
	
 		String expectedenterprise = "Enterprise plan" + "\n "+
 		"Unleash your full potential"+" \n"+
 		"Custom"+"\n "+
 		"Contact us"+"\n "+
 		"Upgrade to Plus or Enterprise to enjoy more features."+"\n "+
 		"Perfect for businesses with high volume requirements"+" \n"+
 		"Take advantage of special rates and customized plans" ;

 		String expectedyearlyplan = "Recommended" + "\n"
 	 			+	"Plus plan" + "\n "
 	 			+	"Scale up with ease" +"\n "
 	 			+	"Starts at"+"\n "
 	 			+	"$220"+" \n"
 	 			+	"/year"+"\n "
 	 			+	"Upgrade"+"\n "
 	 			+ 	"Min. Bill amount $220/year"+"\n "
 	 			+	"60,000 yearly push web notification"+"\n "
 	 			+	"120,000 yearly emails" ;
 		
 		
 		SoftAssert softAssert = new SoftAssert();
 		
 		softAssert.assertEquals(pricingplanmonthly,expectedplanmonthly,"Monthly pricing is not matching");
 		softAssert.assertEquals(enterpriseplan,expectedenterprise,"Enterprise policy is not matching");
 		
 		//softAssert.assertAll();
 		
 		Thread.sleep(5000);
 		
 		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/label/span")).click(); 
 		//Turning on yearly toggle
 		
     	String yearlyplan=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]")).getText();
 		
 	softAssert.assertEquals(yearlyplan,expectedyearlyplan,"Yearly pricing is not matching");
      }
	
	
}
