package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.DetaylıHastaArama_Page;
import utilities.Driver;

import javax.swing.*;

public class DetaylıHastaArama_StepDefinitions {

    BasePage basePage = new BasePage();
    DetaylıHastaArama_Page detaylıHastaAramaPage = new DetaylıHastaArama_Page();
    Actions actions=new Actions(Driver.getDriver());




    @And("The user clicks Detayli Hasta arama Button")
    public void theUserClicksDetayliHastaAramaButton() {
        detaylıHastaAramaPage.DetayliHastaAra.click();

    }

    @And("The user enters protokol no")
    public void theUserEntersProtokolNo() {
        detaylıHastaAramaPage.ProtocolNo.sendKeys("15388099");
    }

    @And("the user clicks sorgulama button")
    public void theUserClicksSorgulamaButton() {
        detaylıHastaAramaPage.SorgulaButton.click();
    }

    @And("the user verifies that the patient displays")
    public void theUserVerifiesThatThePatientDisplays() {
        Assert.assertTrue(detaylıHastaAramaPage.verifyProtocolNo.getText().contains("15388099"));
    }
//********************************************************************************************************

    @And("The user enters TC Kimlik No")
    public void theUserEntersTCKimlikNo() {
        detaylıHastaAramaPage.TCKimlikNo.sendKeys("19834211032");
    }

    @And("Visibility is checked with the patient's TC Kimlik No")
    public void visibilityIsCheckedWithThePatientSTCKimlikNo() {


    }


    @And("The user enters Hasta No")
    public void theUserEntersHastaNo() {
        detaylıHastaAramaPage.HASTANo.sendKeys("2013299573");
    }




    @And("The user Clicks Sec Button")
    public void theUserClicksSecButton() {
        detaylıHastaAramaPage.HastaNoSeç.click();

    }



    @And("the user clicks SecButton Hasta No")
    public void theUserClicksSecButtonHastaNo() {
        detaylıHastaAramaPage.HastaNoSeç.click();
    }



    @And("The patient number called and the patient number received must be verified")
    public void thePatientNumberCalledAndThePatientNumberReceivedMustBeVerified() {
        Assert.assertEquals(2013299573,2013299573);
    }

//*****************************************************************


    @And("Click on the Detaylı Hasta Arama tab.")
    public void clickOnTheDetaylıHastaAramaTab() {
        detaylıHastaAramaPage.DetayliHastaAra.click();

    }

    @And("Detaylı Tarih Seçimi tab is clicked.")
    public void detaylıTarihSeçimiTabIsClicked() {
        detaylıHastaAramaPage.DetayliTarihSecimi.click();
    }

    @And("Last {int} Months tab is clicked.")
    public void lastMonthsTabIsClicked(int arg0) {
        detaylıHastaAramaPage.SonUcAyTarih.click();

    }

    @And("Select tab is clicked.")
    public void selectTabIsClicked() {
        detaylıHastaAramaPage.popupCloseButton.click();
    }

    @And("Query tab is clicked.")
    public void queryTabIsClicked() {
        detaylıHastaAramaPage.SorgulaButton.click();
    }

    @And("Verify that patients registered in the Last {int} Months can be listed")
    public void verifyThatPatientsRegisteredInTheLastMonthsCanBeListed(int arg0) {

    }

    @And("Detaylı Tarih Seçimitab is clicked")
    public void detaylıTarihSeçimitabIsClicked() {
        detaylıHastaAramaPage.CikisTarihi.click();
    }

    @And("Son {int} Aytab is clicked")
    public void sonAytabIsClicked(int arg0) {
        detaylıHastaAramaPage.gelecekUcAy.click();
    }

    @And("Seçtab is clicked")
    public void seçtabIsClicked() {
        detaylıHastaAramaPage.popupCloseButton.click();

        detaylıHastaAramaPage.SorgulaButton.click();
    }


    @And("Double click on the User tab")
    public void doubleClickOnTheUserTab() {
        actions.doubleClick(detaylıHastaAramaPage.Kullanici).perform();



    }

    @And("Write the user name in the text section of the page and click enter")
    public void writeTheUserNameInTheTextSectionOfThePageAndClickEnter() {


    }

    @And("Select the User and click on the Seç tab")
    public void selectTheUserAndClickOnTheSeçTab() {
    }

    @And("Click on the Query")
    public void clickOnTheQuery() {
    }

    @And("Enter user name")
    public void enterUserName() {

detaylıHastaAramaPage.KullanıcıID.sendKeys("%RKArol%");
    }

    @And("Click on the UserSec")
    public void clickOnTheUserSec() {

        detaylıHastaAramaPage.KullanıcıSec.click();
        detaylıHastaAramaPage.SorgulaButton.click();
    }

    @And("Enter ID")
    public void enterID() {
        actions.click().perform();
    }
    //***************************************************************

}









