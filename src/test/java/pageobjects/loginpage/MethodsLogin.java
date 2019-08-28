package pageobjects.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
    public String getUserNotFoundText(){
        return waitForElementToBeApear(userNotFoundError()).getText();
    }
    public String getPasswordLoginText(){
        return waitForElementToBeApear(passwordLoginError()).getText();
    }
    public void userNotFoundAssertion(){
        try{
            Assert.assertEquals(getUserNotFoundText(),"User not found");
            log.info("User isn't logged in, User not found message is displayed");
        }
        catch (Error e){
            log.error(e);
            Assert.fail();
        }
        catch (Exception a){
            log.error("Message isn't displayed ======== \n issues with internet connection or xPath=============");
            Assert.fail();
        }
    }
    public void loginPositiveAssertion(){
        try{
            waitForElementToBeApear(By.xpath("//div[contains(text(),\"My Classes\")]"));
            log.info("User Signed In");        }
        catch (Exception e){
            log.error("Sign In failed");
            Assert.fail();
        }
    }

    public void loginPasswordErrorAssertion(){
        try{
            Assert.assertEquals(getPasswordLoginText(),"Invalid password");
            log.info("User isn't logged in, Invalid password message is displayed");
        }
        catch (Error e){
            log.error(e);
            Assert.fail();
        }
        catch (Exception a){
            log.error("Message isn't displayed ======== \n issues with internet connection or xPath============");
            Assert.fail();
        }
    }
}
