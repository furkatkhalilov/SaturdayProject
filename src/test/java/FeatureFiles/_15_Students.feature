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
    And User sending the keys in the FormClass class
      | FirstNameInput | techno |
      | LastNameInput  | study  |

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

    And User sending the keys in the FormClass class
      | documentNumber | 123456789 |

    And Click in the formsClass class
      | secondButtonInExtraInfo    |
      | addButtonForRepresantitive |
      | RepresentativeDropdown     |
      | Option1                    |

    And User sending the keys in the FormClass class
      | popUpFirstName   | technos    |
      | popUpLastName    | studys     |
      | popUpPhoneNumber | 8625874545 |

    And Click in the formsClass class
      | popUpAddButton |