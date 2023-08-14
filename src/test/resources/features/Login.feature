@login
Feature: test

  Scenario: login
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And The user clicks Detayli Hasta arama Button

    And The user enters protokol no
    And the user clicks sorgulama button
    And the user verifies that the patient displays


  Scenario: TC0054 - *"Patient Registration Query should be possible with "TC Kimlik No" "Patient Registration Query should be possible with "TC Kimlik No"
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And The user clicks Detayli Hasta arama Button
    And The user enters TC Kimlik No
    And the user clicks sorgulama button
    And Visibility is checked with the patient's TC Kimlik No


  Scenario:TC0055 - Inquiry should be possible with "Hasta No"

    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And The user clicks Detayli Hasta arama Button
    And The user enters Hasta No
    And the user clicks sorgulama button
    And the user clicks SecButton Hasta No
    And The patient number called and the patient number received must be verified

  Scenario: TC0056 - Patients should be listed with Yatış Tarihi
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click on the Detaylı Hasta Arama tab.
    And Detaylı Tarih Seçimi tab is clicked.
    And Last 3 Months tab is clicked.
    And Select tab is clicked.
    And Query tab is clicked.
    And Verify that patients registered in the Last 3 Months can be listed


  Scenario:TC0057 - *Patients should be listed with "Geliş Tarihi"

    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click on the Detaylı Hasta Arama tab.
    And Detaylı Tarih Seçimitab is clicked
    And Son 3 Aytab is clicked
    And Seçtab is clicked
    And Query tab is clicked.
    And Verify that patients registered in the Last 3 Months can be listed



    Scenario:TC0053 - Ability to select "Kullanıcı"
      Given The user logs in
      And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
      And Click on the Detaylı Hasta Arama tab.

      And Double click on the User tab
      And Enter user name
      And Enter ID
      And Click on the UserSec
      And Write the user name in the text section of the page and click enter
      And Select the User and click on the Seç tab
      And Click on the Query






