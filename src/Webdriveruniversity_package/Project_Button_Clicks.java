package Webdriveruniversity_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Button_Clicks {

	public static void main(String[] args) {
		
// WEB ELEMENT CLICK
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("https://webdriveruniversity.com/Click-Buttons/index.html");
		 
	//	 WebElement Web_Element_Click = driver.findElement(By.id("button1"));
	//	 Web_Element_Click.click();
		 
// JAVA SCRIPT CLICK
		 
	//	 WebElement Java_Script_Click = driver.findElement(By.id("button2"));
	//	 Java_Script_Click.click();
		 
		 
//ACTION MOVE AND CLICK
		 
		 WebElement Action_Move_And_Click = driver.findElement(By.id("button3"));
		 Action_Move_And_Click.click();

	}

}
