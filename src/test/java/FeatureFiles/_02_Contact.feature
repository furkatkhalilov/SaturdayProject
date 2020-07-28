Feature: Contact funtion

  Scenario: Create contact
    Given Navigate to some website
    And Click on contact button
    When Enter firstname lastname contact information
    When Click on save button
    Then Success message should be displayed
    And Edit contact
    When Click on save button
    Then Success message should be displayed


#    Gherking language texts like --> Given When And Then

#   Help us to understand the code

#  please show how we added steps to run the code I missed that part
