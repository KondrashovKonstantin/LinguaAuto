package pageobjects.leftsidebar;

import org.openqa.selenium.WebDriver;

public class MethodsLeftSidebar extends ElementsLeftsSidebar {
    public MethodsLeftSidebar(WebDriver driver){
        super(driver);
    }

    public void burgerBtnClick(){
        waitForElementToBeClickable(burgerBtn()).click();
        log.info("click Burger button");
    }
    public void myClassesBtnClick(){
        waitForElementToBeClickable(myClassesBtn()).click();
        log.info("click My Classes button");
    }
    public void myChatsBtnClick(){
        waitForElementToBeClickable(myChatsBtn()).click();
        log.info("click My Chats button");
    }
    public void joinOrCreateClassBtnClick(){
        waitForElementToBeClickable(joinOrCreateClassBtn()).click();
        log.info("click join or create class button");
    }
    public void feedBackBtnClick(){
        waitForElementToBeClickable(feedBackBtn()).click();
        log.info("click feed back ");
    }
    public void accountBtnClick(){
        waitForElementToBeClickable(accountBtn()).click();
        log.info("click Account ");
    }
    public void adminBtnClick(){
        waitForElementToBeClickable(adminBtn()).click();
        log.info("click Admin");
    }
    public void nsAppBtnClick(){
        waitForElementToBeClickable(nsAppBtn()).click();
        log.info("click Native Speaker application Btn");
    }
    public void profileBtnClick(){
        waitForElementToBeClickable(profileBtn()).click();
        log.info("click Profile");
    }
    public void languageBtnClick(){
        waitForElementToBeClickable(languagesBtn()).click();
        log.info("click Language");
    }
    public void accountSettingsBtnClick(){
        waitForElementToBeClickable(accountSettingsBtn()).click();
        log.info("click Account Settings");
    }
    public void managePlanBtnClick(){
        waitForElementToBeClickable(managePlanBtn()).click();
        log.info("click Manage Plan");
    }
    public void publicBtnClick(){
        waitForElementToBeClickable(publicBtn()).click();
        log.info("click Public");
    }
    public void slowPaybackBtnClick(){
        waitForElementToBeClickable(slowPaybackBtn()).click();
        log.info("click Slow Payback");
    }
    public void autoplayBtnClick(){
        waitForElementToBeClickable(autoplayAudioBtn()).click();
        log.info("click Autoplay Audio");
    }
    public void logoutBtnClick(){
        waitForElementToBeClickable(logOutBtn()).click();
        log.info("click Logout");
    }




}
