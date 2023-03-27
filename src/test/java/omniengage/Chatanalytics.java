package omniengage;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
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
 		
 		
 		String expectedplanmonthly = 	"Plus plan" + "\n "
 			+	"Scale up with ease" +"\n "
 			+	"Starts at"+"\n "
 			+	"$22"+" \n"
 			+	"/month"+"\n "
 			+	"Upgrade"+"\n "
 			+	"5000 monthly push web notifications"+"\n "
 			+	"10,000 monthly emails"+"\n "
 		    + 	"A/B testing"+"\n "
			+	"Add-ons"+"\n "
			+	"$3 for every 1000 extra monthly push web notifications" +"\n "
			+	"$3 for every 1000 extra monthly emails" +"\n " 
 		    + "View More" ;
 		
 		String expectedenterprise = "EnterpriseplanUnleashyourfullpotentialCustomContactusPerfect for businesses with highvolumerequirementsTakeadvantageofspecialratesandcustomizedplansOver20usersAccess to all featuresPriority support" ;
 		
 		String expectedyearlyplan = 
 				"PlusplanScaleupwitheaseStartsat$220/yearUpgrade60,000yearlypushwebnotifications120,000yearlyemailsA/BtestingAdd-ons$30forevery12,000extrayearlypushwebnotifications$30forevery12,000extrayearlyemailsViewMore";
 		
 		Assert.assertEquals(removeWhiteSpaces(pricingplanmonthly),removeWhiteSpaces(expectedplanmonthly),"Monthly pricing is not matching");
 		Assert.assertEquals(removeWhiteSpaces(enterpriseplan),removeWhiteSpaces(expectedenterprise),"Enterprise policy is not matching");
 		
 		
 		Thread.sleep(5000);
 		
 		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/label/span")).click(); 
 		//Turning on yearly toggle
 		
     	String yearlyplan=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]")).getText();
 		
 	Assert.assertEquals(removeWhiteSpaces(yearlyplan),removeWhiteSpaces(expectedyearlyplan),"Yearly pricing is not matching");
      }
	
String removeWhiteSpaces(String input) {
    return input.replaceAll("\\s+", "");
}
}
