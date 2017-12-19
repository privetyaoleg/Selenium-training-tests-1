package by.htp.testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import by.htp.testng.testng_study.actions.Actions;

public class AppTest {

	
	protected Actions actions;

	@BeforeSuite
	public void setUp() {
		actions = new Actions();
		actions.initBrowser();

	}
	
	
	
	@Test (enabled = false)
	public void tutMainNewsTest(){
		actions.tutByTest();
	}
	
	
	@Test (enabled = false)
	public void isTitleGoogleTest(){
		Assert.assertTrue(actions.getTitleByWordGoogle("Java").contains("Java"));
	
	}
	
	
	@Test (enabled = false)
	public void itAcademy(){
		Assert.assertTrue(actions.comparePrices("1 235 BYN", "450 BYN"));
	}
	
	
	@Test (enabled = false)
	public void googleTitleTest(){
		Assert.assertTrue(actions.getTitleGoogle().contains("Google"));
	}
	
	
	
	@AfterSuite
	public void afterClass(){
		
		actions.closeDriver();
	}
	

	
}
