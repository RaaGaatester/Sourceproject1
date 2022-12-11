package Groupingtestng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	String name ="Adithya";
	boolean value = false;
	
	@Test
	public void check() {
		Assert.assertEquals(name, "Adithya");
		Assert.assertFalse(value, "This should not be true");
	}

}
