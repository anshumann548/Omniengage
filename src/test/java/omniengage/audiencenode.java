package omniengage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class audiencenode extends Botsolver {
	@Test (priority=7)
	public void audienceopener()
{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/ul/li[5]")).click();
	
}

}
