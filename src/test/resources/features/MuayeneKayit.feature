Feature: The Home Page of Patient Register

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt

  @TC0008
  Scenario: The user can display the registered patient
    When insert the TC Identity Number in TC ID box and enter
    And assert the patient's TC ID
    And click on clean button
    And insert the Patient Number in Patient number box and enter
    Then assert the Patient number

  @TC0009
  Scenario Outline: When user insert the invalid TC identity number, user got the warning popup message
    When insert the "<invalid TC ID>" number to TC ID box and enter
    Then assert the "<warning message>"
    Examples:
      | invalid TC ID |           warning message          |
      | 12345678901   |Geçerli bir kimlik numarası giriniz.|
      | %&gsdfs       |Hasta No veya T.C. Kimlik No alanlarını doldurmadınız.|

  @TC0010
  Scenario Outline: When user insert the invalid Patient Number, user got the warning popup message
    When insert the "<invalid Patient Number>" number to patient number box and enter
    Then assert the "<warning popup message>"
    Examples:
      | invalid Patient Number |      warning popup message         |
      | 122333                 |122333 numaralı hasta kaydı bulunamadı! Yeni hasta kaydı oluşturmak ister misiniz?|
      | abcdefg                |Hasta No veya T.C. Kimlik No alanlarını doldurmadınız.|

  @TC0012
  Scenario: The user can display the registered patient with protocol number
    When click on search button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And assert the patient's TC ID
    And click on clean button
    And click on search button
    And insert the protocol number in the protocol box
    And click on run button
    And assert the patient's the protocol number
    And click on clean button
    Then assert the all page is clean

  @TC0013
  Scenario Outline: When user insert the invalid protocol number, user got the warning popup message
    When click on search button
    And insert the "<invalid protocol number>" in the protocol box and press enter
    Then assert the "<warning popup message>"
    Examples:
      | invalid protocol number |warning popup message         |
      | 122333                  |122333 numaralı hasta kaydı bulunamadı! Yeni hasta kaydı oluşturmak ister misiniz?|
      | abcdefg                 |Hasta No veya T.C. Kimlik No alanlarını doldurmadınız.|

  @TC0026
  Scenario: The user can clean the patient information page by click on “new" (Yeni) button
    When insert the TC Identity Number in TC ID box and enter
    And assert the patient's TC ID
    And click on new button
    Then assert the all page is clean

  @TC0027
  Scenario: The user can clean the patient information page by click on “delete" (Sil) button
    When insert the TC Identity Number in TC ID box and enter
    And assert the patient's TC ID
    And click on delete button
    Then assert the all page is clean

  @TC0029
  Scenario: The user can print the patient's information out by click on “print" (Yazdır) button
    When insert the TC Identity Number in TC ID box and enter
    And assert the patient's TC ID
    And click on print button
    Then assert the popup for print out

  @TC0033
  Scenario: The user can go to Detailed Patient Search page (Detaylı Hasta Arama)
    When click on Detailed Patient Search button
    Then assert the Detailed Patient Search page

  @TC0034
  Scenario: The user can go to Report Transactions page (Rapor İşlemleri)
    When click on Reports button
    And assert the warning message
    And close the warning message
    And click on search button
    And insert the protocol number in the protocol box
    And press enter
    And click on Reports button
    Then assert the Report Transactions pop up

  @TC0035
  Scenario: The user can go to Health Council page (Sağlık Kurulu)
    When click on Health Council button
    And assert the warning message
    And close the warning message
    And click on search button
    And insert the protocol number in the protocol box
    And click on Health Council button
    And assert the warning message
    And close the warning message
    And click on clean button
    And click on search button
    And insert the protocol number in the protocol box
    And press enter
    And click on Health Council button
    Then assert the Health Council page

  @TC0040
  Scenario: The user can go to Utility Operations page (Yardımcı İşlemler)
    When click on Utility Operations button
    Then assert the Utility Operations pop up

  @TC0041
  Scenario: The user can go to the RIS Acceptance Procedures (Ris Kabul İşlemleri) page
    When click on RIS button
    And assert the warning message
    And close the warning message
    And click on search button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And click on RIS button
    Then assert the RIS Acceptance Procedures page

  @TC0042
  Scenario: The user can go to the Lab. Pre-acceptance (Lab. Ön Kabul) page
    When click on Lab button
    And assert the warning message
    And close the warning message
    And click on search button
    And insert the protocol number in the protocol box
    And press enter
    And assert the patient's the protocol number
    And click on Lab button
    Then assert the Lab. Pre-acceptance page

  @TC0066
  Scenario: The user can go to the informations section (Kabul Bilgileri) section
    When click on acceptance informations button
    Then assert the acceptance informations section

  @TC0067
  Scenario: The user can go to the account (Hesap) section
    When click on account button
    Then assert the account section

  @TC0068
  Scenario: The user can go to the advance payment Avans) section
    When click on advance payment button
    Then assert the advance payment section

