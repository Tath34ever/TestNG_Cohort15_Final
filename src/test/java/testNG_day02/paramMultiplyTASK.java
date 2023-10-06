package testNG_day02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramMultiplyTASK {

	
	@Test
	@Parameters({"name","numb1","numb2"})
	public static void Multiply(String name, int value1, int value2) {
		int finalMultiply = value1 * value2;
		
		System.out.println(name + " has multiplied" + value1 + value2 + " and the result is " +finalMultiply);
	}
	
	
	
}
