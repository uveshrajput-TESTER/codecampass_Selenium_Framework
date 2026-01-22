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
    @Description("TC#1-  Verify that Successfully Required Tables connected ")
    @Test
    public void test_Connect_Tables() throws Exception {
        logger.info("Starting the TC#1 - ");
        // Page Class Code (POM Code) - 2
        ChartsPage chartspage = new ChartsPage(DriverManager.getDriver());
        String txt = chartspage.Login().Go_Charts_bySearch().ChooseDataSource();

        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        assertThat(txt).containsIgnoringCase(PropertiesReader.readKey("succ_msg_columnfetch"));
        logger.info("Done the Test cases");
    }
    @Owner("Uvesh rajput")
    @Description("TC#2-  Verify that Entering Time field and X axis Apply config Buttons becopmes Clickable ")
    @Test
    public void test_Goto_Charts() throws Exception {
        logger.info("Starting the TC#2 - ");
        // Page Class Code (POM Code) - 2
        ChartsPage chartspage = new ChartsPage(DriverManager.getDriver());
          String txt = chartspage.Login().Go_Charts_bySearch().ChooseDataSourceNoreturn().XaxisApplycongig();

        logger.info("Assertion Started");
        assertThat(txt).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(txt,"Operator");
        logger.info("Done the Test cases");
    }








}
