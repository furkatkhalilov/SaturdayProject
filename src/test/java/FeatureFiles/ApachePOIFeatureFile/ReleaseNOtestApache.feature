
#    Create an excel sheet for the release notes in basqar
#       Add all the points in the excel
#     Navigate to release notes and make sure text in the website and String in the excel is equal


Feature: Release Notes text

  Scenario: Points in the release not should be as expected

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
    |ReleaseNotesButton|
    And Verify all the points as expected in the release notes page


