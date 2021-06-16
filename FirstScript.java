package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("nptherockstar1");
		driver.findElement(By.name("pass")).sendKeys("WRONGPASSWORD" + Keys.ENTER);
		//driver.quit();
		//driver.close();
	}

}
