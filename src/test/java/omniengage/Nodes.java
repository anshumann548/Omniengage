package omniengage;

import org.testng.annotations.Test;

@Test
public class Nodes {

	
	public void controller() throws InterruptedException {
		Calculateresult obj = new Calculateresult();
		//functions called,you have to call the last function at first to create inverse calling hierarchy 
		obj.Loginpage();
		obj.BotmakerNode();
		obj.dragndropNode();
		obj.butnode();

	}
}