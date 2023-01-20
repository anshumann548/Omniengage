package omniengage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class audiencenode extends Nodefiller {
	@Test (priority=6)
	public void audienceopener()
{
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div[2]/ul/li[5]")).click();
	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[4]/div/div/div[2]/div[2]/button[1]")).click();
	
	
}

}
