package testNG_day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyTestUsingAnnotation {

	@Test(dependsOnMethods = {"environmentTest"})
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage");
		
	}
	@Test(dependsOnGroups = {"anotherBoringMethod"})
	public void environmentTest() {
		System.out.println("Testing environment");
		Assert.assertTrue(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
