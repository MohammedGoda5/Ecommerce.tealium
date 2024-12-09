@Regression_TCs
Feature:F02_Login | users could use
  Scenario: happy scenario user could login with valid email and password
    When user opens login page
    And user adds valid Email
    And user adds valid password
    And user clicks on login button
    Then user login to the system successfully

  @Regression_TCs
  Scenario: negative scenario user could login with invalid email and password
    When user opens login page
    And user adds invalid Email
    And user adds invalid password
    And user clicks login button
    Then user can't login using invalid credentials

