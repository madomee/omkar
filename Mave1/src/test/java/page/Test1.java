package page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//hiii

public class Test1 {
	public static WebDriver driver;
	Page1 mn;
	Action act;
	
	@BeforeSuite
	public void init() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\madom\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromdriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
mn=new Page1(driver);

	}
	
	@Test
	public void log() throws InterruptedException {
		
		//mn.buttonlog().click();
	}
	@Test
	public void user() {
		mn.username().sendKeys("omkar");
		Assert.assertTrue(false);
	}
	@Test
	public void close() {
		mn.close().click();
	}
	@Test
	public void log1() {
		Actions act=new Actions(driver);
		act.moveToElement(mn.logn()).moveByOffset(0,200).click().build().perform();
	}
	
		
	
		
		@AfterClass
		public void teardown() {
			driver.close();
		}
}
