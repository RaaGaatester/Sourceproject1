package TestNgpractice001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceclass001 {
	
	@Test (priority=1)
	public void TestNg01() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("program running successfully1");
		driver.get("https://www.tirumala.org/");
		driver.manage().window().maximize();
		driver.quit();
	    
	}


     @Test(priority=3)
     public void Nextset() {
    	 WebDriverManager.chromedriver().setup();
 		 WebDriver driver = new ChromeDriver();
    	 System.out.println("program running successfully2");
 		driver.get("https://www.geeksforgeeks.org/software-testing-basics/");
 		driver.manage().window().maximize();
 		driver.quit();
 	    
     }
     

    @Test(priority=2)
    public void next2() {
    	 WebDriverManager.chromedriver().setup();
 		 WebDriver driver = new ChromeDriver();
    	 System.out.println("program running successfully3");
    	 driver.get("https://www.guru99.com/software-testing-introduction-importance.html");
    	 driver.manage().window().maximize();
    	 driver.quit();
    
    }
    
}
