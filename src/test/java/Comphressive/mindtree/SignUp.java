package Comphressive.mindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //to maximize window
		driver.get("http://google.com");
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#spree_user_email")).click();
		driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("vangapandulavanya27@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("Lavanya@1234");
		
		driver.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
