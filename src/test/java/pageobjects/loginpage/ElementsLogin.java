package pageobjects.loginpage;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ElementsLogin extends BasePage {
    ElementsLogin(WebDriver driver){
        super(driver);
    }
    By emailField(){
        return By.xpath("//input[@data-testid=\"LoginForm_EmailInput\"]");
    }
    By passwordField(){
        return By.xpath("//input[@data-testid=\"LoginForm_PasswordInput\"]");
    }
    By loginBtn(){
        return By.xpath("//div[@data-testid=\"LoginForm_LoginBtn\"]");
    }
    By emailFieldSignUp(){
        return By.xpath("//input[@data-testid=\"RegisterForm_EmailInput\"]");
    }
    By passwordFieldSignUp(){
        return By.xpath("//input[@data-testid=\"RegisterForm_PasswordInput\"]");
    }
    By confirmPasswordFieldSignUp(){
        return By.xpath("//input[@data-testid=\"RegisterForm_ConfirmPasswordInput\"]");
    }
    By signUpBtn(){
        return By.xpath("//div[@data-testid=\"RegisterForm_RegisterBtn\"]");
    }
}
