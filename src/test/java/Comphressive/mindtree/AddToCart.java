package Comphressive.mindtree;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //to maximize window
		driver.get("http://google.com");
		driver.get("https://www.urbanladder.com/");
		//login
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).sendKeys("vangapandulavanya27@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("Lavanya@1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//AddtoCart
		driver.findElement(By.xpath("(//a[@class='category'])[11]")).click();
		driver.findElement(By.xpath("//img[@alt='Study Tables Design']")).click();
		
		ArrayList<String> it=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(it.get(1));
		driver.findElement(By.xpath("(//div[@class='product_brand_name'])[4]")).click();
		
		ArrayList<String> itt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(itt.get(2));
		driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
	}

}
