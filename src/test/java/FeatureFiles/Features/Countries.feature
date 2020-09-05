Feature: Countries functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

  @Country
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

  @Country
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

  @Country
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

