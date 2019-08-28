package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.demoaut.com.testbase.Presetup;

/**
 * Unit test for simple App.
 */
public class AppTest extends Presetup {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	App app = new App();

	@Test
	public void AppTest1() throws IOException {
		File file = new File("./src/test/resources/testdata/config.properties");
		File file1 = new File("./src/test/resources/locators/index.properties");
		Properties prop = property(file);
		Properties prop1 = property(file1);
		webdriver.manage().window().maximize();
		webdriver.get(prop.getProperty("url1"));
		WebElement userName = webdriver.findElement(By.xpath(prop1.getProperty("loc.txtfield.userName.xpath")));
		userName.sendKeys("mercury");
		WebElement password = webdriver.findElement(By.xpath(prop1.getProperty("loc.txtfield.password.xpath")));
		password.sendKeys("mercury");
		WebElement sign_in = webdriver.findElement(By.xpath(prop1.getProperty("loc.btn.sign_in.xpath")));
		sign_in.click();
		webdriver.quit();
	}

	// http://newtours.demoaut.com

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		AssertJUnit.assertTrue(true);
	}
}
