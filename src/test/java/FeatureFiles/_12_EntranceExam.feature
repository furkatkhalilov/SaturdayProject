Feature: Entrance Examinations functionality

  Scenario: Create exam

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |


