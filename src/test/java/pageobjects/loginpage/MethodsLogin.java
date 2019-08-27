package pageobjects.loginpage;

import org.openqa.selenium.WebDriver;

public class MethodsLogin extends ElementsLogin{
    public MethodsLogin(WebDriver driver){
        super(driver);
    }
    private void setEmailRegForm(String email){
        waitForElementToBeClickable(emailFieldSignUp()).sendKeys(email);
        log.info("Entered email");
    }
    private void setPasswordRegForm(String password){
        waitForElementToBeClickable(passwordFieldSignUp()).sendKeys(password);
        log.info("Entered password");
    }
    private void setConfirmPasswordRegForm(String password){
        waitForElementToBeClickable(confirmPasswordFieldSignUp()).sendKeys(password);
        log.info("Entered confirm password");
    }
    private void signUpBtnClick(){
        waitForElementToBeClickable(signUpBtn()).click();
        log.info("click Sign Up");
    }
    private void setEmail(String email){
        waitForElementToBeClickable(emailField()).sendKeys(email);
        log.info("Entered email");
    }
    private void setPassword(String password){
        waitForElementToBeClickable(passwordField()).sendKeys(password);
        log.info("Entered password");
    }
    private void loginBtnClick(){
        waitForElementToBeClickable(loginBtn()).click();
        log.info("Click login");
    }
    public void logInToApp(String email,String password){
        setEmail(email);
        setPassword(password);
        loginBtnClick();
    }
    public void signUp(String email, String password){
        setEmailRegForm(email);
        setPasswordRegForm(password);
        setConfirmPasswordRegForm(password);
        signUpBtnClick();
    }
}
