package in.codecompass.Pages.PageObjectModel.Wise;

import in.codecompass.Base.CommonToAllPage;
import in.codecompass.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonToAllPage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By Home_txt = By.xpath("//span[@class='ant-breadcrumb-link']");


    // Page Actions
    public String hometext() {
        WaitHelpers.visibilityOfElement(Home_txt);
        return getText(Home_txt);
    }
}
