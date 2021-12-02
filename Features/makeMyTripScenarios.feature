Feature: MakeMyTrip Scenarios

  @Preethi
  Scenario: 
    Given I am on makemytrip page
    When I perform one way search
      | From | Delhi       |
      | To   | Mumbai      |
      | Date | December 20 |
    Then search results should display available flights
