@Regression_TCs
Feature:F01_Registration | users could register
  Scenario: user can register using valid credentials
    When user open register page
    And user add valid first name
    And user add valid last name
    And user add valid email
    And user add password
    And user confirm the password
    And user clicks on register button
    Then user register to the system successfully


