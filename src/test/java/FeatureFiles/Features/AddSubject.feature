Feature: Education Subject functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully


  Scenario: 3.5 Create subject categories
    And Click in the leftnav class
      | Education          |
      | Setup              |
      | Subject Categories |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | Business |
      | CodeInput | BS01     |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed

  Scenario: 3.5 Delete subject categories

    And Click in the leftnav class
      | Education          |
      | Setup              |
      | Subject Categories |

    When User delete "Business"
    Then Success message should be displayed

  Scenario: 3.6 Create subject categories and subject
    And Click in the leftnav class
      | Education          |
      | Setup              |
      | Subject Categories |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | Business |
      | CodeInput | BS01     |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed

#  Scenario: 3.6 Create Subject
    Given Click in the leftnav class
#      | Education |
#      | Setup     |
      | Subject |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | Business fundamentals |
      | CodeInput | BSF_001               |
    Then Click on element inside dialog content
      | Subject Category |
    And Select "Business" from dropdown list
    And Randomly select from "Style" dropdown list
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed

  Scenario: 3.6 Delete subject
    Given Click in the leftnav class
      | Education |
      | Setup     |
      | Subject   |
    When User delete "Business fundamentals"
    Then Success message should be displayed

  Scenario: 3.6 Delete subject categories
    And Click in the leftnav class
      | Education          |
      | Setup              |
      | Subject Categories |
    When User delete "Business"
    Then Success message should be displayed

  Scenario: 3.7 Deleting subject categories before deleting subject

    And Click in the leftnav class
      | Education          |
      | Setup              |
      | Subject Categories |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | Business |
      | CodeInput | BS01     |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed

    Given Click in the leftnav class
#      | Education |
#      | Setup     |
      | Subject |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | Business fundamentals |
      | CodeInput | BSF_001               |
    Then Click on element inside dialog content
      | Subject Category |
    And Select "Business" from dropdown list
    And Randomly select from "Style" dropdown list
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed

    Then Navigate back

#    And Click in the leftnav class
#      | Subject            |
#      | Subject Categories |
    When User delete "Business"
    Then Error message should be displayed


#  Scenario: 3.6 Create Subject
#
#    And Click in the leftnav class
#      | Education |
#      | Setup     |
#      | Subject   |
#
#    Then Click on element inside dialog content
#      | AddButton |
#    And Fill out fields
#      | NameInput | Business |
#      | CodeInput | BS01     |
#    Then Click on element inside dialog content
#      | SaveButton |
#    Then Success message should be displayed