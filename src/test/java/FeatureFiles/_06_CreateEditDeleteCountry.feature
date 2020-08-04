Feature: Countries functionality

  Scenario: Create a country

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    When User create a country name as "AliCountry" code as "myCode"
    Then Success message should be displayed

    Scenario: Edit a country
      Given Navigate to basqar
      When Enter the username and password and click on login button
      Then User should login successfully
      And Navigate to countries page
      When User edit the "AliCountry"
      Then Success message should be displayed

