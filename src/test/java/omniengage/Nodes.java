package omniengage;

import java.awt.AWTException;

import org.testng.annotations.Test;

@Test
public class Nodes {

	
	public void controller() throws InterruptedException, AWTException {
	Botsolver obj = new Botsolver();
		//functions called,you have to call the last function at first to create inverse calling hierarchy 
    	obj.Loginpage();
		obj.BotmakerNode();
		obj.dragndropNode();
		obj.inserter();
        obj.livebotopener();
        obj.botsolver();
	}
}