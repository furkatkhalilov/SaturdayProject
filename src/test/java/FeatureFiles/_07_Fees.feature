Feature: Fees functionality

#    These tags are coming from the runner class and runner is finding which scenario to run with these tags

  Scenario: Create a Fees

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User create a country name as "AliFees" code as "myCode" integration code as "1234" priority as "09"
    Then Success message should be displayed

  Scenario: Edit a Fees
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User edit the "AliFees" to "AliEditedFees"
    Then Success message should be displayed


  Scenario: aaDelete a Fees
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


#    Change the Scenario: Edit multiple fees to Scenario outline

#     Scenario vs Scenario outline

#     With a scenario outline we are able to run our code with multiple data

  @E2E
  Scenario Outline:Edit multiple fees in Scenario outline

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Fees page
    When User create a country name as "<FeeName1>" code as "<FeeCode1>" integration code as "<FeeIntegration1>" priority as "<FeePriority1>"
    Then Success message should be displayed
    When User edit the "<FeeName1>" to "<FeeNameEditted1>"
    Then Success message should be displayed
    When User create a country name as "<FeeName2>" code as "<FeeCode2>" integration code as "<FeeIntegration2>" priority as "<FeePriority2>"
    Then Success message should be displayed
    When User edit the "<FeeName2>" to "<FeeNameEditted1>"
    Then Error message should be displayed
    And Click on close button
    When User delete the "<FeeNameEditted1>"
    Then Success message should be displayed
    When User delete the "<FeeName2>"
    Then Success message should be displayed
    Examples:
      | FeeName1 | FeeCode1 | FeeIntegration1 | FeePriority1 | FeeNameEditted1 | FeeName2   | FeeCode2 | FeeIntegration2 | FeePriority2 |
      | AliNameaa  | 123      | 123             | 123          | AliNameEditted  | FurkatName | 1234     | 1234            | 1234         |
      | doganFeeaaa | 123      | 123             | 123          | DoganEditted    | EkremFee   | 1234     | 1234            | 1234         |



