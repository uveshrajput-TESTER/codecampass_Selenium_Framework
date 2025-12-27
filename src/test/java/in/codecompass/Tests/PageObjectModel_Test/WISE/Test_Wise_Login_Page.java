package in.codecompass.Tests.PageObjectModel_Test.WISE;

import in.codecompass.Base.CommonToAllTest;
import in.codecompass.Driver.DriverManager;
import in.codecompass.Pages.PageObjectModel.Wise.HomePage;
import in.codecompass.Pages.PageObjectModel.Wise.LoginPage;
import in.codecompass.Utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;
public class Test_Wise_Login_Page extends CommonToAllTest {
    private static final Logger logger = LogManager.getLogger(Test_Wise_Login_Page.class);

    @Owner("Uvesh rajput")
    @Description("TC#1- Verify that with valid Username and Password User login Successfully ")
    @Test
    public void test_Login_Successfully() throws Exception {
        logger.info("Starting the TC#1");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        loginPage.loginToWiseLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.hometext();
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        logger.info("Done the Test cases");
        Assert.assertEquals(txt,PropertiesReader.readKey("hometext"));
    }
    @Owner("Uvesh rajput")
    @Description("TC#2- Verify that with Invalid Username and Password,Proper Message is Shown ")
    @Test
    public void test_Login_Error_Message() throws Exception {
        logger.info("Starting the TC#2");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
       String txt =  loginPage. loginToWiseLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        logger.info("Done the Test cases");
        Assert.assertEquals(txt,PropertiesReader.readKey("error_message"));
    }


}
