Feature: Login as multiple user

  Scenario: Login as Administator
    Given Open Login page
    When Login with username and password
    Then Verify the user logged in sucessfully
