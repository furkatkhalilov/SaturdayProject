Feature: Entrance Examinations functionality

  Scenario Outline: Create exam

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    And Click on the element in the dialog content class
      | AddButton |
    When User sending the keys in the dialog content class
      | NameInput | <ExamName> |

    And Click in the formsClass class
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
      | documentType           |
      | <documentTypeOption>   |
    And Click on the element in the dialog content class
      | SaveButton |
    Then Success message should be displayed
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    When User delete the "<ExamName>"
    Then Success message should be displayed

    Examples:
      | ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
      | Math exam   | Option2              | Option4          | Option4            |
      | IT exam     | Option1              | Option1          | Option1            |
      | Oracle exam | Option2              | Option2          | Option2            |
      | Math exam   | Option1              | Option3          | Option3            |

#    AcademicPeriodOption click on 2 grade level click on 4 th option documentTypeOption4 th option

#    try catch... if no such element exeption, then click random on the other element?