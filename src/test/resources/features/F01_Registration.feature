@Regression_TCs
Feature:F01_Registration | users could register
  Scenario: Register with valid credentials
    When user opens register page
    And user fills registration form with "validFirstName", "validLastName", "register_2", "validPassword"
    And user clicks on register button
    Then system registers the user successfully

  Scenario: Register with already registered email
    When user opens register page
    And user fills registration form with "validFirstName", "validLastName", "loginMail", "loginPass"
    And user clicks on register button
    Then system shows an error message for already registered email