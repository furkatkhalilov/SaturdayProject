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
      | academicPeriod |
      | <WhichOption>  |
      | gradeLevel     |
      | <WhichOption>  |
      | documentType   |
      | <WhichOption>  |
    And Click on the element in the dialog content class
      | SaveButton |
    Then Success message should be displayed
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    When User delete the "AliExam"
    Then Success message should be displayed

    Examples:
      | ExamName    | WhichOption |
      | IT exam     | Option1     |
      | Oracle exam | Option2     |
