Feature:Detaylı Hasta Arama


  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And The user clicks Detayli Hasta arama Button


  @e_test1
  Scenario Outline : Protokol no Inquiry


    And The user enters protokol no
    And the user clicks sorgulama button
    And the user verifies that the patient displays

    Examples: test_dataa
      | kullanicikodu | sifre | websifre |
      | RKAROL        | 2907  | 9557     |


