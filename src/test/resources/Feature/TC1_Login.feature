@LoginApi
Feature: Login Module API Automation

  Scenario: Get User logToken from login endpoint
    Given User add header
    When User add basic authentication for login
    When User send "POST"request for login endpoint
    And User verify the status code is 200
    Then User verify the login response body firstName present as "DIVYA" and get the logtoken
