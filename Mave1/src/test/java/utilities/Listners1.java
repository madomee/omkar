package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import page.Page1;
import page.Test1;

public class Listners1 extends Test1 implements ITestListener {
Screenshot sc;
	@Override
	public void onTestFailure(ITestResult result) {
		sc=new Screenshot();
		String name = result.getName();
		
		try {
			sc.scnsht(driver, name);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	

}
