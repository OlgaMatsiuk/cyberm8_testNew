import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {

    WebDriver wd;
    HelperUser user;



    public void init(){
        wd.navigate().to("https://testing.cloud.cyberm8.com/");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        user = new HelperUser(wd);

    }
    public void tearDown() {
        wd.quit();
    }

    public HelperUser getUser() {
        return user;
    }

}
