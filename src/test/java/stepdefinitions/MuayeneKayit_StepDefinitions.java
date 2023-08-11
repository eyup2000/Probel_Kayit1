package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_Page;
import pages.Muayene_Kayit_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class MuayeneKayit_StepDefinitions {

    //    Login_Page lp = new Login_Page(Driver.getDriver());
    Muayene_Kayit_Page mkp = new Muayene_Kayit_Page(Driver.getDriver());
    String tcID = ConfigReader.getProperty("TC");
    String patientNo = ConfigReader.getProperty("PatientNo");
    String protocolNo = ConfigReader.getProperty("ProtocolNo");


    @When("insert the TC Identity Number in TC ID box and enter")
    public void insertTheTCIdentityNumberInTCIDBoxAndEnter() {
        mkp.insertTCID(tcID);
    }

    @And("assert the patient's TC ID")
    public void assertThePatientSTCID() {
        mkp.goToPatientRegisterSection();
        mkp.assertTCID(tcID);
        mkp.closePatientRegisterSection();
    }

    @And("click on clean button")
    public void clickOnCleanButton() {
        mkp.clickClean();
    }

    @And("insert the Patient Number in Patient number box and enter")
    public void insertThePatientNumberInPatientNumberBoxAndEnter() {
        mkp.insertPatientNo(patientNo);
    }

    @Then("assert the Patient number")
    public void assertThePatientNumber() {
        mkp.goToPatientRegisterSection();
        mkp.assertPatientNo(patientNo);
        mkp.closePatientRegisterSection();
        mkp.clickClean();
    }
    @When("insert the {string} number to TC ID box and enter")
    public void insertTheNumberToTCIDBoxAndEnter(String arg0) {
        mkp.insertTCID(arg0);
    }

    @Then("assert the warning message")
    public void assertTheWarningMessage() {
        mkp.assertWarningPopUp("");
    }

    @Then("assert the {string}")
    public void assertThe(String warningMessage) {
        mkp.assertWarningPopUp(warningMessage);
    }

    @When("insert the {string} number to patient number box and enter")
    public void insertTheNumberToPatientNumberBoxAndEnter(String invalidPatientNumber) {
        mkp.insertPatientNo(invalidPatientNumber);
    }

    @When("click on search button")
    public void clickOnSearchButton() {
        mkp.clickSearch();
    }

    @And("insert the protocol number in the box and press enter")
    public void insertTheProtocolNumberInTheBoxAndPressEnter() {
        mkp.insertProtocolNumber(protocolNo);
        mkp.clickEnter();
    }

    @And("assert the patient information")
    public void assertThePatientInformation() {
        mkp.goToPatientRegisterSection();
        mkp.assertPatientNo(patientNo);
        mkp.closePatientRegisterSection();
        mkp.clickClean();
    }
    @And("assert the patient's the protocol number")
    public void assertThePatientSTheProtocolNumber() {
        mkp.assertProtocolNo(protocolNo);
    }
    @And("insert the protocol number in the protocol box")
    public void insertTheProtocolNumberInTheProtocolBox() {
        mkp.insertProtocolNumber(protocolNo);

    }

    @And("click on run button")
    public void clickOnRunButton() {
        mkp.clickRun();
    }

    @Then("assert the all page is clean")
    public void assertTheAllPageIsClean() {
        mkp.assertPageClean();
    }

    @And("press enter")
    public void pressEnter() {
        mkp.pressEnter();
    }

    @And("insert the {string} in the protocol box and press enter")
    public void insertTheInTheProtocolBoxAndPressEnter(String invalidProtocolNumber) {
        mkp.insertProtocolNumber(invalidProtocolNumber);

    }

    @And("click on new button")
    public void clickOnNewButton() {
        mkp.clickNewButton();
    }

    @And("click on delete button")
    public void clickOnDeleteButton() {
        mkp.clickDeleteButton();

    }

    @And("close patient information popup")
    public void closePatientRegisterPopup() {
        mkp.closePatientRegisterSection();
    }


    @And("click on print button")
    public void clickOnPrintButton() {
        mkp.clickPrint();
    }

    @Then("assert the popup for print out")
    public void assertThePopupForPrintOut() {
        mkp.assertPopUpPrintOut();
    }

    @When("click on Detailed Patient Search button")
    public void clickOnDetailedPatientSearchButton() {
        mkp.goToDetailedPatientSearchPage();
    }

    @Then("assert the Detailed Patient Search page")
    public void assertTheDetailedPatientSearchPage() {
        mkp.assertTheDetailedPatientSearchPage();
    }

    @When("click on Reports button")
    public void clickOnReportsButton() {
        mkp.clickOnReportsButton();
    }

    @And("close the warning message")
    public void closeTheWarningMessage() {
        mkp.closeWarningPopUp();
    }

    @Then("assert the Report Transactions pop up")
    public void assertTheReportTransactionsPopUp() {
        mkp.assertTheReportTransactionsPopUp();
    }

    @When("click on Health Council button")
    public void clickOnHealthCouncilButton() {
        mkp.clickOnHealthCouncilButton();
    }

    @Then("assert the Health Council page")
    public void assertTheHealthCouncilPage() {
        mkp.assertTheHealthCouncilPage();
    }

    @When("click on Utility Operations button")
    public void clickOnUtilityOperationsButton() {
        mkp.goToUtilityOperationsPage();
    }

    @Then("assert the Utility Operations pop up")
    public void assertTheUtilityOperationsPopUp() {
        mkp.assertUtilityOperationsPage();
    }

    @When("click on RIS button")
    public void clickOnRISButton() {
        mkp.clickOnRISButton();

    }

    @Then("assert the RIS Acceptance Procedures page")
    public void assertTheRISAcceptanceProceduresPage() {
        mkp.assertTheRISAcceptanceProceduresPage();
    }

    @When("click on Lab button")
    public void clickOnLabButton() {
        mkp.clickOnLabButton();
    }

    @Then("assert the Lab. Pre-acceptance page")
    public void assertTheLabPreAcceptancePage() {
        mkp.assertTheLabPreAcceptancePage();
    }

    @When("click on acceptance informations button")
    public void clickOnAcceptanceInformationsButton() {
        mkp.goToAcceptanceInformationsSection();
    }

    @Then("assert the acceptance informations section")
    public void assertTheAcceptanceInformationsSection() {
        mkp.asserAcceptanceInformationsSection();
    }

    @When("click on account button")
    public void clickOnAccountButton() {
        mkp.goToAccountSection();

    }

    @Then("assert the account section")
    public void assertTheAccountSection() {
        mkp.asserAccountSection();

    }

    @When("click on advance payment button")
    public void clickOnAdvancePaymentButton() {
        mkp.goToAdvancePaymentSection();
    }

    @Then("assert the advance payment section")
    public void assertTheAdvancePaymentSection() {
        mkp.assertAdvancePaymentSection();
    }
}
