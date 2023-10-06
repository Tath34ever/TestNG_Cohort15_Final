package testNG_day02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class params {

	@Test
	@Parameters({"val1","val2", "name"})
	public static void Sum(int value1, int value2, String name) {
		int finalSum = value1 + value2;
		
		System.out.println("The final sum of the given value is " + finalSum +" - "+ name);
	}
	

	
	
	
	
	
}
