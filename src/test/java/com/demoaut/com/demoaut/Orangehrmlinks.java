package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demoaut.com.testbase.Presetup;

public class Orangehrmlinks extends Presetup {
	@Test
	void linktest() throws IOException {
		File file = new File("./src/test/resources/testdata/config.properties");
		Properties prop = property(file);
		webdriver.get(prop.getProperty("url"));
		ArrayList<WebElement> webEle_list = (ArrayList<WebElement>) webdriver.findElements(By.xpath("//a"));
		for (int initial = 0; initial < webEle_list.size(); initial++) {
			String links = webEle_list.get(initial).getText();
			String url = webEle_list.get(initial).getAttribute("href");
			System.out.println(links + "====:\t" + url);
		}
		webdriver.close();

	}

}
