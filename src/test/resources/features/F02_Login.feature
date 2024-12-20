@Regression_TCs
Feature:F02_Login | users could use
  Scenario: happy scenario user could login with valid email and password
    When user open login page
    And user fills login form with "loginMail" , "loginPass"
    And user clicks on login button
    Then user login to the system successfully

  @Regression_TCs
  Scenario: negative scenario user could login with invalid email and password
    When user open login page
    And user fills login form with "invalidMail" , "invalidPassword"
    And user clicks on login button
    Then user can't login using invalid credentials

