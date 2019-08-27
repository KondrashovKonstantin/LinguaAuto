package framework;

public class BaseTest extends BaseFramework {
    public void loginTest()throws InterruptedException{
        startPage.signUpBtnClick();
        loginPage.signUp("test.user."+System.currentTimeMillis()+"@lingua.livee", "11111111");
        leftSidebar.nsAppBtnClick();
        nsApp.nsOnboardingPositive();
    }
}
