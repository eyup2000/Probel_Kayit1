@probel
Feature: test_data

  Scenario Outline: test
    Given kullanici application sayfasinda
    And kullanici kullanıcı kodu "<kullanicikodu>" girer
    And kullanici sifree "<sifre>" girer
    And kullanıcı web sifree "<websifre>" girer
    Then kullanici login button click eder
    And Hasta işlemleri, ayaktan hasta işlemleri gir ve poliklinik muayne kayıt'a click et
    And sayfadaki "hasta" button verfy et sonra click et
    And kurumu ve kurum detay gir
    Examples: test_data_t
      | kullanicikodu | sifre | websifre |
      | EGULER        | 3040  | 4828     |