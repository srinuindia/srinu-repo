import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		

//email login -srinu account
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Srini\\eclipse\\eclipseworkspace\\CDQM_APP\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("srini.velupula@gmail.com");
		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("king@heaven5S");
		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.xpath("//textarea[@id=':r8']")).sendKeys("srini.velupula@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Welcome");
		driver.findElement(By.xpath("//div[@id=':rv']")).sendKeys("Hi Sri"
				+ "\n\nWelcome to Gmail\n"
				+ "\nHave a good day!");
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		driver.findElement(By.xpath("//*[@class='gb_xa gbii']")).click();
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();

	}

}
