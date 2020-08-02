package listenerInterface;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGReporting.class)
public class TestReport {
	
	@Test
	public void TC_01(){
		Assert.assertTrue(true);
	}
	@Test
	public void TC_02(){
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="TC_01")
	public void TC_03(){
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods="TC_02")
	public void TC_04(){
		
	}
}
