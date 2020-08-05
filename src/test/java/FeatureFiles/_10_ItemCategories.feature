Feature: Item Categories

  Scenario Outline: Create and delete item categories

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to item categories page
    When User create a item categories name as "<inventoryItemName>" user type as "<UserTypeOption>"
    Then Success message should be displayed
    When User delete the "<inventoryItemName>"
    Then Success message should be displayed

    Examples:
      | inventoryItemName | UserTypeOption |
      | Laptop            | Tenant Admin   |
      | WhiteBoard        | Administrator  |
      | Projector         | Guest          |

