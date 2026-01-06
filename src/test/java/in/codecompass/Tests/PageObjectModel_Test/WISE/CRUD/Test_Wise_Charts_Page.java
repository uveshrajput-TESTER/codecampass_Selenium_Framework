package in.codecompass.Tests.PageObjectModel_Test.WISE.CRUD;
import in.codecompass.Base.CommonToAllTest;
import in.codecompass.Driver.DriverManager;
import in.codecompass.Pages.PageObjectModel.Wise.ChartsPage;
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
public class Test_Wise_Charts_Page extends CommonToAllTest {


    private static final Logger logger = LogManager.getLogger(Test_Wise_Login_Page.class);

    @Owner("Uvesh rajput")
    @Description("TC#1-  ")
    @Test
    public void test_Goto_Usermanagment() throws Exception {
        logger.info("Starting the TC#1 - ");
        // Page Class Code (POM Code) - 2
        ChartsPage chartspage = new ChartsPage(DriverManager.getDriver());
        chartspage.Login().Gotocharts();
//        String txt =  homePage.Login().Go_Usermangemnt_bySearch();
//        logger.info("Assertion Started");
//        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
//        Assert.assertEquals(txt,PropertiesReader.readKey("usermngmt_text"));
//        logger.info("Done the Test cases");

    }








}
