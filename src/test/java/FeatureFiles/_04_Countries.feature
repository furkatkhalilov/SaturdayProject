Feature: Countries functionality

  Scenario: Create a country

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    When User create a country
    Then Success message should be displayed

