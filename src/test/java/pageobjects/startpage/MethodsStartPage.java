package pageobjects.startpage;


import org.openqa.selenium.WebDriver;

public class MethodsStartPage extends ElementsStartPage {
    public MethodsStartPage(WebDriver driver){
        super(driver);
    }
    public void loginBtnClick(){
        waitForElementToBeClickable(loginBtn()).click();
        log.info("Click Login");
    }
    public void signUpBtnClick(){
        waitForElementToBeClickable(signUp()).click();
        log.info("Click Sign Up");
    }
}
