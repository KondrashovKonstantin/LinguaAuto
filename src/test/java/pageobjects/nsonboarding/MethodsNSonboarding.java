package pageobjects.nsonboarding;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;

public class MethodsNSonboarding extends ElementsNSonboarding{
    public MethodsNSonboarding(WebDriver driver){
        super(driver);
    }


    private void languageItemClick(int number){
        waitForElementToBeClickable(languageItem(number)).click();
        log.info("Click on language in the list");
    }
    private void intermediateLvlClick(){
        waitForElementToBeClickable(intermediateLvlBtn()).click();
        log.info("Click on Intermediate LVL button");
    }
    private void nextBtnClick(){
        waitForElementToBeClickable(nextBtn()).click();
        log.info("Click next btn");
    }
    private void setNameField(String name){
        waitForElementToBeClickable(nameInput()).sendKeys(name);
        log.info("Set name field");
    }
    private void setDescriptionField(String descriptionField){
        waitForElementToBeClickable(descriptionInput()).sendKeys(descriptionField);
        log.info("Set description field");
    }
    private void openCameraBtnClick(){
        waitForElementToBeClickable(openCameraBtn()).click();
        log.info("Click Open camera Btn");
    }
    private void recordVideoBtnClick(){
        waitForElementToBeClickable(recordVideoBtn()).click();
        log.info("click record button");
    }
    private void stopRecordingBtnClick(){
        waitForElementToBeClickable(stopRecordingBtn()).click();
        log.info("click Stop button");
    }
    private void setSkypeId(String skypeId){
        waitForElementToBeClickable(skypeIdInput()).sendKeys(skypeId);
        log.info("set skype id");
    }
    public void skypeIdClick(){
        waitForElementToBeClickable(skypeIdInput()).click();
    }
    private void fullTimeRdBtnClick(){
        waitForElementToBeClickable(fullTimeRadioBtn()).click();
        log.info("set option ... click full time radio button");
    }
    private void setMonthlyRate(@NotNull Integer monthlyRate){
        waitForElementToBeClickable(monthlyRateField()).sendKeys(monthlyRate.toString());
        log.info("set monthly rate");
    }
}
