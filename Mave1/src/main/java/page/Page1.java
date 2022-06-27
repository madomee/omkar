package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement bton;
	@FindBy(xpath="//a[@class='_1_3w1N']")
	private WebElement login;
	@FindBy(xpath="//*[text()='Become a Seller']")
	private WebElement button;
	
	@FindBy(xpath="//input[@class='styles__StyledInput-sc-6fhdqq-0 gEzlIS custom-width']")
	private WebElement user;
	
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement buttonlog() throws InterruptedException {
		Thread.sleep(5000);
		return button;
		
	}
	public WebElement username() {
		return user;
		
}
	public WebElement close() {
		return bton;
	}
	public WebElement logn() {
		return login;
	}
}