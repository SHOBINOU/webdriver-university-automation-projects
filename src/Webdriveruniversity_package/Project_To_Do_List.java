package Webdriveruniversity_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_To_Do_List {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver ();
		 
		 driver.navigate().to("https://webdriveruniversity.com/To-Do-List/index.html");
		 
// ADDING SEND KEY WORD AND PRESSING ENTER KEYS 
		 //(Just.. adding  3 options)
	//1	 
		 WebElement Add_New_ToDo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		 Add_New_ToDo.sendKeys("Practice");
		 Add_New_ToDo.sendKeys(Keys.ENTER);
		 
	//2- 
		 WebElement Add_New_ToDo1 = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		 Add_New_ToDo1.sendKeys("Training session");
		 Add_New_ToDo.sendKeys(Keys.ENTER); 
	//3	 
		 WebElement Add_New_ToDo2 = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		 Add_New_ToDo2.sendKeys("Learning Session");
		 Add_New_ToDo2.sendKeys(Keys.ENTER);
		 
		 
		 WebElement I = driver.findElement(By.className("fa fa-trash"));
		 I.sendKeys("Delete");
		 I.click();
		// I.click();
		 
		 
		 
	
		 

	}

}
