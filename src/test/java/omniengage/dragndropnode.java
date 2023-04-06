package omniengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dragndropnode extends Botmaker {

	@Test(priority = 3)
	public void dragndropNode() throws InterruptedException {
		Thread.sleep(3000);

		Actions act = new Actions(this.driver);
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));

		//DragandDrop of nodes one by one
		
		WebElement from = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div"));
		WebElement to = this.driver.findElement(By.xpath("//*[@id=\"drawflow\"]/div[2]"));
		
		final String java_script =
	            "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
	            "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
	            "ction(format,data){this.items[format]=data;this.types.append(for" +
	            "mat);},getData:function(format){return this.items[format];},clea" +
	            "rData:function(format){}};var emit=function(event,target){var ev" +
	            "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
	            "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
	            "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
	            "'drop',tgt);emit('dragend',src);";
		  
		((JavascriptExecutor)driver).executeScript(java_script, from, to);
		
		//Button 2
		
		WebElement fromagain = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div"));
		WebElement toagain = this.driver.findElement(By.xpath("//*[@id=\"drawflow\"]/div[2]"));

		final String java_script1 =
	            "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
	            "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
	            "ction(format,data){this.items[format]=data;this.types.append(for" +
	            "mat);},getData:function(format){return this.items[format];},clea" +
	            "rData:function(format){}};var emit=function(event,target){var ev" +
	            "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
	            "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
	            "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
	            "'drop',tgt);emit('dragend',src);";
		
		((JavascriptExecutor)driver).executeScript(java_script1, fromagain, toagain);
     
		//Button 3
		
	    WebElement fromagainnext = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div"));
		WebElement tonext = this.driver.findElement(By.xpath("//*[@id=\"drawflow\"]/div[2]"));
		
		final String java_script2 =
	            "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
	            "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
	            "ction(format,data){this.items[format]=data;this.types.append(for" +
	            "mat);},getData:function(format){return this.items[format];},clea" +
	            "rData:function(format){}};var emit=function(event,target){var ev" +
	            "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
	            "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
	            "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
	            "'drop',tgt);emit('dragend',src);";
		
		
		
		((JavascriptExecutor)driver).executeScript(java_script2, fromagainnext, tonext);

		
		WebElement resultnode = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[4]/td[1]/div"));
		WebElement tocanvas = this.driver.findElement(By.xpath("//*[@id=\"drawflow\"]/div[2]"));
		
		final String java_script3 =
	            "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
	            "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
	            "ction(format,data){this.items[format]=data;this.types.append(for" +
	            "mat);},getData:function(format){return this.items[format];},clea" +
	            "rData:function(format){}};var emit=function(event,target){var ev" +
	            "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
	            "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
	            "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
	            "'drop',tgt);emit('dragend',src);";
		
		
		
		((JavascriptExecutor)driver).executeScript(java_script3, resultnode, tocanvas);
		
		Thread.sleep(5000);
		
		
		//Repositioning button node to result node respectively
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-8\"]/div[2]/div")));
		WebElement buttondrag1 = this.driver.findElement(By.xpath("//*[@id=\"node-8\"]/div[2]/div"));
        act.dragAndDropBy(buttondrag1, 200, 250).build().perform();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-7\"]/div[2]/div")));
		WebElement buttondrag2 = this.driver.findElement(By.xpath("//*[@id=\"node-7\"]/div[2]/div"));
        act.dragAndDropBy(buttondrag2, 500, 350).build().perform();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-6\"]/div[2]/div")));
		WebElement buttondrag3 = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[2]/div"));
        act.dragAndDropBy(buttondrag3, 850,400).build().perform();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-6\"]/div[2]/div")));
		WebElement resultnodedrag = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[2]/div"));
        act.dragAndDropBy(resultnodedrag, 100,450).build().perform();
        
        //Connecting nodes
        
        WebElement messagenodeoutput = this.driver.findElement(By.xpath("//*[@id=\"node-5\"]/div[3]/div"));
		WebElement buttonnodeinput = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[1]/div"));
		act.dragAndDrop(messagenodeoutput, buttonnodeinput).build().perform();	
		
		
		WebElement buttonnode1output = this.driver.findElement(By.xpath("//*[@id=\"node-6\"]/div[2]/div/div[2]/div[2]/div/div[2]"));
		WebElement buttonnode2input = this.driver.findElement(By.xpath("//*[@id=\"node-7\"]/div[1]/div"));
		act.dragAndDrop(buttonnode1output, buttonnode2input).build().perform();
	
		WebElement buttonnode2output = this.driver.findElement(By.xpath("//*[@id=\"node-7\"]/div[2]/div/div[2]/div[2]/div/div[2]"));		
		WebElement buttonnode3input = this.driver.findElement(By.xpath("//*[@id=\"node-8\"]/div[1]/div"));
		act.dragAndDrop(buttonnode2output, buttonnode3input).build().perform();
	
		WebElement buttonnode3output = this.driver.findElement(By.xpath("//*[@id=\"node-8\"]/div[2]/div/div[2]/div[2]/div/div[2]"));		
		WebElement resultnodeinput = this.driver.findElement(By.xpath("//*[@id=\"node-9\"]/div[1]/div"));
		act.dragAndDrop(buttonnode3output, resultnodeinput).build().perform();
		
		
		
	}

}
