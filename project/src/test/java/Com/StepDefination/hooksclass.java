package Com.StepDefination;

import Com.BaseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksclass extends BaseClass{
	
	
	@Before
	public void setup() {
		BaseClass.inc("https://opensource-demo.orangehrmlive.com/");
	}

	
	@After
	public void tearDoun() {
		driver.close();
	}
	
}
