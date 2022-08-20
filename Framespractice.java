package seleniumwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Framespractice {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajis\\eclipse-workspace\\Seleniumpractise\\ChromeDriver\\chromedriver.exe");
ChromeOptions op = new ChromeOptions();
ChromeOptions arg = op.addArguments("incognito");
WebDriver driver = new ChromeDriver(arg);
	driver.get("http://demo.automationtesting.in/Frames.html");
	WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(singleframe);
	WebElement Sigfr_texbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Sigfr_texbox.sendKeys("Hi Balaji");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	WebElement Multiframebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	Multiframebutton.click();
	Thread.sleep(2000);
	WebElement mulsingfra = driver.findElement(By.xpath("(//iframe[contains(@style,'float')])[2]"));
	driver.switchTo().frame(mulsingfra);
	Thread.sleep(2000);
	WebElement innerfram = driver.findElement(By.xpath("//iframe[contains(@style,'float: left;height: 250px')]"));
	driver.switchTo().frame(innerfram);
	Thread.sleep(2000);
	WebElement sendk = driver.findElement(By.xpath("//input[@type='text']"));
	sendk.sendKeys("Hey this is inner frame");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	WebElement videobut = driver.findElement(By.xpath("//a[text()='Video']"));
	
	videobut.click();
	
}
}
//Updation practice
//2nd updation


