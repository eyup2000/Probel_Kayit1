package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Hasta_Kayit_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class HastaKayit_StepDefinitions {



    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page hasta_kayit_page = new Hasta_Kayit_Page();


    @When("Click the Hasta button")
    public void click_the_hasta_button() {
        basePage.hastaButton.click();


    }
    @When("Enter Kurum, Kurum detay")
    public void enter_kurum_kurum_detay() {

        hasta_kayit_page.kurum.sendKeys(ConfigReader.getProperty("kurum"));
        hasta_kayit_page.kurumDetay.sendKeys(ConfigReader.getProperty("kurum_Detay"));

    }

    @Then("click the Kaydet-F10- button")
    public void click_the_kaydet_f10_button() {
        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("05411111458");
        hasta_kayit_page.kaydetButton.click();


    }
    @Then("verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message")
    public void verify_hasta_karti_düzenleme_t_c_kimlik_numarasi_bos_olamaz_probel_message() {

        Assert.assertTrue(hasta_kayit_page.HataMassage.isDisplayed());

    }

}
