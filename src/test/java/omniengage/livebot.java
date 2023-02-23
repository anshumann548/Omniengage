package omniengage;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class livebot extends Nodefiller {
@Test(priority=5)
public void livebotopener () throws AWTException, InterruptedException
{
	
	this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div[3]/div")).click();
	//Clicking
	//on
	//copy
	//button
	
	
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
     String clipboardContent = null;

     try {
         clipboardContent = (String) clipboard.getData(DataFlavor.stringFlavor);
         String script = String.format("window.open('%s')", clipboardContent);
         ((JavascriptExecutor) driver).executeScript(script);// launching a new tab
         
     } catch (Exception e) {
         e.printStackTrace();
     }
    }
}
