package com.mavenownproject.testcases;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mavenownproject.utilities.ExcelUtils;

public class Test_Log4jSample {

	@Test
	void test1() throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		String chromePath = "D:\\Learning_Tools\\Selenium\\Selenium_Prerequisites\\Browser_Executable_Drivers\\Chrome_Driver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromePath);
//
//		Logger log = Logger.getLogger(Test_Log4jSample.class);
//		//Logger log = Logger.getLogger("Test_Log4jSample");
//
//	       // configure log4j properties file
//	      // PropertyConfigurator.configure("log4j.properties");
//		
//		log.info("Test Case 1");
//		log.info("ebay website is lanched");

		ExcelUtils.SettingExcelfile(
				"D:\\Learning_Tools\\Eclipse\\Eclipse_EE_Dev_Workspace\\Selenium_Frameworks_Archive_Workspace\\mavenownproject\\TestNGdata.xlsx",
				"Login");

		String a = ExcelUtils.readCellData(2,2);
		System.out.println("sgsdgsdgasga");
		System.out.println(a);

//		driver.get("https://www.ebay.com");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//
//		// driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/a")).click();;
//		WebElement menu = driver
//				.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[contains(text(),'Electronics')]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(menu).perform();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[@class='hl-cat-nav__js-link'][contains(text(),'iPhone')]")).click();
	}

}
