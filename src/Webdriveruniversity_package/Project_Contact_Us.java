package Webdriveruniversity_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Contact_Us {

	public static void main(String[] args) {
		
		//Set Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		//Add First Name
		
		WebElement first_name = driver.findElement(By.className("feedback-input"));
		first_name.sendKeys("SHOBIN");
		
		//Add Last Name
		
		WebElement Last_Name = driver.findElement(By.name("last_name"));
		Last_Name.sendKeys("O.U");
		
		// Inserting Email id
		
		WebElement Email_id = driver.findElement(By.name("email"));
		Email_id.sendKeys("shobee555@gmail.com");
		
		//Inserting Comment
		
		WebElement Comments = driver.findElement(By.name("message"));
		Comments.sendKeys("Hakuna matata");
		
		// Click Submit
		
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		Submit.click();
		
		// Click Reset
		
	//	WebElement Reset = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
	//	Reset.click();
		
		
		
		
		
	
		

	}

}
