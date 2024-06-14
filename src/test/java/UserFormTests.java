import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserFormTests extends TestBase{

    @BeforeMethod
    public void precondition(){

        if(!app.getUser().isElementPresent(By.xpath("//form[@class='ng-dirty ng-touched ng-valid']"))){
            System.out.println("The site did not open");
            app.tearDown();

        }

    }

    @Test
    public void userFormPositive(){

        app.getUser().fillLoginForm("admin", "REZ1ucp2drw8gdp@efj");
        app.getUser().clickLoginButton();

    }

}
