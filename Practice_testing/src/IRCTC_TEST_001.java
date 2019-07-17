import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.FindElement;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;



public class IRCTC_TEST_001 {

	@Test
	public void testid_001() throws InterruptedException, IOException, TesseractException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Srini\\eclipse\\eclipseworkspace\\CDQM_APP\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//Alert alert=driver.switchTo().alert();alert.dismiss();
		driver.findElement(By.id("loginText")).click();
		driver.findElement(By.id("userId")).sendKeys("sri_161995");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		/*File src = driver.findElement(By.id("captchaImg")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"//screenshots//captcha.png";
		FileHandler.copy(src, new File(path));
		Tesseract image =Tesseract.getInstance(); 	
		String imageText=image.doOCR(new File(path));
		System.out.println(imageText);*/
		//System.out.println("Enter Captcha displayed in the image section");
		//Scanner sc = new Scanner(System.in);
		//String CAPTCHA = sc.nextLine();
		//driver.findElement(By.id("nlpAnswer")).sendKeys(CAPTCHA);
		//Thread.sleep(5000);
		driver.findElement(By.id("otpLogin")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		//alert.accept();
	}
}
