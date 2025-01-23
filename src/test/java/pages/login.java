package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.baseTest;

public class login {
	
	@FindBy(name = "username")
	WebElement usernameBox;
	
	@FindBy(name = "password")
	WebElement passwordBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public login() {
		PageFactory.initElements(baseTest.driver, this);
	}
	
	//Logger class is created and then used in the message, it will be logged on console and rolling(property.filename) as mentioned in log4j2.properties
	//in src/main/resources
	Logger log = LogManager.getLogger(login.class);
	
	public void loginApp() {
		usernameBox.sendKeys("admin");
		log.info("Username entered succesfullly");
		
		passwordBox.sendKeys("admin123");
		log.info("password entered succesfullly");
		
		loginButton.click();
	}

}
