Feature: Students functionality

  Scenario: Create delete student

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | StudentParent  |
      | StudentsButton |
    And Click on the element in the dialog content class
      | AddButton |
    And Click in the formsClass class
      | genderDropdown           |
      | Option1                  |
      | gradeLevel               |
      | Option1                  |
      | schoolDepartmentDropdown |
      | Option1                  |
      | sectionDropdown          |
      | Option1                  |
      | citizenshipDropdown      |
      | Option1                  |
      | documentType             |
      | Option1                  |


