package testNG_day01;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoringTests {

	@Test(enabled=true, groups= "smoke")
	public void test1() {
		System.out.println("Test1");
		
	}
	
	@Test(groups = "regression")
	public void test2() {
		System.out.println("Test2");
		
	}
}
