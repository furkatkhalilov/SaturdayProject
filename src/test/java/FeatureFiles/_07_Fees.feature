Feature: Fees functionality

  Scenario: Create a Fees

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User create a country name as "AliFees" code as "myCode" integration code as "123" priority as "10"
    Then Success message should be displayed

  Scenario: Edit a Fees
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User edit the "AliFees" to "AliEditedFees"
    Then Success message should be displayed

  Scenario: Delete a Fees
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User delete the "AliEditedFees"
    Then Success message should be displayed


#    driver.quit
#    Scenario outline example
#    Data table

#   driver.quit() vs diver.close()
#     Quit is closing the all browser
#     Close is closing the current page


#     Naviagate to fees page
#     Create a fee as your name
#     Edit the fee
#     Create new fee
#     Edit the fee as line 40
#     Error message should be displayed
#     delete both of the fees.

  Scenario: Edit multiple fees
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User create a country name as "AliFees" code as "myCode" integration code as "123" priority as "10"
    Then Success message should be displayed
    When User edit the "AliFees" to "AliEditedFees"
    Then Success message should be displayed
    When User create a country name as "AliFeesSecondone" code as "myCode2" integration code as "1230" priority as "100"
    Then Success message should be displayed
    When User edit the "AliFeesSecondone" to "AliEditedFees"
    Then Error message should be displayed
    And Click on close button
    When User delete the "AliFeesSecondone"
    Then Success message should be displayed
    When User delete the "AliEditedFees"
    Then Success message should be displayed



