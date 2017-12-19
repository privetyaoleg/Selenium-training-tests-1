package by.htp.testng.testng_study.sites;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	
	protected WebDriver driver;

	public abstract void openPage();

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
}
