package by.htp.testng.testng_study.sites.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import by.htp.testng.testng_study.sites.AbstractPage;

public class RegistrationPage extends AbstractPage {

	private final String BASE_URL = "http://www.quizful.net/LoginAction.registration";
	
	private final String ID_LOGIN_FIELD = "login";
	private final String NAME_PASSWORD_FIELD = "registrationForm.password";
	private final String NAME_REPASSWORD_FIELD = "registrationForm.repassword";
	private final String NAME_CORPORATE_RB = "registrationForm.corporate";
	private final String NAME_EMAIL_FIELD = "registrationForm.email";
	private final String XPATH_SUBMIT_BUTTON = "//*[@name='ok']";

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}

	public void registrationNewUser(String name, String email, String password){
		driver.findElement(By.id(ID_LOGIN_FIELD)).sendKeys(name);
		driver.findElement(By.name(NAME_PASSWORD_FIELD)).sendKeys(password);
		driver.findElement(By.name(NAME_REPASSWORD_FIELD)).sendKeys(password);
		driver.findElement(By.name(NAME_CORPORATE_RB)).click();
		driver.findElement(By.name(NAME_EMAIL_FIELD)).sendKeys(email);
		driver.findElement(By.xpath(XPATH_SUBMIT_BUTTON)).click();
	}
	
	public String resultRegistration(){
		String result = driver.findElement(By.xpath("//div[@class='errors']")).getText();
		return result;
				
	}

	
}
