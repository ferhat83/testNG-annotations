package testNgAnnotations;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test(enabled = false, invocationTimeOut = 3000,expectedExceptions = NumberFormatException.class)
	public void infinitLoopTest() {
		int i = 1;
		while( i == 1 ) {
			System.out.println(i);
		}
		}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x)	;	
	}

}
