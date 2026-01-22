package in.codecompass.Pages.PageObjectModel.Wise;
import in.codecompass.Base.CommonToAllPage;
import in.codecompass.Utils.PropertiesReader;
import in.codecompass.Utils.WaitHelpers;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ChartsPage extends CommonToAllPage{
    WebDriver driver ;
    private  final By username = By.id("normal_login_userName");
    private  final By password = By.id("normal_login_password");
    private  final By LoginButton = By.xpath("//div[@class = \"ant-form-item-control-input-content\"]/button");
    private  final  By remeberme = By.id("normal_login_remember");
//    private final By admin_menu = By.xpath("//li[@data-menu-id=\"main-menu-101\"]");
//    private final By charts = By.cssSelector("a[href='/charts']");
    private final By dataSource_div = By.xpath("//div[contains(text(),'Data Source')]");
    private  final By choosedataSource = By.xpath("//div[@id='rc-tabs-1-panel-2']//div[@class='ant-flex css-1x5n6pw ant-flex-align-stretch ant-flex-vertical']//div[@class='ant-flex css-1x5n6pw ant-flex-align-stretch ant-flex-vertical']//button[@type='button']");
    private final By chooseDataSourceType = By.xpath("//body/div/div[@class='ant-modal-root css-1x5n6pw']/div[@class='ant-modal-wrap']/div[@role='dialog']/div/div[@class='ant-modal-content']/div[@class='ant-modal-body']/div/div[1]/div[1]");
   private final By chooseDataSourceType_input = By.xpath("//input[@id='rc_select_1']");

   private final By DataSource_inchoosedatasource = By.xpath("//div[@class=\"ant-modal-body\"]/div[1]/div[2]/div");
   private final By DataSourcefield_input = By.xpath("//input[@id='rc_select_2']");

   private final By Schema  = By.xpath("//div[@class='ant-modal-body']/div/div[3]/div[1]");
   private final By Schema_input = By.xpath("//input[@id='rc_select_3']");
    private final By search_input = By.xpath("//input[@id='rc_select_1']");
   private final By table = By.xpath("//div[@class='ant-modal-body']/div/div[4]/div[1]");
   private final By table_input = By.xpath("//input[@id='rc_select_4']");
   private final By Add_button = By.xpath("//div[@class=\"ant-modal-footer\"]//following::button");
    private final By Charts_bySearch = By.xpath("//a[normalize-space()='Charts']");
    private final By Success_message_of_Tables_connected = By.xpath("//span[contains(normalize-space(),'Columns fetched for ')]");
    private final By Configuration_Button = By.xpath("//div[contains(text(),'Configurations')]");
    private final By time_series_field_dropdown =By.xpath("//div[@class='ant-select ant-select-sm ant-select-outlined w-full css-1x5n6pw ant-select-single ant-select-allow-clear ant-select-show-arrow']//span[@class='ant-select-selection-search']");
    private final By date_column = By.xpath("//div[@id='rc_select_38_list_0']");
    private final By Xaxis = By.xpath("//button[@class=\"wise-add-column doinline2block\"]");
//    private final By Xaxis_Columns_inputbox = By.xpath("//input[@id='rc_select_50']");
    private final By Columns_span = By.xpath("//div[@class='dropdown-container']/div/div/div/div/span/span[@class=\"ant-select-selection-search\"]");
    private final By Xaxis_Ok_Button = By.xpath("//div[@id='root']//div[3]//button[2]");
    private final By Apply_config_button = By.xpath("//span[normalize-space()='Apply Config']");
    private final By txt_Opertaor = By.xpath("//span[normalize-space()='Operator']");

    public ChartsPage(WebDriver driver){
        this.driver = driver;
    }
    public ChartsPage Login (){
        openWiseUrl();
        enterInput(username, PropertiesReader.readKey("username"));
        enterInput(password,PropertiesReader.readKey("password"));
        clickElement(remeberme);
        clickElement(LoginButton);
        return this;
    }
//    public ChartsPage Gotocharts(){
//
//        WaitHelpers.checkVisibility(driver,admin_menu,5);
//        WaitHelpers.elementToBeClickable(admin_menu);
//        clickUsingActions(admin_menu);
////        WaitHelpers.checkVisibility(driver,charts,5);
////        WaitHelpers.elementToBeClickable(charts);
//        clickElement(charts);
////       WaitHelpers.checkVisibility(driver, dataSource_div,5);
//        WaitHelpers.elementToBeClickable(dataSource_div);
//        clickElement(dataSource_div);
//        WaitHelpers.checkVisibility(driver,choosedataSource,5);
////        WaitHelpers.elementToBeClickable(choosedataSource);
//        clickElement(choosedataSource);
//        return this ;
//    }
public ChartsPage Go_Charts_bySearch(){
    WaitHelpers.checkVisibility(driver,search_input,10);
    enterInput(search_input,PropertiesReader.readKey("Charts"));
    WaitHelpers.checkVisibility(driver,Charts_bySearch,3);
    clickElement(Charts_bySearch);
    WaitHelpers.checkVisibility(driver, dataSource_div,5);
        WaitHelpers.elementToBeClickable(dataSource_div);
        clickElement(dataSource_div);
        WaitHelpers.checkVisibility(driver,choosedataSource,5);
//        WaitHelpers.elementToBeClickable(choosedataSource);
        clickElement(choosedataSource);
    return this;
}
    public String ChooseDataSource(){
     WaitHelpers.checkVisibility(driver,chooseDataSourceType,10);
        WaitHelpers.elementToBeClickable(chooseDataSourceType);
    clickUsingActions(chooseDataSourceType);
     WaitHelpers.checkVisibility(driver,chooseDataSourceType_input,5);
    enterInputusingActions(chooseDataSourceType_input,"Database");
     WaitHelpers.checkVisibility(driver, DataSource_inchoosedatasource,5);
        WaitHelpers.elementToBeClickable(DataSource_inchoosedatasource);
     clickUsingActions(DataSource_inchoosedatasource);
     WaitHelpers.checkVisibility(driver,DataSourcefield_input,5);
     enterInputusingActions(DataSourcefield_input,PropertiesReader.readKey("DataSourcefield_input"));
     WaitHelpers.checkVisibility(driver, Schema,5);
        WaitHelpers.elementToBeClickable(Schema);
     clickUsingActions(Schema);
     WaitHelpers.checkVisibility(driver,Schema_input,5);
     enterInputusingActions(Schema_input,PropertiesReader.readKey("Schema_input"));
     WaitHelpers.checkVisibility(driver, table,5);
        WaitHelpers.elementToBeClickable(table);
     clickUsingActions(table);
     WaitHelpers.checkVisibility(driver,table_input,5);
     enterInputusingActions2(table_input,PropertiesReader.readKey("table_input"));

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(Add_button))
                .click();
     WaitHelpers.checkVisibility(driver,Success_message_of_Tables_connected,10);
     String message = getText(Success_message_of_Tables_connected)   ;
        return message;

    }
    public ChartsPage ChooseDataSourceNoreturn(){
        WaitHelpers.checkVisibility(driver,chooseDataSourceType,10);
        WaitHelpers.elementToBeClickable(chooseDataSourceType);
        clickUsingActions(chooseDataSourceType);
        WaitHelpers.checkVisibility(driver,chooseDataSourceType_input,5);
        enterInputusingActions(chooseDataSourceType_input,"Database");
        WaitHelpers.checkVisibility(driver, DataSource_inchoosedatasource,5);
        WaitHelpers.elementToBeClickable(DataSource_inchoosedatasource);
        clickUsingActions(DataSource_inchoosedatasource);
        WaitHelpers.checkVisibility(driver,DataSourcefield_input,5);
        enterInputusingActions(DataSourcefield_input,PropertiesReader.readKey("DataSourcefield_input"));
        WaitHelpers.checkVisibility(driver, Schema,5);
        WaitHelpers.elementToBeClickable(Schema);
        clickUsingActions(Schema);
        WaitHelpers.checkVisibility(driver,Schema_input,5);
        enterInputusingActions(Schema_input,PropertiesReader.readKey("Schema_input"));
        WaitHelpers.checkVisibility(driver, table,5);
        WaitHelpers.elementToBeClickable(table);
        clickUsingActions(table);
        WaitHelpers.checkVisibility(driver,table_input,5);
        enterInputusingActions2(table_input,PropertiesReader.readKey("table_input"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(Add_button))
                .click();
        return this;
    }

    public String  XaxisApplycongig(){
    WaitHelpers.checkVisibility(driver,Configuration_Button,10);
    clickElement(Configuration_Button);
    clickElement(time_series_field_dropdown);
    PressEnter();
    clickElement(Xaxis);
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(Columns_span)).click().sendKeys(PropertiesReader.readKey("column_xaxis1"))
            .keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    clickElement(Xaxis_Ok_Button);
    clickElement(Apply_config_button);
    WaitHelpers.checkVisibility(driver,txt_Opertaor,5);
    String message = getText(txt_Opertaor);
        return message ;

    }


}
