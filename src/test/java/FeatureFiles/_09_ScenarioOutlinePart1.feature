Feature: Citizenship with scenario outline

# Scenario vs Scenario outline

#   Scenario is running the code with specific data
#   Scenario outline is running the code with multiple data


  Scenario: Negative scenario

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario Outline: Negative scenario

    When User create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Success message should be displayed
    When User create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    But Error message should be displayed
    And Click on close button
    When User delete the "<CitizenshipName>"
    Then Success message should be displayed

    Examples:
      | CitizenshipName   | CitizenshipShortName |
      | AliCitizenship    | AC                   |
      | FurkatCitizenship | FC                   |
      | DoganCitizenship  | DC                   |


#    if we could skip login after 1st run, it could save time

