@login
Feature: Authorized users should be able to login

  Scenario: Login with valid credentials
    When the user enters valid credentials
    Then the user should be able to login

  Scenario: Login with invalid credentials
    When the user enters " " " " as invalid credentials
    Then error message should be displayed