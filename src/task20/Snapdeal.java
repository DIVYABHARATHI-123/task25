package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("accountUserName col-xs-12 reset-padding")).click();
		driver.findElement(By.name("j_username")).sendKeys("vishalpm000@gmail.com"); 
		driver.findElement(By.name("j_name")).sendKeys("Vishal"); 
		driver.findElement(By.name("\"j_password\"")).sendKeys("Ziya@1000");	 
		driver.findElement(By.id("userSignup")).click();
	}

}
