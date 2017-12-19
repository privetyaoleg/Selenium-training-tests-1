package by.htp.testng.testng_study.sites.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import by.htp.testng.testng_study.sites.AbstractPage;

public class MainPage extends AbstractPage {

	private final String BASE_URL = "http://it-academy.by";
	
	private final String XPATH_BURGER = "//div//a[@class = 'asside-button asside-button__menu hidden-xs js-panel-open']";
	private final String XPATH_AUTO_TEST = "//a[text() = 'Автоматизированное тестирование на JAVA (курс EPAM)']";
	private final String XPATH_ABOUT_COURSE = "//a[contains(@href, 'praktikum') and text() = 'Подробнее о курсе']";
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}
	
	public void openAboutAutoTest(){
		driver.findElement(By.xpath(XPATH_BURGER)).click();
		driver.findElement(By.xpath(XPATH_AUTO_TEST)).click();
	}
	
	

}
