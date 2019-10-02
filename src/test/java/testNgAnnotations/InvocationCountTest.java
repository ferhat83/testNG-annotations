package testNgAnnotations;

import org.testng.annotations.Test;

public class InvocationCountTest {

	//if we want to execute a test many times we can use the  "invocationCount" Keyword
	@Test(invocationCount = 10)
	public void sum() {
	 int a = 20;
	 int b = 40;
	 int sum = a+b;
	 System.out.println("the sum is : " +sum);
		
	}


}
