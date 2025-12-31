package in.codecompass.Driver;

import in.codecompass.Utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManagerTL {

    public static  ThreadLocal< WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver dr){
         driver.set(dr);
    };

    public static WebDriver getDriver (){
        return driver.get();
    };
    public static void unload(){
        driver.remove();
    }
    // When we want to start the browser
    public static void init() {
        String browser = PropertiesReader.readKey("browser").toLowerCase();
        switch (browser) {
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--guest");
                setDriver(new EdgeDriver(edgeOptions));
                break;
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                setDriver(new ChromeDriver(chromeOptions));
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                setDriver(new FirefoxDriver(firefoxOptions));
                break;
            default:
                System.out.println("Not browser Supported!!!");
        }
    }

    // When we want to close the browser
    public static void down() {
        WebDriver wb =  getDriver();
        if ( wb != null) {
            wb.quit();
            unload();
        }

    }


}
