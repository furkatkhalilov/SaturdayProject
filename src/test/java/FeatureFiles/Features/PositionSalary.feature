Feature: Position Salary functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  Scenario Outline: Create Position Salary
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | PositionSalary      |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | Name | <Position Salary Name> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Position Salary Name |
      | QA Tester            |

  Scenario Outline: Create Position Salary
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | PositionSalary      |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | Name | <Position Salary Name> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Position Salary Name |
      | QA Tester            |