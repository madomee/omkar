package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public void scnsht(WebDriver driver,String name) throws IOException {
	TakesScreenshot tss=(TakesScreenshot) driver;
	File source=tss.getScreenshotAs(OutputType.FILE);
	File desti=new File(System.getProperty("user.dir")+"\\screenshot\\"+name+".png");
    FileHandler.copy(source, desti);
}
}