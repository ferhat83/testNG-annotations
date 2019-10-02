package testNgAnnotations;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void loginTest() {
	System.out.println("Login Test");	
	int i = 5;
	System.out.println(i);
	}
	//all the next test depends on this first test(if it failed it skip all the next)
	
	//dependsOnMethods keyword is used to link a specific test to another one 
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
	System.out.println("Home page Test");	
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
	System.out.println("Search Page Test ");
	}
	
	@Test(dependsOnMethods= "loginTest")
	public void registrationPageTest() {
	System.out.println("Registration Page Test");	
	}

}
