package framework;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pageobjects.leftsidebar.MethodsLeftSidebar;
import pageobjects.loginpage.MethodsLogin;
import pageobjects.nsonboarding.MethodsNSonboarding;
import pageobjects.startpage.MethodsStartPage;

import java.security.PublicKey;


public class BaseFramework {
    private WebDriver driver;
    private ChromeOptions options;
    protected MethodsStartPage startPage;
    protected MethodsLogin loginPage;
    protected MethodsLeftSidebar leftSidebar;
    protected MethodsNSonboarding nsApp;


    @BeforeSuite
    public void beforeSuite() {
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("add --use-fake-ui-for-media-stream");
        driver = new ChromeDriver(options);
        startPage = new MethodsStartPage(driver);
        loginPage = new MethodsLogin(driver);
        leftSidebar = new MethodsLeftSidebar(driver);
        nsApp = new MethodsNSonboarding(driver);
        driver.manage().window().maximize();
        driver.get("https://lingua-dev.idecisiongames.com/");
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

    }

    @AfterSuite
    public void afterSuite() {
      //  if(null != driver) {
        //    driver.close();
     //       driver.quit();
     //   }
    }





}