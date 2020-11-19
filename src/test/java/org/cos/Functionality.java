package org.cos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Functionality {
	 WebDriver driver;

	public WebDriver  getdriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dorai\\eclipse-workspace\\Cucumber2\\div\\chromedriver.exe");
	driver=new ChromeDriver();
		return driver;

	}
	public void switchToFrameByIndex(int index) {
	driver.switchTo().frame(index);

	}
	
	public void type(WebElement element,String data) {
		
		element.sendKeys(data);
	}
	
	public void click(WebElement click) {
		click.click();
	}
	
	public void selectByText(WebElement element,String data) {
		new Select(element).selectByVisibleText(data);

	}
	public void selectByValue(WebElement element,String data) {
		new Select(element).selectByValue(data);
}
	public void selectByIndex(WebElement element,int  index) {
		new Select(element).selectByIndex(index);

	}
}
	
	
	
	
	
	
	
	
	