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
 private final By error_message_empty_password_field = By.xpath("//div[@id = \"normal_login_password_help\"]/div[@class=\"ant-form-item-explain-error\"]");

 private final By forgot_password = By.xpath("//button[@class='ant-btn css-1x5n6pw ant-btn-link ant-btn-color-link ant-btn-variant-link ant-btn-sm login-form-forgot']");
private final By username_forgot = By.id("username");
private final By Email_forgot = By.id("email");
private final By Submit_forgot = By.xpath("//button[@class='ant-btn css-1x5n6pw ant-btn-primary ant-btn-color-primary ant-btn-variant-solid ant-btn-sm ant-btn-block']");
private final By message_successfull_forgot = By.xpath("//span[contains(text(),'Reset password link has been sent to registered emailId for user: ')]");
private final By message_InvalidUsername_forgot = By.xpath("//span[contains(text(),'does not exist')]");
private final By message_InvalidEmail_forgot = By.xpath("//span[contains(text(),'please enter registered email-Id')]");
private final By message_forgot_empty_username = By.xpath("//div[contains(text(),'Please enter your username')]");
private final By message_forgot_empty_Email = By.xpath("//div[contains(text(),'Please enter your email')]");
private final By message_forgot_unformated_Email = By.xpath("//div[contains(text(),'Please enter a valid email')]");
private final By Notice_Board = By.xpath("//h3[normalize-space()='Notice Dashboard']");
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
    public String emptyUsernamefield_error(String pwd){
        openWiseUrl();
        enterInput(password,pwd);
        clickElement(remeberme);
        clickElement(LoginButton);
        WaitHelpers.checkVisibility(driver,error_message_empty_username_field,3);
        String message = getText(error_message_empty_username_field);
        return message;
   }
    public String emptyPasswordfield_error(String user){
        openWiseUrl();
        enterInput(username,user);
        clickElement(remeberme);
        clickElement(LoginButton);
        WaitHelpers.checkVisibility(driver,error_message_empty_username_field,3);
        String message = getText(error_message_empty_password_field);
        return message;
    }
   public String forgotpasswordvalidCreds(String user,String Email){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(username_forgot,user);
        enterInput(Email_forgot,Email);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_successfull_forgot,30);
        String message = getText(message_successfull_forgot);
        return message;
  }
    public String forgotpasswordInvalidCreds(String user,String Email){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(username_forgot,user);
        enterInput(Email_forgot,Email);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_InvalidUsername_forgot,20);
        String message = getText(message_InvalidUsername_forgot);
        return message;
    }
    public String forgotpasswordInvalidCreds2(String user,String Email){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(username_forgot,user);
        enterInput(Email_forgot,Email);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_InvalidEmail_forgot,20);
        String message = getText(message_InvalidEmail_forgot);
        return message;
    }

    public String forgotpasswordEmptyusername(String Email){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(Email_forgot,Email);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_forgot_empty_username,20);
        String message = getText(message_forgot_empty_username);
        return message;
    }
    public String forgotpasswordEmptyEmail(String user){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(username_forgot,user);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_forgot_empty_Email,20);
        String message = getText(message_forgot_empty_Email);
        return message;
    }
    public String forgotpasswordunformatedEmail(String Email){
        openWiseUrl();
        clickElement(forgot_password);
        enterInput(Email_forgot,Email);
        clickElement(Submit_forgot);
        WaitHelpers.checkVisibility(driver,message_forgot_unformated_Email,20);
        String message = getText(message_forgot_unformated_Email);
        return message;
    }
public String verify_Notice_dashBoard(){
        openWiseUrl();
        WaitHelpers.checkVisibility(driver,Notice_Board,5);
        String message = getText(Notice_Board);
        return  message;
}




}
