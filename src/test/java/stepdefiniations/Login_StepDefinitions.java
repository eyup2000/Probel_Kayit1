package stepdefiniations;


import com.github.dockerjava.api.model.Config;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Login_StepDefinitions {
    //BasePage basePage = new BasePage();
    Login_Page login_page = new Login_Page();

    @Given("enter url page-")
    public void enter_url_page() {

    }
    @Given("The user logs in {string},{string}, {string}-")
    public void the_user_logs_in(String userCode, String password, String webPassword) {

        login_page.kullaniciKodu.sendKeys(userCode);
        login_page.sifre.sendKeys(password);
        login_page.webSifre.sendKeys(webPassword + Keys.ENTER);
    }
}
