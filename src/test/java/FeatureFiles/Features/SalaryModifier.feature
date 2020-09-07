Feature: Salary Modifier Functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  Scenario Outline: Create Salary Modifier
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | SalaryModifier      |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | Name | <Salary Type Name> |

    And Randomly select from "UserTypeDropDownButton" dropdown list
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Salary Type Name |
      | QA Tester        |

  Scenario Outline: Edit Salary Type
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | SalaryTypes         |
    And Delete or Edit Function
      | <Salary Type Name> | edit |
    And Fill out fields
      | Name | <Salary Type Name Edited> |
    Then Click on element inside dialog content
      | UserIconImg |
    And Randomly select from "UserTypeDropDownButton" dropdown list
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Salary Type Name | Salary Type Name Edited |
      | QA Tester        | QA Engineer             |

  Scenario Outline: Delete Salary Type
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | SalaryTypes         |
    And Delete or Edit Function
      | <Salary Type Name Edited> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Examples:
      | Salary Type Name Edited |
      | QA Engineer             |