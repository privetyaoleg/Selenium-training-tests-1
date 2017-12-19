package by.htp.testng.testng_study.sites.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import by.htp.testng.testng_study.sites.AbstractPage;

public class QuizMainPage extends AbstractPage {

	private final String BASE_URL = "http://quizful.net/";
	
	private final String LINKTEXT_REGISTR_BUTTON = "зарегистрироваться";
	private final String XPATH_CHECKIN_BUTTON = "//li/a[text() = 'войти']";
	
	public QuizMainPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}
	
	public void clickLogin(){
		driver.findElement(By.xpath(XPATH_CHECKIN_BUTTON)).click();
	}
	
	public void clickRegistr(){
		driver.findElement(By.linkText(LINKTEXT_REGISTR_BUTTON)).click();
	}
	

}
