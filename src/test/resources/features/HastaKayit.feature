@probel
Feature: test_data


  @test1
  Scenario Outline: TC0118 - "Tc" Kimlik no" error message verification
    Given enter url page-
    And The user logs in "<kullanicikodu>","<sifre>", "<websifre>"-
    And The user goes -Hasta İşlemleri-,-Ayaktan Hasta İşlemleri- and then click -Poliklinik Muayene Kayıt-
    And Click the -Hasta- button
    And Enter -kurum-, -kurum detay-
    And click the -Kaydet(F10)- button
    And verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message

    Examples: test_dataa
      | kullanicikodu | sifre | websifre |
      | EGULER        | 3040  | 4828     |

  @test2
  Scenario Outline: TC0117 - "Passport no" and "Passport id" verification on the registration page

    Given enter url page-
    And The user logs in "<kullanicikodu>","<sifre>", "<websifre>"-
    And The user goes -Hasta İşlemleri-,-Ayaktan Hasta İşlemleri- and then click -Poliklinik Muayene Kayıt-
    And Click the -Hasta- button
    And Enter -kurum-, -kurum detay-
    And select nationality -uyruk- -ABD /Amerika Birleşik D./-
    And Verify that -Pasaport ıd- and -pasaport no- are in the page

    Examples: test_dataa
      | kullanicikodu | sifre | websifre |
      | EGULER        | 3040  | 4828     |