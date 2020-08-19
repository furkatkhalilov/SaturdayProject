# What is end to end scenario?
#  Positive scenario is --> Creating the citizenship
#  Negative scenario is --> Creating the citizenship which is already exist. This scenario should fail.
#  End to end scenario is --> Test all the functionality in the specific module.
#  Functional testing --> Testing one functionality with multiple test cases. (positive and negative scenario)
#  Integration testing --> How is our two different modules are integrating to each other.
#                   Create Countries in basqar and according to your country create a city


Feature: Citizenship module

  Scenario: Create and delete the citizenship

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | Setup1Button     |
      | ParametersButton |
      | Citizenships     |
    When User create a citizenship with ApachePOI
    Then Success message should be displayed
    When User delete a citizenship with ApachePOI
    Then Success message should be displayed

  Scenario: Create and Delete the Fees
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | Setup1Button     |
      | ParametersButton |
      | Fees             |
    When User create a Fees with ApachePOI
    Then Success message should be displayed
    When User delete a Fees with ApachePOI
    Then Success message should be displayed



#    Create an excel sheet for the release notes in basqar
#       Add all the points in the excel
#     Navigate to release notes and make sure text in the website and String in the excel is equal


