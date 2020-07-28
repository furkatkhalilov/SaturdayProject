Feature: Login to basqar

  Scenario: Login with valid username and password

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

