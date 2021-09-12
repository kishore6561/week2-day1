package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver mydriver=new ChromeDriver();
		mydriver.manage().window().maximize();
		mydriver.get("http://leaftaps.com/opentaps/control/main");
		String title=mydriver.getTitle();
		System.out.println(title);
		mydriver.findElement(By.id("username")).sendKeys("demosalesmanager");
		mydriver.findElement(By.id("password")).sendKeys("crmsfa");
		mydriver.findElement(By.className("decorativeSubmit")).click();
		mydriver.findElement(By.linkText("CRM/SFA")).click();

	}

}
