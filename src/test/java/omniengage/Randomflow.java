package omniengage;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Randomflow extends Chatanalytics{

@Test(priority=10)

public void randomizer() throws InterruptedException

{
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));

	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='default-card ']")));	
	driver.findElement(By.xpath("//*[@class='default-card ']")).click();	
	this.driver.findElement(By.xpath("//*[@id=\'cb\']")).sendKeys("Bot" + Math.random() * 5);
	this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[4]/button")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-4\"]/div[2]/div")));	
driver.findElement(By.xpath("//*[@id=\"node-4\"]/div[2]/div")).click();
driver.findElement(By.xpath("//*[@id=\"node-4\"]/div[2]/div/div/div[2]/div[3]")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-5\"]/div[2]/div")));
driver.findElement(By.xpath("//*[@id=\"node-5\"]/div[2]/div")).click();
driver.findElement(By.xpath("//*[@id=\"node-5\"]/div[2]/div/div/div[2]/div[3]")).click();

Actions act = new Actions(driver);

Thread.sleep(3000);

//Xpath of nodes to drop in canvas

WebElement askquestion = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div"));
WebElement singleselect = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div"));
WebElement getemailid = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/div\n"));
WebElement getphonenumber = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/div"));
WebElement getusername = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[3]/td[1]/div"));
WebElement getaddress = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[3]/td[2]/div"));
WebElement sendmessage = this.driver.findElement(By.xpath("//*[@id=\"reverse-bar\"]/div[2]/div/div[1]/table/tbody/tr[4]/td[2]/div"));

//Xpath of canvas

WebElement canvas = this.driver.findElement(By.xpath("//*[@id=\"drawflow\"]/div[2]"));

//Dropping the nodes and repositioning them

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

((JavascriptExecutor)driver).executeScript(java_script, askquestion, canvas);

Thread.sleep(1000);

((JavascriptExecutor)driver).executeScript(java_script,singleselect,canvas);

Thread.sleep(1000);

WebElement Buttonnode = driver.findElement(By.xpath("//*[@id=\"node-7\"]/div[2]/div"));

Point Node2Location = Buttonnode.getLocation();

int x2 = Node2Location.getX();
int y2 = Node2Location.getY();

act.dragAndDropBy(Buttonnode, (x2/2), (y2)).build().perform();

((JavascriptExecutor)driver).executeScript(java_script,getemailid,canvas);

Thread.sleep(1000);

WebElement getemailnode = driver.findElement(By.xpath("//*[@id=\"node-8\"]/div[2]/div"));

Point Node3Location = getemailnode.getLocation();

int x3 = Node3Location.getX();
int y3 = Node3Location.getY();

act.dragAndDropBy(getemailnode, (x3+20), (y3+20)).build().perform();

((JavascriptExecutor)driver).executeScript(java_script,getphonenumber,canvas);

Thread.sleep(1000);

WebElement getphonenode = driver.findElement(By.xpath("//*[@id=\"node-9\"]/div[2]/div"));

Point Node4Location = getphonenode.getLocation();

int x4 = Node4Location.getX();
int y4 = Node4Location.getY();

act.dragAndDropBy(getphonenode, (x4+200), (y4+130)).build().perform();

((JavascriptExecutor)driver).executeScript(java_script, getusername, canvas);

Thread.sleep(1000);

WebElement getusernamenode = driver.findElement(By.xpath("//*[@id=\"node-10\"]/div[2]/div"));

Point Node5Location = getusernamenode.getLocation();

int x5 = Node5Location.getX();
int y5 = Node5Location.getY();

act.dragAndDropBy(getusernamenode, (x5+120), (y5+237)).build().perform();


((JavascriptExecutor)driver).executeScript(java_script,getaddress,canvas);

Thread.sleep(1000);

WebElement getaddressnode = driver.findElement(By.xpath("//*[@id=\"node-11\"]/div[2]/div"));

Point Node6Location = getaddressnode.getLocation();

int x6 = Node6Location.getX();
int y6 = Node6Location.getY();

act.dragAndDropBy(getaddressnode, (x6+70), (y6+350)).build().perform();

((JavascriptExecutor)driver).executeScript(java_script,sendmessage,canvas);

Thread.sleep(1000);

WebElement sendmsgnode = driver.findElement(By.xpath("//*[@id=\"node-12\"]/div[2]/div"));

Point Node8Location = sendmsgnode.getLocation();

int x8 = Node8Location.getX();
int y8 = Node8Location.getY();

act.dragAndDropBy(sendmsgnode, (x8+20), (y8+450)).build().perform();

 List<String[]> outputlist = new ArrayList<>(); 
// List<String> inputlist = new ArrayList<>(); 
// List<WebElement> outWbList = new ArrayList<>();
// List<WebElement> inWbList = new ArrayList<>();
// int ind  =0;

		 outputlist.add(new String[]{"//*[@id=\"node-6\"]/div[3]/div","//*[@id=\"node-6\"]/div[1]/div","//*[@id=\"node-6\"]/div[2]/div"}); 
		 outputlist.add(new String[]{"//*[@id=\"node-7\"]/div[2]/div/div[2]/div[2]/div/div[2]","//*[@id=\"node-7\"]/div[1]/div","//*[@id=\"node-7\"]/div[2]/div"});
		 outputlist.add(new String[]{"//*[@id=\"node-8\"]/div[3]/div","//*[@id=\"node-8\"]/div[1]/div","//*[@id=\"node-8\"]/div[2]/div"});
		 outputlist.add(new String[]{"//*[@id=\"node-9\"]/div[3]/div","//*[@id=\"node-9\"]/div[1]/div","//*[@id=\"node-9\"]/div[2]/div"});
		 outputlist.add(new String[]{"//*[@id=\"node-10\"]/div[3]/div","//*[@id=\"node-10\"]/div[1]/div","//*[@id=\"node-10\"]/div[2]/div"});
		 outputlist.add(new String[]{"//*[@id=\"node-11\"]/div[3]/div","//*[@id=\"node-11\"]/div[3]/div","//*[@id=\"node-11\"]/div[2]/div"});
		 outputlist.add(new String[]{"//*[@id=\"node-12\"]/div[3]/div","//*[@id=\"node-12\"]/div[1]/div","//*[@id=\"node-12\"]/div[2]/div"});
		 
		 
         Collections.shuffle(outputlist);
         int len = outputlist.size();
         System.out.println(len);
         for(int i=0;i<len-1;i++) {
        	 String outStr = outputlist.get(i)[0];
        	 String inStr = outputlist.get(i+1)[1];
        	 System.out.println(outStr+"->"+inStr);
        	 WebElement in = driver.findElement(By.xpath(inStr));
        	 WebElement out = driver.findElement(By.xpath(outStr));
        	 act.dragAndDrop(out,in).build().perform();
         }
         WebElement first = driver.findElement(By.xpath(outputlist.get(0)[2]));
         first.click();
         

         
}
    }






