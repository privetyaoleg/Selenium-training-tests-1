package by.htp.testng.testng_study.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import by.htp.testng.testng_study.driver.DriverSingleton;
import by.htp.testng.testng_study.sites.itacademy.AutomationTestInfoPage;
import by.htp.testng.testng_study.sites.itacademy.MainPage;
import by.htp.testng.testng_study.sites.quiz.LoginPage;
import by.htp.testng.testng_study.sites.quiz.QuizMainPage;
import by.htp.testng.testng_study.sites.quiz.RegistrationPage;

public class Actions {
	
	private WebDriver driver;

	public void initBrowser() {
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver() {
		DriverSingleton.closeDriver();
	}
	
	public boolean comparePrices(String price1, String price2){
		
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.openAboutAutoTest();
		AutomationTestInfoPage automationTestInfoPage = new AutomationTestInfoPage(driver);
		
		List<WebElement> prices = automationTestInfoPage.getCoursePrices();
		
		if (prices.get(0).getText().equals(price1) && prices.get(1).getText().equals(price2)){
			return true;
		}
		
		
		return false;
	}
	
	public String getResultRegistration(String name, String email, String password){
		QuizMainPage quizMainPage = new QuizMainPage(driver);
		quizMainPage.openPage();
		quizMainPage.clickRegistr();
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.registrationNewUser(name, email, password);
		String result = registrationPage.resultRegistration();
		
		return result;
	}
	
	public String getResultLogin(String login, String password){
		QuizMainPage quizMainPage = new QuizMainPage(driver);
		quizMainPage.openPage();
		quizMainPage.clickLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(login, password);
		return loginPage.getResultLogin();
	}
	
	public boolean isCorrectLogin(String login, String password){
		QuizMainPage quizMainPage = new QuizMainPage(driver);
		quizMainPage.openPage();
		quizMainPage.clickLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(login, password);
		try {
			loginPage.getResultLogin();
		} catch (NoSuchElementException e){
			return true;
		}
		
		return false;
	}
	
	public String getTitleByWordGoogle(String searchWord){
		
		driver.get("http://google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys(searchWord);
		driver.findElement(By.name("btnK")).click();
		String result = driver.getTitle();
		
		return result;
	}
	
	public String getTitleGoogle(){
		driver.get("http://google.com/");
		return driver.getTitle();
	}
	
	public void tutByTest(){
		
		driver.get("https://tut.by");
		
		String title = driver.findElement(By.tagName("h1")).getText();
		System.out.println("Title name = " + title);
				
		
		WebElement mainNews = driver.findElement(By.className("b-mainnews__img"));
		mainNews.click();
		WebElement mainArticle = driver.findElement(By.id("article_body"));
		List ar = mainArticle.findElements(By.tagName("p"));
		List ar2 = driver.findElements(By.xpath("//div[@id = \"utm_article_block\" ]//p"));
		
		System.out.println("Amount of paragraphs = " + ar.size() + " " + ar2.size());
	}
}
