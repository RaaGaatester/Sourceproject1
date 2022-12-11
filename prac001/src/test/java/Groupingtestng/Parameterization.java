package Groupingtestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("Name")
	public void printname(String name) {
		System.out.println("The name is" + name);
	}

}
