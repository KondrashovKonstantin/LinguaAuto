package pageobjects.nsonboarding;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsNSonboarding extends BasePage {
    public ElementsNSonboarding(WebDriver driver){
        super(driver);
    }
    By languageItem(int number){
        return By.xpath("//div[@data-testid=\"PConfiguration_Languages_LangItem\"]["+number+"]");
    }
    By intermediateLvlBtn(){
        return By.xpath("//div[@data-testid=\"PConfiguration_Languages_Intermediate\"]");
    }
    By nextBtn(){
        return By.xpath("//div[@data-testid=\"PConfiguration_NextBtn\"]");
    }
    By nameInput(){
        return By.xpath("//input[@data-testid=\"PConfiguration_Profile_NameInput\"]");
    }
    By descriptionInput(){
        return By.xpath("//textarea[@data-testid=\"PConfiguration_Profile_AboutMeInput\"]");
    }
    By openCameraBtn(){
        return By.xpath("//div[@data-testid=\"VideoRecorder_OpenCloseCamera\"]");
    }
    By recordVideoBtn(){
        return By.xpath("//div[@data-testid=\"VideoRecorder_Tools_RecordBtn\"]");
    }
    By stopRecordingBtn(){
        return By.xpath("//div[@data-testid=\"VideoRecorder_Tools_StopBtn\"]");
    }
    By retryRecoedingBtn(){
        return By.xpath("//div[@data-testid=\"VideoRecorder_Tools_RetryBtn\"]");
    }
    By skypeIdInput(){
        return By.xpath("//input[@data-testid=\"PConfigurations_AppDetails_SkypeInput\"]");
    }
    By fullTimeRadioBtn(){
        return By.xpath("//div[@data-testid=\"PConfiguration_RateInputs_RatesRadioBtn\"]/div/div");
    }
    By monthlyRateField(){
        return By.xpath("//input[@data-testid=\"PConfiguration_RateInputs_MonthlyrateInput\"]");
    }
}
