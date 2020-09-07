Feature: Positions functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  @Positions
  Scenario Outline: Create Position
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | Position            |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | Name           | <Position Name> |
      | shortNameInput | <Short Name>    |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Position Name | Short Name |
      | QA Tester     | QA         |

  @Positions
  Scenario Outline: Edit Position
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | Position            |
    And Delete or Edit Function
      | <Position Name> | edit |
    And Fill out fields
      | NameInput | <Position Name Edited> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Position Name | Position Name Edited |
      | QA Tester     | QA Engineer          |

  @Positions
  Scenario Outline: Delete Position
    Given Click in the leftnav class
      | HumanResources      |
      | HumanResourcesSetup |
      | Position            |
    And Delete or Edit Function
      | <Position Name Edited> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Examples:
      | Position Name Edited |
      | QA Engineer          |