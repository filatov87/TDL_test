Feature: Authentication via chrome

  Scenario: Authenticate via chrome by providing valid username/password combination

    Given I open "https://postman-echo.com/basic-auth"

    When I see "username"
    Then I enter "username"
    When I see "password"
    Then I enter "password"
    Then I click "Sign in"
    Then I should see "authenticated:true"

