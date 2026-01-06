package in.codecompass.Pages.PageObjectModel.Wise;

import in.codecompass.Base.CommonToAllPage;
import in.codecompass.Utils.PropertiesReader;
import in.codecompass.Utils.WaitHelpers;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class HomePage extends CommonToAllPage {
    WebDriver driver;
    private  final By username = By.id("normal_login_userName");
    private  final By password = By.id("normal_login_password");
    private  final By LoginButton = By.xpath("//div[@class = \"ant-form-item-control-input-content\"]/button");
    private  final  By remeberme = By.id("normal_login_remember");
    private final By Home_txt = By.xpath("//span[@class='ant-breadcrumb-link']");
    private final By search_input = By.xpath("//input[@id='rc_select_1']");
    private final By Usermangmt_bySearch = By.xpath("//div/div/div/a[normalize-space()='User Management']");
    private final By Usermangmt_txt = By.xpath("//strong[normalize-space()='User Management']");
    private final By QueryStudio_bySearch = By.xpath("//div/div/div/a[normalize-space()='Query Studio']");
    private final By Qstdio_txt = By.xpath("//strong[normalize-space()='Query Studio']");
    private final By dataSource_bySearch = By.xpath("//a[normalize-space()='Data Source']");
    private final By dataSource_txt = By.xpath("//strong[normalize-space()='Data Source']");
    private final By Charts_bySearch = By.xpath("//a[normalize-space()='Charts']");
    private final By Charts_txt = By.xpath("//strong[normalize-space()='Charts']");
    private  final By  CreateDashboards_bySearch = By.xpath("//a[normalize-space()='Create Dashboard']");
    private final By Createdashboards_txt = By.xpath("//strong[normalize-space()='Create Dashboard']");
    private final By Pivot_bySearch = By.xpath("//a[normalize-space()='Pivot']");
    private final By Pivot_txt = By.xpath("//strong[normalize-space()='Pivot']");
    private final By Drilldown_bySearch = By.xpath("//a[normalize-space()='DrillDown']");
    private final By Drilldown_txt = By.xpath("//strong[normalize-space()='Drilldown']");
    private final By Groupable_bySearch = By.xpath("//a[normalize-space()='Groupable']");
    private final By Groupabletxt = By.xpath("//strong[normalize-space()='Groupable']");
    private final By ReportStudio_bySearch = By.xpath("//a[normalize-space()='Report Studio']");
    private final By ReportStudio_txt = By.xpath("//strong[normalize-space()='Report Studio']");
    private final By BroadcastMessage_bySearch = By.xpath("//div[@class='ant-select-item-option-content']//div//a[normalize-space()='Broadcast Message']");
    private final By BroadcastMessage_txt = By.xpath("//strong[normalize-space()='broadcast-message']");
    private final By Reconciler_bySearch = By.xpath("//a[normalize-space()='ReConciler']");
    private final By Reconciller_txt = By.xpath("//strong[normalize-space()='Re Conciler']");
    private final By Dashboards_bySearch  = By.xpath("//a[normalize-space()='Dashboards']");
    private final By Dashboards_txt = By.xpath("//strong[normalize-space()='Dashboards']");
    private final By Task_Schedule_bySearch = By.xpath("//a[normalize-space()='Task & Schedule']");
    private final By Task_Schedule_txt = By.xpath("//strong[normalize-space()='Task & Schedule']");
    private final By Setting_svg = By.xpath("//span[@aria-label=\"setting\"]");
    private final By Language_option = By.xpath("//span[normalize-space()='Language']");
    private final By Language_option2 = By.xpath("//span[@class='ant-dropdown-menu-title-content']");
    private final By Arabic_option = By.xpath("//button[normalize-space()='Arabic']");
    private final By Home_Arabic = By.xpath("//span[@class='ant-breadcrumb-link']");
    private final By English_option = By.xpath("//button[normalize-space()='English']");
    private final By user_setting = By.xpath("//span[@class='ant-avatar ant-avatar-sm ant-avatar-circle ant-avatar-icon ant-dropdown-trigger css-1x5n6pw']//span[@aria-label='user']");
    private final By Logout_button = By.xpath("//ul[@role='menu']//span[contains(text(),'Logout')]");
    private final By logout_succesfully_message = By.xpath("//span[normalize-space()='Logout Successful']");
    private final By change_passwordbutton = By.xpath("//span[normalize-space()='Change Password']");
    private final By old_password_input = By.xpath("//input[@id='oldPassword']");
   private final  By oldpasswordempty_mesage = By.xpath("//div[@class='ant-form-item-explain-error']");
   private final By newpassword_input = By.xpath("//input[@id=\"newPassword\"]");
   private final By newpasswordempty_mesage = By.xpath("//div[@id=\"newPassword_help\"]/div[@class=\"ant-form-item-explain-error\"]");
   private final By confirmpassword_input = By.id("confirmPassword");
   private final By confirmpasswordempty_mesage =  By.xpath("//div[@class=\"ant-form-item-explain-error\"]");
   private final  By newpasswordlength_message = By.xpath("//div[normalize-space()='Password must be at least 8 characters long!']");
   private final By newpasswordfieldInvalidSyntax_mesage = By.xpath("//div[normalize-space()='Password must include at least one uppercase letter, one numeric value, and one special character!']");
   private final By confiempasswordfield_notsameasnewpassword_message = By.xpath("//div[contains(text(),'The new password that you entered do not match!')]");
   private final By InvalidoldPassword_message = By.xpath("//span[normalize-space()  = \"Invalid old password, pls enter correct existing password\"]");
   private final By submit_button = By.xpath("//button[@type='submit']");
   private final By Sameold_newPassword = By.xpath("//span[normalize-space() = \"The new password must be different from the current password.\"]");








   public HomePage(WebDriver driver){
        this.driver = driver;
    }

public HomePage Login (){
    openWiseUrl();
    enterInput(username, PropertiesReader.readKey("username"));
    enterInput(password,PropertiesReader.readKey("password"));
    clickElement(remeberme);
    clickElement(LoginButton);
    return this;
}
    // Page Actions
    public String hometext() {
        WaitHelpers.visibilityOfElement(Home_txt);
        return getText(Home_txt);
    }
    public String Go_Usermangemnt_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("usermanagement"));
        WaitHelpers.checkVisibility(driver,Usermangmt_bySearch,3);
        clickElement(Usermangmt_bySearch);
        WaitHelpers.checkVisibility(driver,Usermangmt_txt,10);
        String message = getText(Usermangmt_txt);
        return message;
    }
    public String Go_QueryStudio_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("queryStudio"));
        WaitHelpers.checkVisibility(driver,QueryStudio_bySearch,3);
        clickElement(QueryStudio_bySearch);
        WaitHelpers.checkVisibility(driver,Qstdio_txt,10);
        String message = getText(Qstdio_txt);
        return message;
    }
    public String Go_dataSource_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("DataSource"));
        WaitHelpers.checkVisibility(driver,dataSource_bySearch,3);
        clickElement(dataSource_bySearch);
        WaitHelpers.checkVisibility(driver,dataSource_txt,10);
        String message = getText(dataSource_txt);
        return message;
    }
    public String Go_Charts_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Charts"));
        WaitHelpers.checkVisibility(driver,Charts_bySearch,3);
        clickElement(Charts_bySearch);
        WaitHelpers.checkVisibility(driver,Charts_txt,10);
        String message = getText(Charts_txt);
        return message;
    }
    public String Go_Createdashboards_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Createdashboard"));
        WaitHelpers.checkVisibility(driver,CreateDashboards_bySearch,3);
        clickElement(CreateDashboards_bySearch);
        WaitHelpers.checkVisibility(driver,Createdashboards_txt,10);
        String message = getText(Createdashboards_txt);
        return message;
    }
    public String Go_Pivot_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Pivot"));
        WaitHelpers.checkVisibility(driver,Pivot_bySearch,3);
        clickElement(Pivot_bySearch);
        WaitHelpers.checkVisibility(driver,Pivot_txt,10);
        String message = getText(Pivot_txt);
        return message;
    }
    public String Go_Drilldown_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Drilldown"));
        WaitHelpers.checkVisibility(driver,Drilldown_bySearch,3);
        clickElement(Drilldown_bySearch);
        WaitHelpers.checkVisibility(driver,Drilldown_txt,10);
        String message = getText(Drilldown_txt);
        return message;
    }
    public String Go_Groupable_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Groupable"));
        WaitHelpers.checkVisibility(driver,Groupable_bySearch,3);
        clickElement(Groupable_bySearch);
        WaitHelpers.checkVisibility(driver,Groupabletxt,10);
        String message = getText(Groupabletxt);
        return message;
    }
    public String Go_reportStudio_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("ReportStudio"));
        WaitHelpers.checkVisibility(driver,ReportStudio_bySearch,3);
        clickElement(ReportStudio_bySearch);
        WaitHelpers.checkVisibility(driver,ReportStudio_txt,10);
        String message = getText(ReportStudio_txt);
        return message;
    }
    public String Go_BroadcastMessage_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Broadcastmessage_txt"));
        WaitHelpers.checkVisibility(driver,BroadcastMessage_bySearch,3);
        clickElement(BroadcastMessage_bySearch);
        WaitHelpers.checkVisibility(driver,BroadcastMessage_txt,10);
        String message = getText(BroadcastMessage_txt);
        return message;
    }
    public String Go_Reconciler_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Reconciler_txt"));
        WaitHelpers.checkVisibility(driver,Reconciler_bySearch,3);
        clickElement(Reconciler_bySearch);
        WaitHelpers.checkVisibility(driver,Reconciller_txt,10);
        String message = getText(Reconciller_txt);
        return message;
    }
    public String Go_Dashboards_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("Dashboard"));
        WaitHelpers.checkVisibility(driver,Dashboards_bySearch,3);
        clickElement(Dashboards_bySearch);
        WaitHelpers.checkVisibility(driver,Dashboards_txt,10);
        String message = getText(Dashboards_txt);
        return message;
    }
    public String Go_TaskScheduler_bySearch(){
        WaitHelpers.checkVisibility(driver,search_input,10);
        enterInput(search_input,PropertiesReader.readKey("TaskScheduler"));
        WaitHelpers.checkVisibility(driver,Task_Schedule_bySearch,3);
        clickElement(Task_Schedule_bySearch);
        WaitHelpers.checkVisibility(driver,Task_Schedule_txt,10);
        String message = getText(Task_Schedule_txt);
        return message;
    }
public String Change_to_Arabic(){
       WaitHelpers.checkVisibility(driver,Setting_svg,5);
       clickElement(Setting_svg);
       clickElement(Language_option);
       WaitHelpers.checkVisibility(driver,Arabic_option,5);
       clickElement(Arabic_option);
       WaitHelpers.checkVisibility(driver,Home_Arabic,5);
       String message = getText(Home_Arabic);
       return message;
}
public String Change_to_english(){
    WaitHelpers.checkVisibility(driver,Setting_svg,5);
    clickElement(Setting_svg);
    clickElement(Language_option);
    WaitHelpers.checkVisibility(driver,Arabic_option,5);
    clickElement(Arabic_option);
    WaitHelpers.checkVisibility(driver,Setting_svg,5);
    clickElement(Setting_svg);
    WaitHelpers.checkVisibility(driver,Language_option,10);
    clickElement(Language_option);
    WaitHelpers.checkVisibility(driver,English_option,10);
    clickElement(English_option);
    WaitHelpers.checkVisibility(driver,Home_txt,5);
    String message = getText(Home_txt);
    return message;
}

public  String  Logout_sucessfully(){
       WaitHelpers.checkVisibility(driver,user_setting,5);
       clickElement(user_setting);
       WaitHelpers.checkVisibility(driver,Logout_button,5);
       clickElement(Logout_button);
       WaitHelpers.checkVisibility(driver,logout_succesfully_message,5);
       String message = getText(logout_succesfully_message);
    return message;
}
public String In_changePassword_EmptyoldPasswordfield(){
    WaitHelpers.checkVisibility(driver,user_setting,5);
    clickElement(user_setting);
    WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
    clickElement(change_passwordbutton);
    WaitHelpers.checkVisibility(driver,old_password_input,5);
    enterInput(old_password_input,"ud");
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).build().perform();
    WaitHelpers.checkVisibility(driver,oldpasswordempty_mesage,5);
   String message =  getText(oldpasswordempty_mesage);
   return message;
}
    public String In_changePassword_EmptyNewPasswordfield(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,newpassword_input,5);
        enterInput(newpassword_input,"ud");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).build().perform();
        WaitHelpers.checkVisibility(driver,newpasswordempty_mesage,5);
        String message =  getText(newpasswordempty_mesage);
        return message;
    }
    public String In_changePassword_EmptyConfirmPasswordfield(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,confirmpassword_input,5);
        enterInput(confirmpassword_input,"ud");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).build().perform();
        WaitHelpers.checkVisibility(driver,confirmpasswordempty_mesage,5);
        String message =  getText(confirmpasswordempty_mesage);
        return message;
    }
    public String In_changePassword_LengthnewPasswordfield(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,newpassword_input,5);
        enterInput(newpassword_input,"ud");
        WaitHelpers.checkVisibility(driver,newpasswordlength_message,5);
        String message =  getText(newpasswordlength_message);
        return message;
    }
    public String In_changePassword_invalidnewpaswordfield(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,newpassword_input,5);
        enterInput(newpassword_input,"dwdsdewfewff");
        WaitHelpers.checkVisibility(driver,newpasswordfieldInvalidSyntax_mesage,5);
        String message =  getText(newpasswordfieldInvalidSyntax_mesage);
        return message;
    }
    public String In_changePassword_passwordnotsameasnewpassd(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,confirmpassword_input,5);
        enterInput(confirmpassword_input,"dwdsdewfewff");
        WaitHelpers.checkVisibility(driver,confiempasswordfield_notsameasnewpassword_message,5);
        String message =  getText(confiempasswordfield_notsameasnewpassword_message);
        return message;
    }
    public String In_changePassword_Invalidoldpassword(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,old_password_input,5);
        enterInput(old_password_input,"dwdsdewfewff");
        WaitHelpers.checkVisibility(driver,newpassword_input,5);
        enterInput(newpassword_input,"iefuG@334444");
        WaitHelpers.checkVisibility(driver,confirmpassword_input,5);
        enterInput(confirmpassword_input,"iefuG@334444");
        clickElement(submit_button);
        WaitHelpers.checkVisibility(driver,InvalidoldPassword_message,5);
        String message =  getText(InvalidoldPassword_message);
        return message;
    }
    public String In_changePassword_Sameold_new_Pasword(){
        WaitHelpers.checkVisibility(driver,user_setting,5);
        clickElement(user_setting);
        WaitHelpers.checkVisibility(driver,change_passwordbutton,5);
        clickElement(change_passwordbutton);
        WaitHelpers.checkVisibility(driver,old_password_input,5);
        enterInput(old_password_input,"Shanawaz@123");
        WaitHelpers.checkVisibility(driver,newpassword_input,5);
        enterInput(newpassword_input,"Shanawaz@123");
        WaitHelpers.checkVisibility(driver,confirmpassword_input,5);
        enterInput(confirmpassword_input,"Shanawaz@123");
        clickElement(submit_button);
        WaitHelpers.checkVisibility(driver,Sameold_newPassword,5);
        String message =  getText(Sameold_newPassword);
        return message;
    }






}
