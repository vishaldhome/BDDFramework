Feature: Validate Login

  @smoke
  Scenario: Validate Login Dashboard
    Given User is on login page
    And User enter username
    And  User enter password
    And User clicked on login button
    Then User should redirect to postlogin dashboard