package Webdriveruniversity_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Page_Object_Model {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://webdriveruniversity.com/Page-Object-Model/index.html");
		
		driver.manage().window().maximize();
		
	//	WebElement Find_Out_More = driver.findElement(By.id("button-find-out-more"));
	//	Find_Out_More.click();
		
	//	WebElement Find_Out_More2 = driver.findElement(By.xpath("/html/body"));
	//	Find_Out_More2.click();
		
	// CLICK OUR PRODUCT BUTTON
		
		WebElement Our_Products = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
		Our_Products.click();
		
	// CLICK 
	//	WebElement Special_Offers = driver.findElement(By.className("sub-heading"));
	//	Special_Offers.click();
		
	//	WebElement Proceed = driver.findElement(By.cssSelector("modal-open"));
	//	Proceed.click();
	//	Proceed.click();
		
	//	Click CAMERA
	//	WebElement Cameras = driver.findElement(By.className("sub-heading"));
	//	Cameras.click();
		
		
		
	
		
		
		

	}

}
