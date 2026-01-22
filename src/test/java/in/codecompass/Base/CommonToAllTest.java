package in.codecompass.Base;

import in.codecompass.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
    @BeforeMethod
    public void setUp() {
        DriverManager.init();
    }


//    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }
}
