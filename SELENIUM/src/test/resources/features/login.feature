@Login
Feature: Login

  Scenario Outline: Validasi login dengan kombinasi username dan password
    Given user membuka halaman login
    When user memasukkan "<username>" dan "<password>"
    And user menekkan tombol login
    Then user mendapatkan "<status>"

    Examples:
    | username | password | status |
    | standard_user | secret_sauce | login success |
    |  |  | login failed |
    | standard_user |  | login failed |
    | | password123 | login failed |
    | standard_user | wrongpass | login failed |
    | wrongusername | password123 | login failed |
    | wrongusername | wrongpass | login failed |
