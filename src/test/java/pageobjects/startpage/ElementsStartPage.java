package pageobjects.startpage;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ElementsStartPage extends BasePage {
    ElementsStartPage(WebDriver driver){
        super(driver);
    }
    By loginBtn(){
        return By.xpath("//div[contains(text(),'LOG IN')]");
    }
    By signUp(){
        return By.xpath("//div[contains(text(),'SIGN UP')]");
    }

}
