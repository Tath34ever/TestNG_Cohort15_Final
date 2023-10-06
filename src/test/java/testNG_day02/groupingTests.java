package testNG_day02;

import org.testng.annotations.Test;

public class groupingTests {

	
	@Test(groups = "smoke")
	public void alexTest() {
		System.out.println("alexTest");
		
	}
	
	//if you want to group more than 2 then coma and put them in
	//curly brackets
	@Test(groups = {"smoke", "regression"})
	public void everTest() {
		System.out.println("everTest");

	}
	@Test(groups = "functional")
	public void shaffyTest() {
		System.out.println("shaffyTest");

	}
	@Test(groups = {"functional, regression"})
	public void gianinaTest() {
		System.out.println("gianinaTest");

	}
	@Test
	public void anotherBoringMethod() {
		System.out.println("method from GroupingTests");
	}
}
