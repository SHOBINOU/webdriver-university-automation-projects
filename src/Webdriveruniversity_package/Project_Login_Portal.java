package Webdriveruniversity_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Login_Portal {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
		//Insert User name
		
		WebElement User_name = driver.findElement(By.id("text"));
		User_name.sendKeys("Shobin");
		
		// Insert Password
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("336699");
		
		// Click Login
		
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		
		
		

	}

}
