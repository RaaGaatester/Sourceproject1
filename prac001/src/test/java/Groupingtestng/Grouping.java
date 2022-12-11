package Groupingtestng;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "apple")
	public void apple1() {
		System.out.println("This is apple 02");
	}
	@Test(groups = "apple")
	public void apple2() {
		System.out.println("This is apple 01");
	}

	@Test(groups = "apple")
	public void moto1() {
		System.out.println("This is moto 01");
	}

	@Test(groups = "apple")
	public void moto2() {
		System.out.println("This is moto 02");
	}

	@Test(groups = "vivo")
	public void vivo1() {
		System.out.println("This is vivo 01");
	}
	@Test(groups = "vivo")
	public void vivo2() {
		System.out.println("This is vivo 01");
	}

	@Test(groups = "lenovo")
	public void lenovo1() {
		System.out.println("This is lenovo 01");

	}
	@Test(groups = "lenovo")
	public void lenovo2() {
		System.out.println("This is lenovo 02");
	}
}
