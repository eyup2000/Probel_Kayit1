@probel_hastaKayit
Feature: probel_hastaKayit

  Background:
    Given the user enters the URL for login
    When The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button
    And Enter Kurum, Kurum detay

    Scenario: TC001 - "Tc" Kimlik no" error message verification
      Then click the Kaydet-F10- button
      And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message

