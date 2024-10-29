package task25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
	
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("bg-green-500 hover:bg-green-600 text-white font-normal py-2 px-4 rounded text-base min-h-8 h-8 align-middle mr-2")).click();
		driver.findElement(By.id("email")).sendKeys("vishalpm000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ziya@1000");
		driver.findElement(By.id("mobileNumber")).sendKeys("7845994236");
		driver.findElement(By.className("signup-btn")).click();
		
		String s = driver.getTitle();
		System.out.println(s);
		
		//close the browser
		  driver.quit();
	}

}
