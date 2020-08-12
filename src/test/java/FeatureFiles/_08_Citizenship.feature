#  Finish the citizenship
#  Scenario outline

Feature: Citizenship functionality

  @RegressionTest
  Scenario: Create a Citizenship

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Citizenship page
    When User create a Citizenship name as "AliCitizenship" short name as "AC"
    Then Success message should be displayed

  @RegressionTest
  Scenario: Edit a Citizenship

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Citizenship page
    When User edit the "AliCitizenship" to "AliEditedCitizenship"
    Then Success message should be displayed

  @RegressionTest
  Scenario: Delete a Citizenship

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Citizenship page
    When User delete the "AliEditedCitizenship"
    Then Success message should be displayed

#   Create one citizenship name as "asd " and create the citizenship again with "asd" verify error message is displayed

  Scenario: Negative scenario
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Citizenship page
    When User create a Citizenship name as "AliCitizenship" short name as "AC"
    Then Success message should be displayed
    When User create a Citizenship name as "AliCitizenship" short name as "AC"
    But Error message should be displayed
    And Click on close button
    When User delete the "AliCitizenship"
    Then Success message should be displayed

