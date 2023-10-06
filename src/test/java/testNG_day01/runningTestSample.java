package testNG_day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class runningTestSample {

	// Test runs in order of alphanumeric order

	@Test(groups = {"regression", "smoke"})
	public void test1() {

		System.out.println("Test1");
	}

	@Test(groups = {"regression", "loadTesting"})
	public void test2() {

		System.out.println("Test2");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("before method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("after method");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("before Class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("after Class");
	}

	@BeforeTest
	public void beoreTest() {
		// group of many classes == one test
		System.out.println("before test");

	}

	@AfterTest
	public void afterTest() {
		// group of many classes == one test
		System.out.println("after test");

	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("before suite");

	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("after suite");

	}

}
