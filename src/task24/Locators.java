package task24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Divyabharathi");
		driver.findElement(By.id("email")).sendKeys("vishalpm000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ziya@1000");
		driver.findElement(By.id("mobileNumber")).sendKeys("8124394266");
		driver.findElement(By.className("signup-btn")).click();
		
		String s = driver.getTitle();
		System.out.println(s);
        
	}

}
