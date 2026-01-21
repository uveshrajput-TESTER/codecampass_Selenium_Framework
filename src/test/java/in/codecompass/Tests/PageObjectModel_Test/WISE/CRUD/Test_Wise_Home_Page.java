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
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test_Wise_Home_Page extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(Test_Wise_Login_Page.class);

    @Owner("Uvesh rajput")
    @Description("TC#1- Verify that User go to User management through search bar ")
    @Test
    public void test_Goto_Usermanagment() throws Exception {
        logger.info("Starting the TC#1 - Verify that User go to User management through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Usermangemnt_bySearch();
       logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("usermngmt_text"));
        logger.info("Done the Test cases");

    }

    @Owner("Uvesh rajput")
    @Description("TC#2- Verify that User go to Query Studio through search bar ")
    @Test
    public void test_Goto_QueryStudio() throws Exception {
        logger.info("Starting the TC#2 - Verify that User go to Query Studio through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_QueryStudio_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("queryStudio_txt"));
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#3- Verify that User go to Data Source through search bar ")
    @Test
    public void test_Goto_dataSource() throws Exception {
        logger.info("Starting the TC#3 - Verify that User go to Data Source through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_dataSource_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("dataSource"));
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#4- Verify that User go to Charts through search bar ")
    @Test
    public void test_Goto_Charts() throws Exception {
        logger.info("Starting the TC#4- Verify that User go to Charts through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Charts_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Charts_txt"));
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#5- Verify that User go to Craete dashboards through search bar ")
    @Test
    public void test_Goto_Createdashboards() throws Exception {
        logger.info("Starting the TC#5- Verify that User go to Craete dashboards through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Createdashboards_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Createdashboard_txt"));
        logger.info("Done the Test cases");

    }
    @Owner("Uvesh rajput")
    @Description("TC#6- Verify that User go to Pivot through search bar ")
    @Test
    public void test_Goto_Pivot() throws Exception {
        logger.info("Starting the TC#6- Verify that User go to Pivot through search bar ");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Pivot_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Pivot_txt"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#7- Verify that User go to Drilldown through search bar ")
    @Test
    public void test_Goto_Drilldown() throws Exception {
        logger.info("Starting the TC#7- Verify that User go to Drilldown through search bar ");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Drilldown_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Drilldown"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#8- Verify that User go to Drilldown through search bar ")
    @Test
    public void test_Goto_Groupable() throws Exception {
        logger.info("Starting the TC#8- Verify that User go to Drilldown through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Groupable_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Groupable"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#9- Verify that User go to ReportStudio through search bar ")
    @Test
    public void test_Goto_ReportStudio() throws Exception {
        logger.info("Starting the TC#9- Verify that User go to ReportStudio through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_reportStudio_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("ReportStudio"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#10- Verify that User go to Reconciler through search bar ")
    @Test
    public void test_Goto_Reconciler() throws Exception {
        logger.info("Starting the TC#10- Verify that User go to Reconciler through search bar");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Reconciler_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Reconciler_txt"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#11- Verify that User go to Dashboards through search bar ")
    @Test
    public void test_Goto_Dashboards() throws Exception {
        logger.info("Starting the TC#11");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_Dashboards_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Dashboards"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#12- Verify that User go to Broadcastmessage through search bar ")
    @Test
    public void test_Goto_Broadcastmessages() throws Exception {
        logger.info("Starting the TC#12");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_BroadcastMessage_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Broadcastmessage"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#13- Verify that User go to TaskScheduler through search bar ")
    @Test
    public void test_Goto_TaskScheduler() throws Exception {
        logger.info("Starting the TC#13");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Go_TaskScheduler_bySearch();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("TaskScheduler"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#14- Verify that Home Page convert into Arabic  ")
    @Test
    public void test_Change_To_Arabic() throws Exception {
        logger.info("Starting the TC#14");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Change_to_Arabic();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,"الصفحة الرئيسية");
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#15- Verify that Home Page convert into Enlish from Arabic  ")
    @Test
    public void test_Change_To_English_fromArabic() throws Exception {
        logger.info("Starting the TC#15");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt =  homePage.Login().Change_to_english();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("hometext"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#16- Verify that User Logout Successfully  ")
    @Test
    public void test_Logout_successfully() throws Exception {
        logger.info("Starting the TC#16");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());

       String txt =  homePage.Login().Logout_sucessfully();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("logoutmessage"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#17- Verify that the error 'Current Password is Mandatory' ")
    @Test
    public void test_verify_oldPasswordEmptyError() throws Exception {
        logger.info("Starting the TC#17");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());

        String txt = homePage.Login().In_changePassword_EmptyoldPasswordfield();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("emptyoldPasswrod"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#18- Verify that the error 'Enter your new password' ")
    @Test
    public void test_verify_newPasswordEmptyError() throws Exception {
        logger.info("Starting the TC#18");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_EmptyNewPasswordfield();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("emptynewPassword"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#19- Verify that the error 'Password must be at least 8 characters long!' ")
    @Test
    public void test_verify_confirmPasswordEmptyError() throws Exception {
        logger.info("Starting the TC#19");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_LengthnewPasswordfield();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("lengthnewpassword"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#20- Verify that the error 'Password must include at least one uppercase letter, one numeric value, and one special character!' ")
    @Test
    public void test_verify_InvalidNewPassword() throws Exception {
        logger.info("Starting the TC#20");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_invalidnewpaswordfield();
        System.out.println(txt);
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("InvalidSyntaxnewpassword"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#21- Verify that the error 'The new password that you entered do not match!' ")
    @Test
    public void test_verify_confirmpasswordnotmatch() throws Exception {
        logger.info("Starting the TC#21");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_passwordnotsameasnewpassd();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("passworddontmatch"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#23- Verify that the error ' Invalid old password, pls enter correct existing password' ")
    @Test
    public void test_verify_23() throws Exception {
        logger.info("Starting the TC#23");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_Invalidoldpassword();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("invalidoldpassword"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#24- Verify that the error 'The new password must be different from the current password.' ")
    @Test
    public void test_verify_Same_old_new_Pasword() throws Exception {
        logger.info("Starting the TC#24");
        // Page Class Code (POM Code) - 2
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String txt = homePage.Login().In_changePassword_Sameold_new_Pasword();
        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,PropertiesReader.readKey("Same_old_newpAssword"));
        logger.info("Done the Test cases");
    }















}
