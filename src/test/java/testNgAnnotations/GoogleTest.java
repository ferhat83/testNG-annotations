package testNgAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saadi\\eclipse-workspace\\seleniumAutomation\\testNg-practice\\driver\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority=1,groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
    // priority keyword is used to prioritize the execution sequence
	//groups keyword is used to group between test that are in the same context  
	@Test(priority = 2 ,groups = "Logo") 
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	
	@Test(priority = 3 ,groups = "Search")
	public void searchTest() {
		driver.findElement(By.name("q")).sendKeys("NASA",Keys.ENTER);
	}
	
	@Test(priority = 4 ,groups = "Search")
	public void searchTest2() {
		driver.findElement(By.name("q")).sendKeys("TestNG",Keys.ENTER);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}


}
