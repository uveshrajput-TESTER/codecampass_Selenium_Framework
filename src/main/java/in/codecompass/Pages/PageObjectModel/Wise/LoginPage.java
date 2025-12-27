package in.codecompass.Pages.PageObjectModel.Wise;

import in.codecompass.Base.CommonToAllPage;
import in.codecompass.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPage {
    // Page Class
    // Page Locators
//    sabse pahle ek constructor bnao aur usme driver pass karao
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    // // Step 1 - Page Locators
    private final By username = By.id("normal_login_userName");
    private final By password = By.id("normal_login_password");
    private final By LoginButton = By.xpath("//div[@class = \"ant-form-item-control-input-content\"]/button");
    private final By remeberme = By.id("normal_login_remember");
   private final By error_message_invalid_cred = By.xpath("//span[normalize-space()='Invalid user credentials!... Access Denied']");
private final By error_message_empty_username_field = By.xpath("//div[@class = \"ant-form-item-explain-error\" ]");


   //    Step 2 - Actions
    public String loginToWiseLoginInvalidCreds(String user, String pwd) {
        openWiseUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(remeberme);
        clickElement(LoginButton);
        WaitHelpers.checkVisibility(driver, error_message_invalid_cred,3);
        String message = getText(error_message_invalid_cred);
        return message;
    }

    public void loginToWiseLoginValidCreds(String user, String pwd) {
        openWiseUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(remeberme);
        clickElement(LoginButton);
    }

}
