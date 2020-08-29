Feature: Countries functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully


  Scenario Outline: Create and Delete country
    When Navigate to countries page
    When User create a country "<Country name>" and code "<Country code>"
    Then Success message should be displayed
    When   Delete country "<Country name>"
    Then Success message should be displayed
    Examples:
      | Country name | Country code |
      | ABCountry    | 1120         |

  Scenario Outline: Create City
    When Navigate to countries page
    When User create a country "<Country name>" and code "<Country code>"
    Then Success message should be displayed
    When Navigate to City
    And Create City "<City Name>" within "<Country name>"
    Then Success message should be displayed
    When Delete City "<City Name>"
    Then Success message should be displayed
    When Navigate to countries page from City page
    And Delete country "<Country name>"
    Then Success message should be displayed
    Examples:
      | Country name | Country code | City Name |
      | ABCountry    | 1120         | New York  |

  Scenario Outline: Delete Country Before Deleting City

    When Navigate to countries page
    When User create a country "<Country name>" and code "<Country code>"
    Then Success message should be displayed
    When Navigate to City
    And Create City "<City Name>" within "<Country name>"
    Then Success message should be displayed
    When Navigate to countries page from City page
    And Delete country "<Country name>"
    Then Error message should be displayed
    When Delete City "<City Name>"
    Then Success message should be displayed
    When Navigate to countries page from City page
    And Delete country "<Country name>"
    Then Success message should be displayed
    Examples:
      | Country name | Country code | City Name |
      | ABCountry    | 1120         | New York  |


#
##    How to send a data from feature file to step definition
#
#  Scenario: Create a country with different data
#
#    When User create a country name as "My country" code as "myCode"
#    Then Success message should be displayed
#
#  Scenario: Create a country with different data
#
#    When User create a country name as "Country name" code as "code1"
#    Then Success message should be displayed
#
##StaleElementReferenceException
##   Element was in the page but it is not in the page any more or page is refreshed basically DOM is changes
#
## After login Clicking on the setup > parameters > countries -- selenium is finding the plus icon in the dashboard page
##                                -- Chrome is swithcing the countries page so selenium is throw StaleElementReferenceException
#
## we should wait until specific step is completed and then selenium should click on add button
