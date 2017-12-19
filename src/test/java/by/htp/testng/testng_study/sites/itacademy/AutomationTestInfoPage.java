package by.htp.testng.testng_study.sites.itacademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.htp.testng.testng_study.sites.AbstractPage;

public class AutomationTestInfoPage extends AbstractPage {
	
	private final String BASE_URL = "https://www.it-academy.by/course/java-test-automation-engineer-by-epam/";
	
	private final String XPATH_ABOUT_COURSE = "//a[contains(@href, 'praktikum') and text() = 'Подробнее о курсе']";
	private final String XPATH_PRICES = "//span[text() = 'Стоимость']/following::span[1]";
	
	
	public AutomationTestInfoPage(WebDriver driver) {
		super(driver);
	}


	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}
	
	public List<WebElement> getCoursePrices(){
		
		return driver.findElements(By.xpath(XPATH_PRICES));
		
	}
	


}
