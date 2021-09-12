package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
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

		mydriver.findElement(By.linkText("Leads")).click();
		mydriver.findElement(By.linkText("Create Lead")).click();

		mydriver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		mydriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kishore");
		mydriver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Krish");
		mydriver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		mydriver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("J");
		mydriver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		mydriver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("L");
		mydriver.findElement(By.id("createLeadForm_sicCode")).sendKeys("252585");
		mydriver.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
		mydriver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NIL");
		mydriver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/28/2000");
		mydriver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        mydriver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
        mydriver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ok");
        
        WebElement countryCode = mydriver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("10");
		
		mydriver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("601204");
		mydriver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9865548221");
		mydriver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		mydriver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.Google.com");
		mydriver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("me");
		mydriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kishore2862000@gmail.com");
		
		
		
		mydriver.findElement(By.id("createLeadForm_generalToName")).sendKeys("kishore");
		mydriver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("j");
		mydriver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14 kmbarstreet");
		mydriver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ponneri");
		mydriver.findElement(By.id("createLeadForm_generalCity")).sendKeys("thiruvallur");
		mydriver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("601204");
		mydriver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("115");
		mydriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		mydriver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		
		
		//mydriver.findElement(By.name("submitButton")).click();
		
		//driver.close();

		
		
		//mydriver.close();
	}

}/*
	username :
	password : */
