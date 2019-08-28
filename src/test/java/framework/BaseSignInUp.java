package framework;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseSignInUp extends BaseFramework {
    public void loginNegativeEmailTest(){
        startPage.loginBtnClick();
        loginPage.logInToApp("email","password");
        loginPage.userNotFoundAssertion();

    }
    public void loginNegativePasswordTest(){
        startPage.loginBtnClick();
        loginPage.logInToApp("b@b.com", "password");
        loginPage.loginPasswordErrorAssertion();
    }
    public void loginPositiveTest (){
        startPage.loginBtnClick();
        loginPage.logInToApp("test.valid@credentials.com", "11111111");
        loginPage.loginPositiveAssertion();
    }
    public void signUpPositiveTest (){
        startPage.signUpBtnClick();
        loginPage.signUp("test."+ System.currentTimeMillis()+"@lingua.live", "11111111");
        loginPage.loginPositiveAssertion();
    }

}
