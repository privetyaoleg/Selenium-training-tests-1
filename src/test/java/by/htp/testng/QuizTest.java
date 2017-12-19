package by.htp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuizTest extends AppTest{

	
	@Test (description = "registration")
	public void repeatedName(){
		Assert.assertTrue(actions.getResultRegistration("hello", "hello@mail.ru", "7313494").contains("логин занят"));
	}
	
	@Test (description = "registration")
	public void wrongEmail(){
		Assert.assertTrue(actions.getResultRegistration("HELLO", "hello", "7313494").contains("Некорректный e-mail"));
	} 
	
	@Test (description = "registration")
	public void noName(){
		Assert.assertTrue(actions.getResultRegistration("", "hello", "7313494").contains("Введите логин"));
	} 
	
	@Test (description = "registration")
	public void noPassword(){
		Assert.assertTrue(actions.getResultRegistration("hello", "hello@mail.ru", "").contains("Введите пароль"));
	}
	
	@Test (description = "registration")
	public void noEmail(){
		Assert.assertTrue(actions.getResultRegistration("hello", "", "7313494").contains("Некорректный e-mail"));
	}
	
	@Test (description = "login")
	public void isLoginCorrect(){
		Assert.assertTrue(actions.isCorrectLogin("privetyaolega", "7313494jarajazyq"));
	}
	
	@Test (description = "login")
	public void noLogin(){
		Assert.assertTrue(actions.getResultLogin("", "7313494").contains("Некорректное имя пользователя или пароль"));
	}
	
	@Test (description = "login")
	public void incorrectPassword(){
		Assert.assertTrue(actions.getResultLogin("oleg", "7313494").contains("Некорректное имя пользователя или пароль"));
	}
	
	@Test (description = "login")
	public void noPasswordLogin(){
		Assert.assertTrue(actions.getResultLogin("oleg", "").contains("Некорректное имя пользователя или пароль"));
	}
	
		
}
