package testNG_day02;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp {

	@DataProvider(name = "bunchOfNames")
	public Object [] dpMethod(){
		
		return new Object[] {"Shafkat", "Ever", "Aziza", "Gianina"};
	}
	
	@DataProvider(name = "listOfValues")
	public Object [][] dpMethod2(){
		
		return new Object[][] {{"Shafkat", 36}, {"Ever", 28}, {"Aziza", 33}, {"Gianina", 22}};
	}
	
	@Test(dataProvider = "bunchOfNames", enabled = true)
	public void myTest(String value) {
	System.out.println("My name is " + value);	

	}
	
	@Test(dataProvider = "listOfValues", enabled = true)
	public void myTest2(String value, Integer age) {
	System.out.println("My name is " + value + " and I am " + age + " years old.");	

	}
	
	
	//pass three values a,b and result to check if the sum is equal to result or not
	// a, b, sum
	
	//you are going to check to see if the sum of the two values are actually equal to sum value
	
	@DataProvider(name = "addedValues")
	public Object[][] dpMethod3(){
		return new Object[][] {{2,3,5}, {5,7,9}, {3,5,8}};
	}
	
	@Test(dataProvider = "addedValues", enabled = false)
	public void checkValues(int a, int b, int result) {
		int sum = a + b;
		Assert.assertEquals(result, sum);
	}
	
	
	
	
}
