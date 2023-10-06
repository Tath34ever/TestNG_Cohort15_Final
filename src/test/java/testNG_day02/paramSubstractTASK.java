package testNG_day02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramSubstractTASK {

	
	@Test
	@Parameters({"name","numb1","numb2"})
	public static void Substract(String name, int value1, int value2) {
		int finalSubstract = value1 - value2;
		
		System.out.println(name + " has substracted" + value1 + value2 + " and the result is " +finalSubstract);
	}
}
