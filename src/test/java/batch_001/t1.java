package batch_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class t1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pass123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
