package POMtests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Simple extends usinglogin {
	@Test
	public void searcgg() {
		Driverfact ul=PageFactory.initElements(driver,Driverfact.class);
		ul.search().sendKeys("sony");;
		ul.buttonbt().click();;
	}

}
