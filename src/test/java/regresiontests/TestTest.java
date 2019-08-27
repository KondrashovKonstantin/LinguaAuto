package regresiontests;

import framework.BaseFramework;
import framework.BaseTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageobjects.loginpage.MethodsLogin;
import pageobjects.startpage.MethodsStartPage;

public class TestTest extends BaseTest {


    @Test
    public void testNumber1() throws InterruptedException {
    loginTest();

    }
}
