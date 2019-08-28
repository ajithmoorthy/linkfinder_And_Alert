package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demoaut.com.testbase.Presetup;

public class Alert extends Presetup {
	@Test
	public void alert() throws IOException {
		File file = new File("./src/test/resources/testdata/config.properties");
		File file1 = new File("./src/test/resources/locators/rediff.properties");
		Properties prop = property(file);
		Properties prop1 = property(file1);
		webdriver.manage().window().maximize();
		webdriver.get(prop.getProperty("url3"));
		WebElement sign_in = webdriver.findElement(By.xpath(prop1.getProperty("loc.btn.go.xpath")));
		sign_in.click();
		webdriver.switchTo().alert().accept();
		webdriver.quit();
	}

}
