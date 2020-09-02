Feature: Countries functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  @E2E1
  Scenario Outline: Create and Delete country
    Given Click in the leftnav class
      | Setup1Button     |
      | ParametersButton |
      | CountriesButton  |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | <Country name> |
      | CodeInput | <Country code> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    And Delete or Edit Function
      | <Country name> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Examples:
      | Country name | Country code |
      | ABCountry    | 1120         |

  @E2E1
  Scenario Outline: Create City
    Given Click in the leftnav class
      | Setup1Button     |
      | ParametersButton |
      | CountriesButton  |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | <Country name> |
      | CodeInput | <Country code> |
    Then Click on element inside dialog content
      | SaveButton |
    Then Success message should be displayed
    When Click in the leftnav class
      | CityButton |
    And Create City "<City Name>"
    Then Success message should be displayed
    And Delete or Edit Function
      | <City Name> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    When Click in the leftnav class
      | CountriesButton |
    And Delete or Edit Function
      | <Country name> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Examples:
      | Country name | Country code | City Name |
      | ABCountry    | 1120         | New York  |

  @E2E1
  Scenario Outline: Delete Country Before Deleting City

    Given Click in the leftnav class
      | Setup1Button     |
      | ParametersButton |
      | CountriesButton  |
    Then Click on element inside dialog content
      | AddButton |
    And Fill out fields
      | NameInput | <Country name> |
      | CodeInput | <Country code> |
    Then Click on element inside dialog content
      | SaveButton |
    When Click in the leftnav class
      | CityButton |
    And Create City "<City Name>"
    Then Success message should be displayed
    When Click in the leftnav class
      | CountriesButton |
    And Delete or Edit Function
      | <Country name> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Error message should be displayed
    When Click in the leftnav class
      | CityButton |
    And Delete or Edit Function
      | <City Name> | delete |
    Then Click on element inside dialog content
      | yesButton |
    Then Success message should be displayed
    Given Click in the leftnav class
      | CountriesButton |
    And Delete or Edit Function
      | <Country name> | delete |
    Then Click on element inside dialog content
      | yesButton |
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
