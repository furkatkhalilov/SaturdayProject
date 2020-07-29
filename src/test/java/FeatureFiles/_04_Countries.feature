Feature: Countries functionality

  Scenario: Create a country

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    When User create a country
    Then Success message should be displayed

#    How to send a data from feature file to step definition

  Scenario: Create a country with different data

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    When User create a country name as "My country" code as "myCode"
    Then Success message should be displayed

  Scenario: Create a country with different data

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    When User create a country name as "Country name" code as "code1"
    Then Success message should be displayed

