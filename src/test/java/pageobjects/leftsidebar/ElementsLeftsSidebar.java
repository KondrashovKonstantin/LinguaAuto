package pageobjects.leftsidebar;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ElementsLeftsSidebar extends BasePage {
    ElementsLeftsSidebar(WebDriver driver){
        super(driver);
    }
    By burgerBtn(){
        return By.xpath("//div[@class=\" left_29dLB_ rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1loqt21 rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1otgn73 rn-eafdt9 rn-1i6wzkk rn-lrvibr rn-1lgpqti\"]");
    }
    By myClassesBtn(){
        return By.xpath("");
    }
    By myChatsBtn(){
        return By.xpath("");
    }
    By joinOrCreateClassBtn(){
        return By.xpath("");
    }
    By feedBackBtn(){
        return By.xpath("");
    }
    By accountBtn(){
        return By.xpath("");
    }
    By adminBtn(){
        return By.xpath("");
    }
    By nsAppBtn(){
        return By.xpath("//div[@data-testid=\"LeftSidebar_Menu_NSAppItem\"]");
    }
    By profileBtn(){
        return By.xpath("");
    }
    By languagesBtn(){
        return By.xpath("");
    }
    By accountSettingsBtn(){
        return By.xpath("");
    }
    By managePlanBtn(){
        return By.xpath("");
    }
    By publicBtn(){
        return By.xpath("");
    }
    By slowPaybackBtn(){
        return By.xpath("");
    }
    By autoplayAudioBtn(){
        return By.xpath("");
    }
    By logOutBtn(){
        return By.xpath("");
    }

}
