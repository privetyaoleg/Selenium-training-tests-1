package by.htp.testng.testng_study.sites.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import by.htp.testng.testng_study.sites.AbstractPage;

public class LoginPage extends AbstractPage {

	private final String BASE_URL = "http://www.quizful.net/LoginAction.loginForm";
	private final String ID_LOGIN = "login";
	private final String XPATH_PASSWORD = "//*[@type='password']";
	private final String XPATH_SUBMIT_BUTTON = "//input[@value='Войти']";
	private final String XPATH_LOGIN_RESULT = "//*[@class = 'errors']";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}
	
	public void login(String login, String password){
		driver.findElement(By.id(ID_LOGIN)).sendKeys(login);
		driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys(password);
		driver.findElement(By.xpath(XPATH_SUBMIT_BUTTON)).click();
	}
	
	public String getResultLogin(){
		return driver.findElement(By.xpath(XPATH_LOGIN_RESULT)).getText();
	}
	
	


}
