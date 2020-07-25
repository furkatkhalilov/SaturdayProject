Feature: Deleting contact
  Scenario: Delete successfully

    Given Navigate to website
    And Enter the username and password click on login button
    When Create a contact
    Then Contact should be created
    When Delete the contact
    Then Contact should be deleted

