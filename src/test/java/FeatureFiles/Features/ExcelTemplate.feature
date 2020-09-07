Feature: Excel Template Functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  @ExcelTemplate
  Scenario Outline: Create Excel Template
    Given Click in the leftnav class
      | Reports       |
      | ReportsSetup  |
      | ExcelTemplate |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | <Template Name> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Template Name |
      | My Template   |

  @ExcelTemplate
  Scenario Outline: Edit Excel Template
    Given Click in the leftnav class
      | Reports       |
      | ReportsSetup  |
      | ExcelTemplate |
    And Delete or Edit Function
      | <Template Name> | edit |
    And Fill out fields
      | NameInput | <Template Name Edited> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    Examples:
      | Template Name | Template Name Edited |
      | My Template   | My Template Edited   |

  @ExcelTemplate
  Scenario Outline: Delete Excel Template
    Given Click in the leftnav class
      | Reports       |
      | ReportsSetup  |
      | ExcelTemplate |
    And Delete or Edit Function
      | <Template Name Edited> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Examples:
      | Template Name Edited |
      | My Template Edited   |