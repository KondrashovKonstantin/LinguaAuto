package pageobjects.loginpage;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ElementsLogin extends BasePage {
    ElementsLogin(WebDriver driver){
        super(driver);
    }
    By userNotFoundError(){
        return By.xpath("//div[contains(text(),\"User not found\")]");
    }
    By passwordLoginError(){
        return By.xpath("//div[contains(text(),\"Invalid password\")]");
    }
    By emailField(){
        return By.xpath("//input[@name=\"email\"]");
    }
    By passwordField(){
        return By.xpath("//input[@name=\"password\"]");
    }
    By loginSignUpBtn(){
        return By.xpath("//div[@role=\"button\"]");
    }
    By confirmPasswordFieldSignUp(){
        return By.xpath("//input[@name='confirmPassword']");
    }
}
