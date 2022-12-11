package Skipatestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testskip {
	
	@Test
	public void skipcase() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("program running successfully1");
		driver.get("https://www.tirumala.org/");
		driver.manage().window().maximize();
		driver.quit();
	    
	}


     @Test (dependsOnMethods = "skipcase")
     public void Nextset() {
    	 WebDriverManager.chromedriver().setup();
 		 WebDriver driver = new ChromeDriver();
    	 System.out.println("program running successfully2");
 		driver.get("https://www.geeksforgeeks.org/software-testing-basics/");
 		driver.manage().window().maximize();
 		driver.quit();
 	    
     }
     

    @Test (dependsOnMethods = "Nextset")
    public void next2() {
    	 WebDriverManager.chromedriver().setup();
 		 WebDriver driver = new ChromeDriver();
    	 System.out.println("program running successfully3");
    	 driver.get("https://www.guru99.com/software-testing-introduction-importance.html");
    	 driver.manage().window().maximize();
    	 driver.quit();
    
    }
    
	
    @Test (dependsOnMethods = "next2")
    public void next3() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	System.out.println("program running successfully4");
    	driver.get("https://www.tutorialspoint.com/software_testing/index.html");
    	driver.manage().window().maximize();
    	driver.quit();
    }

   @Test(dependsOnMethods = "next3")
    public void next4() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	System.out.println("program running successfully5");
    	driver.get("https://www.testim.io/blog/software-testing-basics/");
    	driver.manage().window().maximize();
    	driver.quit();
    }
}



