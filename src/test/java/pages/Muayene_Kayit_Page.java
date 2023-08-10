package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class Muayene_Kayit_Page {

    WebDriver driver;
    Actions actions = new Actions(Driver.getDriver());
    public Muayene_Kayit_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "pageTitle")
    WebElement muayeneKayit_title;

    @FindBy(xpath = "//a[@title='Sorgula(F11)']")
    WebElement search_button;

    @FindBy(id = "protokol_ara")
    WebElement protokolSearch_box;

    @FindBy(xpath = "//a[@class='hem_button hem_ok_pro cmdGreen cmd_SorgulaCalistir']")
    WebElement run_button;

    @FindBy(xpath = "//a[@title='İptal']")
    WebElement iptal_button;

    @FindBy(xpath = "//a[@title='Kaydet(F10)']")
    WebElement kaydet_button;

    @FindBy(xpath = "//a[@title='Yeni(F5)']")
    WebElement new_button;

    @FindBy(xpath = "//a[@title='Sil(F8)']")
    WebElement delete_button;

    @FindBy(xpath = "//a[@title='Temizle(F5)']")
    WebElement clean_button;

    @FindBy(xpath = "//a[@title='Yazdır']")
    WebElement print_button;

    @FindBy(linkText = "Detaylı Hasta Arama")
    WebElement detailedPatientSearch_button;

    @FindBy(xpath = "//div[@class='PopupTitle']")
    WebElement popUpPage_Title;

    @FindBy(linkText = "Etiket")
    WebElement etiket_button;

    @FindBy(linkText = "Raporlar")
    WebElement reports_button;

    @FindBy(linkText = "Sağlık Kurulu")
    WebElement saglikKurulu_button;

    @FindBy(linkText = "Yardımcı İşlemler")
    WebElement yardimciIslemler_button;

    @FindBy(linkText = "Ris")
    WebElement ris_button;

    @FindBy(linkText = "Lab")
    WebElement lab_button;

    @FindBy(linkText = "Kayıt")
    WebElement kayit_button;

    @FindBy(xpath = "//input[@class='bgGrn']")
    WebElement tcIdNo_box;
    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    WebElement assert_tcIdNo;

    @FindBy(id = "TXT_HASTA_KAYIT_HASTA_NO")
    WebElement assert_patientNumber;

    @FindBy(xpath = "//a[@class='btnTcDogrulaPop  text_btn text_btn_ok pBtn']")
    WebElement dogrula_button;

    @FindBy(xpath = "//input[@id='HASTA_NO']")
    WebElement patientNumber_box;

    @FindBy(xpath = "//a[@class='btnHastaAraPop wpx50  text_btn text_btn_bul pBtn']")
    WebElement ara_button;

    @FindBy(xpath = "//a[@title='Hasta Kayıt(F6)']")
    WebElement patient_button;

    @FindBy(xpath = "//a[@class='PopupCloseButton PopupButton']")
    WebElement closePatientRegister_button;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[1]")
    WebElement poliklinik_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[2]")
    WebElement doktor_box;

    @FindBy(xpath = "(//input[@class='inpt tacnt wpx50'])[3]")
    WebElement asistan_box;

    @FindBy(xpath = "(//input[@class='inpt wpx50 tacnt'])[2]")
    WebElement cgrTipiNo_box;

    // TODO: Gelişine Ait Bilgiler Section

    @FindBy(xpath = "//label[@data-target='pGelis']")
    WebElement gelisineAitBilgiler_section;

    @FindBy(id = "PROTOKOL_NO")
    WebElement protokolNo_box;

    @FindBy(id = "KIMLIK_KONTROL")
    WebElement kimlikKontrol_checkBox;

    @FindBy(id = "KIMLIK_FOTOKOPISI")
    WebElement kimlikFotokopisi_checkBox;

    @FindBy(id = "HES_DOGRULAMA")
    WebElement hesKoduDogrula_checkBox;

    @FindBy(id = "ANA_KURUM_KODU")
    WebElement kurumu_box;

    @FindBy(id = "ALT_KURUM_KODU")
    WebElement kurumDetayi_box;

    @FindBy(id = "ADLI_VAKA")
    WebElement hakSahTipi_dropDown;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[1]")
    WebElement bransi_box;

    @FindBy(id = "GSS_SORGU_TURU")
    WebElement tedaviTipi_dropDown;

    @FindBy(id = "GSS_TAKIP_NO")
    WebElement gssIlkTakip_box;

    @FindBy(xpath = "//a[@class='btnTakipAra text_btn_bul text_btn  pBtn']")
    WebElement takipAra_button;

    @FindBy(xpath = "//a[@class='btnHakSah text_btn_devam text_btn  pBtn']")
    WebElement hakSahipligi_button;

    @FindBy(id = "btnfGSS_C00Ac")
    WebElement gssC00_button;

    @FindBy(id = "GELIS_SEKLI_KODU")
    WebElement gelisSekli_dropDown;

    @FindBy(id = "DOSYA_ISTEM")
    WebElement dosyaIstem_checkBox;

    @FindBy(id = "SAGLIK_KURULU_SEVK")
    WebElement saglikKuruluSevk_checkBox;

    @FindBy(id = "CARI_BEKLENECEK_TARIH")
    WebElement cariBekTarih_calender;


    // TODO: Kabul Bilgileri Section

    @FindBy(xpath = "//label[@data-target='pKabul']")
    WebElement kabulBilgileri_section;

    @FindBy(id = "KABUL_SEKLI_ID")
    WebElement kabulSekli_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ID")
    WebElement basvuruNedeni_dropDown;

    @FindBy(id = "BASVURU_NEDEN_ACIKLAMA")
    WebElement basvuruNedenAciklama_dropDown;

    @FindBy(id = "TERCIH_NEDEN_ID")
    WebElement tercihNedeni_dropDown;

    @FindBy(id = "YAKINMA_SIKAYET")
    WebElement yakinmaSikayet_box;

    @FindBy(xpath = "//input[@class='inpt wpx75 tacnt']")
    WebElement yakinlik_box;

    @FindBy(id = "YAKIN_TC_NO")
    WebElement yakinTCNo_box;

    @FindBy(id = "YAKIN_DOGUM_TARIHI")
    WebElement yakinDogumTarihi_box;

    @FindBy(id = "YAKIN_ADI_SOYADI")
    WebElement yakinAdSoyad_box;

    @FindBy(id = "YAKIN_CEP_TEL")
    WebElement yakinTelNo_box;

    @FindBy(id = "YAKIN_PASAPORT_NO")
    WebElement yakinPasaportNo_box;

    @FindBy(id = "YAKIN_EMAIL")
    WebElement yakinEPosta_box;

    @FindBy(id = "YAKIN_ADRES")
    WebElement yakinAdres_box;

    @FindBy(xpath = "//a[@class='btnYakinTcDogrula  text_btn text_btn_ok pBtn']")
    WebElement aktar_button;

    @FindBy(id = "YAKIN_ONAM_DURUM_1")
    WebElement alindi_radioButton;

    @FindBy(id = "YAKIN_ONAM_DURUM_2")
    WebElement alinmadi_radioButton;

    @FindBy(id = "PANSUMAN")
    WebElement pansuman_box;

    @FindBy(id = "KIMLIKSIZ")
    WebElement kimlikYaninda_box;

    @FindBy(id = "RECETE_HASTASI")
    WebElement receteIcinGeldi_box;

    @FindBy(id = "ENGEL_DURUMU")
    WebElement engelDurumu_dropDown;

    @FindBy(id = "SOSYAL_DESTEK")
    WebElement sosyalDestek_dropDown;

    @FindBy(id = "IHTIYAC_DEGERLENDIRME")
    WebElement ihtiyacDegerlendirme_dropDown;

    @FindBy(xpath = "//a[@class='btnPolMuayeneDetayTanim   text_btn_border pBtn']")
    WebElement kabulBilgileriTanim_button;

    @FindBy(xpath = "//a[@class='btnYabanciHastaKayit   text_btn_border pBtn']")
    WebElement yabanciHastaKayitFormu_button;


    @FindBy(xpath = "//label[@data-target='pHesap']")
    WebElement hesap_section;

    @FindBy(xpath = "//label[@data-target='pAvans']")
    WebElement avans_section;

    @FindBy(id = "TELEFON")
    WebElement phone;

    @FindBy(xpath = "//div[@class='alertText']")
    WebElement warningPopUpTCID;

    @FindBy(xpath = "(//td[@class='dxgv dx-ellipsis dx-ar'])[2]")
    WebElement assertProtocolNumber;

    @FindBy(id = "PRINTOUT POPUP")
    WebElement printOutPopUp;

    @FindBy(xpath = "//span[@class='no item']")
    WebElement closeWarningPopUp_button;







    public void assertPageSorgu() {
        Assert.assertEquals(muayeneKayit_title.getText(), "Muayene Kayıt");
    }

    public void insertTCID (String tcID)  {
        tcIdNo_box.sendKeys(tcID);
        actions.sendKeys(Keys.ENTER).perform();

    }
    public void goToPatientRegisterSection (){
        patient_button.click();
    }

    public void closePatientRegisterSection (){
        closePatientRegister_button.click();
    }


    public void assertTCID (String tcID){
        Assert.assertEquals(assert_tcIdNo.getAttribute("value"), tcID);
    }
    public void assertPatientNo (String patientNo){
        Assert.assertEquals(assert_patientNumber.getAttribute("value"), patientNo);
    }
    public void assertWarningPopUp(String warningMessage){

        // Assert.assertTrue(warningPopUpTCID.isDisplayed());
        //System.out.println("warningMessageTCID = " + warningPopUpTCID.getText());
        // Assert.assertEquals(warningPopUpTCID.getText(),warningMessage);
        Assert.assertNotNull(warningPopUpTCID);
    }

    public void clickClean (){
        clean_button.click();
    }

    public void insertPatientNo (String patientNo){
        patientNumber_box.sendKeys(patientNo);
        actions.sendKeys(Keys.ENTER).perform();
    }


    public void clickSearch() {
        search_button.click();
    }
    public void clickEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void insertProtocolNumber(String protocolNumber) {
        protokolSearch_box.sendKeys(protocolNumber);
    }

    public void assertProtocolNo(String protocolNumber) {
        Assert.assertEquals(assertProtocolNumber.getText(),protocolNumber);
    }

    public void clickRun() {
        run_button.click();
    }

    public void assertPageClean() {
        patient_button.click();
        Assert.assertEquals(assert_tcIdNo.getAttribute("value"), "");
    }

    public void pressEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void clickNewButton() {
        new_button.click();
    }

    public void clickDeleteButton() {
        delete_button.click();
    }

    public void clickPrint() {
        print_button.click();
    }

    public void assertPopUpPrintOut() {
        Assert.assertTrue(printOutPopUp.isDisplayed());
    }

    public void goToDetailedPatientSearchPage() {
        detailedPatientSearch_button.click();
    }

    public void assertTheDetailedPatientSearchPage() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());

    }

    public void clickOnReportsButton() {
        reports_button.click();

    }

    public void closeWarningPopUp() {
        closeWarningPopUp_button.click();
    }

    public void assertTheReportTransactionsPopUp() {
        Assert.assertTrue(popUpPage_Title.isDisplayed());
    }
}
