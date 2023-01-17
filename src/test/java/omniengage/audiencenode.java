package omniengage;

import org.openqa.selenium.By;

public class audiencenode extends Nodefiller {
	public void audienceopener()
	{
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div[2]/ul/li[5]")).click();
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[4]/div/div/div[2]/div[2]/button[1]")).click();
	
	
	}

}
