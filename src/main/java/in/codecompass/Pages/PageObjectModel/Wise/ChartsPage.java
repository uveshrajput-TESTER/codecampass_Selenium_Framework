package in.codecompass.Pages.PageObjectModel.Wise;
import in.codecompass.Base.CommonToAllPage;
import in.codecompass.Utils.PropertiesReader;
import in.codecompass.Utils.WaitHelpers;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ChartsPage extends CommonToAllPage{
    WebDriver driver ;
    private  final By username = By.id("normal_login_userName");
    private  final By password = By.id("normal_login_password");
    private  final By LoginButton = By.xpath("//div[@class = \"ant-form-item-control-input-content\"]/button");
    private  final  By remeberme = By.id("normal_login_remember");
    private final By admin_menu = By.cssSelector("li:nth-of-type(2) svg");
    private final By charts = By.cssSelector("a[href='/charts'] span[aria-label='desktop'] svg");

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
    public void Gotocharts(){
        WaitHelpers.checkVisibility(driver,admin_menu,5);
        clickUsingActions(admin_menu);
        clickUsingActions(charts);

    }

}
