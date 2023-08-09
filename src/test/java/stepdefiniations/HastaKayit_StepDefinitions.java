package stepdefiniations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utilities.Driver;

public class HastaKayit_StepDefinitions {



    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("The user goes -Hasta İşlemleri-,-Ayaktan Hasta İşlemleri- and then click -Poliklinik Muayene Kayıt-")
    public void the_user_goes_hasta_işlemleri_ayaktan_hasta_işlemleri_and_then_click_poliklinik_muayene_kayıt() {

        actions.moveToElement(basePage.hastaIslemleri).
                moveToElement(basePage.ayaktanHastaIslemleri).
                perform();

        basePage.poliklinikMuayneKayit.click();


    }
    @Given("Click the -Hasta- button")
    public void click_the_hasta_button() {
        basePage.hastaButton.click();

    }
    @Given("Enter -kurum-, -kurum detay-")
    public void enter_kurum_kurum_detay() {
        basePage.kurum.sendKeys("27");
        basePage.kurumDetay.sendKeys("0");
    }


    @Given("click the -Kaydet\\(F10)- button")
    public void click_the_kaydet_f10_button() {
        basePage.kaydetButton.click();


    }
    @Given("verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message")
    public void verify_hasta_karti_düzenleme_t_c_kimlik_numarasi_bos_olamaz_probel_message() {

    }

    //  -----------------------------------------------------------------

    @Given("select nationality -uyruk- -ABD \\/Amerika Birleşik D.\\/-")
    public void select_nationality_uyruk_abd_amerika_birleşik_d() {

    }

    @Given("Verify that -Pasaport ıd- and -pasaport no- are in the page")
    public void verify_that_pasaport_ıd_and_pasaport_no_are_in_the_page() {

    }

}
