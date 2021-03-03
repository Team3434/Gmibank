@InvalidSignin
Feature: Login page should not be accessible with invalid credentials

  Background:
    Given user go to login page

 Scenario Outline: Login with invalid username and password

    When User provides username "<username>" and password "<password>" and signs in
    Then User gets error message
   Examples:
     | username | password |
     | Ericag   | Erica1*  |
     | Erica    | Erica1  |
     | Ericag   | Erica1  |

  Scenario: User with invalid credentials should be given an option to reset their password

    When User provides username "Erica"
    And User can click on "Did you forget your password?" button
    Then User navigates to "Reset your password" page
    And User provides  email "erica@gm.co"
    And User can click on "Reset password" button
  #  And User receives confirmation message


  Scenario: User should be given the option to navigate to registration page if they did not register yet

    When User provides username "Erica"
    And User can click on "Register a new account" button
   Then User navigates to "Registration" page
