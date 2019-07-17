import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_flipkart {
	

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Srini\\eclipse\\eclipseworkspace\\CDQM_APP\\Practice\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.className("dHGf8H")).click();
	WebElement mobile= driver.findElement(By.cssSelector("input[class='_2zrpKA _1dBPDZ']"));
	mobile.sendKeys("7975426514");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("king$@heaven");
	driver.findElement(By.cssSelector("button[class='_2AkmmA _1LctnI _7UHT_c']")).click();
	driver.close();
	System.out.println("Login to flipkart successfully");
}
}
