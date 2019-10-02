package testNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	//Pre-condition annotations -- starting with @Before
	  @BeforeSuite //1
	  //will run just one time before all tests(not on every test)
	  public void setUp() {
	  System.out.println("@BeforeSuite --- setup system property for chrome : 1");
	  }
	   
	  @BeforeTest //2
	  //will run just one time before all tests(not on every test)
	  public void launchBrowser() {
	  System.out.println("@BeforeTest ---- launch chrome browser : 2");
	  }

	  @BeforeClass  //3
	  //will run just one time before all tests(not on every test)
	  public void login() {
	  System.out.println("@BeforeClass ---- login to app : 3");
	  }
	 
	  @BeforeMethod //4
	  //will run before every test
	  public void enterUrl() {
	  System.out.println("@BeforeMethod ---- enter URL : 4");
	  }
	  //test case -- starting with @test
	  @Test(priority = 1)  //5
	  public void googleTitleTest() {
	  System.out.println("@Test 1 ---- Goole test title : 1st Test case");
	  }
	   
	  @Test(priority = 2)
	  public void searchTest() {
	  System.out.println("@Test 2 ---- search Test : 2nd Test case");
	  }
	   
	  @Test (priority = 3)
	  public void googleLogoutTest() {
	  System.out.println("@Test 3 ----  google logout test : 3rd Test case");
	  }
	  // Post conditions -- stating with @After
	  @AfterMethod() //6
	  // will run after every test
	  public void logout() {	   
	  System.out.println("@AfterMethod ---- logout from app : 6");
	  }
	   
	  @AfterClass  //7
	  //will run just one time after all test(not on every test)
	  public void closeBrowser() {
	  System.out.println("@AfterClass ----- close the Browser : 7");
	  }
	   
	  @AfterTest  //8
	  //will run just one time after all test(not on every test)
	  public void deleteAllCookies() {
	  System.out.println("@AfterTest ------ delete All cookies : 8 ");
	  }
	   
	  @AfterSuite //9
	  //will run just one time after all test(not on every test)
	  public void generateTestReport() {
	  System.out.println("@AfterSuite ------ generate the test report : 9");
	  }

}
