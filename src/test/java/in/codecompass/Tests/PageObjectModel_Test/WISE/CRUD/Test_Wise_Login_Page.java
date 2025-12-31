package in.codecompass.Tests.PageObjectModel_Test.WISE.CRUD;

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

import static org.hamcrest.Matchers.containsString;
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

    @Owner("Uvesh rajput")
    @Description("TC#3- Verify that with empty Username and valid Password,Proper error Message is Shown to User ")
    @Test
    public void test_Useremptyfield() throws Exception {
        logger.info("Starting the TC#3");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.emptyUsernamefield_error(PropertiesReader.readKey("password"));

       logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("error_message_empty_user_field"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#4- Verify that with valid Username and empty Password,Proper error Message is Shown to User ")
    @Test
    public void test_Passwordemptyfield() throws Exception {
        logger.info("Starting the TC#4");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.emptyPasswordfield_error(PropertiesReader.readKey("username"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("error_message_empty_paswd_field"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#5- Verify that with valid Username and valid email User get forgot Password Email ")
    @Test
    public void test_forgotvalidCreds() throws Exception {
        logger.info("Starting the TC#5");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
         String txt =  loginPage.forgotpasswordvalidCreds(PropertiesReader.readKey("username_forgot"),PropertiesReader.readKey("Email_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).contains("Reset password link has been sent to registered emailId for user:");
        logger.info("Done the Test cases");
    }

    @Owner("Uvesh rajput")
    @Description("TC#6- Verify that with invalid Username and valid email ,User got Proper Message  ")
    @Test
    public void test_forgotInvaildUser() throws Exception {
        logger.info("Starting the TC#6");
        logger.info("TC#6- Verify that with invalid Username and valid email ,User got Proper Message ");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.forgotpasswordInvalidCreds(PropertiesReader.readKey("Invalid_username_forgot"),PropertiesReader.readKey("Email_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase("does not exist");
        logger.info("Done the Test cases");

    }

    @Owner("Uvesh rajput")
    @Description("TC#7- Verify that with valid Username and Invalid email ,User got Proper Message  ")
    @Test
    public void test_forgotInvaildEmail() throws Exception {
        logger.info("Starting the TC#7");
        logger.info("TC#7- Verify that with valid Username and Invalid email ,User got Proper Message ");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.forgotpasswordInvalidCreds2(PropertiesReader.readKey("username_forgot"),PropertiesReader.readKey("Invalid_Email_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase("please enter registered email-Id");
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#8- Verify that with empty Username and valid email ,User got Proper Message   ")
    @Test
    public void test_forgotEmptyUsername() throws Exception {
        logger.info("Starting the TC#8");
        logger.info("TC#8- Verify that with empty Username and valid email ,User got Proper Message ");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.forgotpasswordEmptyusername(PropertiesReader.readKey("Email_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase("Please enter your username");
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#9- Verify that with valid Username and Empty email ,User got Proper Message   ")
    @Test
    public void test_forgotEmptyEmail() throws Exception {
        logger.info("Starting the TC#9");
        logger.info("TC#9- Verify that with valid Username and Empty email ,User got Proper Message ");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.forgotpasswordEmptyEmail(PropertiesReader.readKey("username_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase("Please enter your email");
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#10- Verify that with unformated email in UI User Got Proper Message   ")
    @Test
    public void test_forgotUnformatedEmail() throws Exception {
        logger.info("Starting the TC#10");
        logger.info("TC#10- Verify that with unformated email in UI User Got Proper Message  ");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.forgotpasswordunformatedEmail(PropertiesReader.readKey("unformated_Email_forgot"));

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase("Please enter a valid email");
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#11- Verify that Notice Dashboard Heading is Present on the Login Page")
    @Test
    public void test_NoticeBoardPresent() throws Exception {
        logger.info("Starting the TC#11");
        logger.info("TC#11- Verify that Notice Dashboard Heading is Present on the Login Page");
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String txt =  loginPage.verify_Notice_dashBoard();

        logger.info("Assertion is Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
       Assert.assertEquals(txt,PropertiesReader.readKey("notice"));
        logger.info("Done the Test cases");

    }










}
