@Signin
Feature: Login page should accessible with valid credentials

  Background:
    When user go to login page

  Scenario Outline: Login with valid username and password

    And User provides username "<username>" and password "<password>" and signs in
    Then User is navigated to "<own_account_page>"
    Examples:
      |username | password | own_account_page  |
      |bbell     |Bb192837? | Bluebell Garden |
      |Erica    |Erica1* | Erica Gee |


  Scenario: There should be an option to cancel login

    And user clicks on cancel button
    Then User is navigated to "homepage"