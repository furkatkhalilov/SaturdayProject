Feature: Fees functionality

  Scenario: Create a Fees

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    And Click on the element in the dialog content class
      | AddButton |

    When User sending the keys in the dialog content class
      | NameInput       | AliFees |
      | CodeInput       | 123     |
      | IntegrationCode | 123     |
      | PriorityInput   | 123     |

    And Click on the element in the dialog content class
      | SaveButton |

    Then Success message should be displayed


  Scenario: Create a Country

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page
    And Click on the element in the dialog content class
      | AddButton |
    When User sending the keys in the dialog content class
      |NameInput |AliCountry|
      |CodeInput |123       |
    And Click on the element in the dialog content class
      | SaveButton |
    Then Success message should be displayed

    Scenario: Create a Nationalities

      Given Navigate to basqar
      When Enter the username and password and click on login button
      Then User should login successfully
      And Navigate to Nationalities page
      And Click on the element in the dialog content class
        | AddButton |
      When User sending the keys in the dialog content class
        | NameInput | AliCountryMine |
      And Click on the element in the dialog content class
        | SaveButton |
      Then Success message should be displayed


#  Data table vs Scenario outline

#     Data table is getting the Strings one by one from the table and running it once

#     Scenario outline is running the same code with multiple data.




#    Element name | value

#    Element name

