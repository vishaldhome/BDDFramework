Feature: Validate main dashboard page

  Background: Login
    Given User is on login page
    And User enter username
    And  User enter password
    And User clicked on login button
    Then User should redirect to postlogin dashboard

    @smoke
  Scenario: Validate search fields are present on the main page
    Given User is on main page
    And User validate search fields on the page
    And Complete assert

      Scenario: