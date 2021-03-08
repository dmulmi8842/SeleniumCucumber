Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM homepage
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And I close broswer