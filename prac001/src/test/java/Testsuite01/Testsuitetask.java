package Testsuite01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsuitetask {
	WebDriver driver;
	long starttime;
	long endtime;
	@BeforeSuite
	public void launchbrowser() {
		starttime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	@Test
	public void firstsite() {
		System.out.println("program running successfully1");
		driver.get("https://www.tirumala.org/");
		driver.manage().window().maximize();
		
	}

@Test
public void secondsite() {
	System.out.println("program running successfully1");
	driver.get("https://www.techtarget.com/whatis/definition/software-testing");
	driver.manage().window().maximize();
	
	
}

@Test
public void thirdsite() {
	System.out.println("program running successfully1");
	driver.get("https://www.testim.io/blog/software-testing-basics/");
	driver.manage().window().maximize();
	
}

@AfterSuite
public void closebrowser() {
	driver.quit();
	endtime = System.currentTimeMillis();
	long totaltime = endtime-starttime;
	System.out.println("The total timetaken"+ totaltime);
}
}
