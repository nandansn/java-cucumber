Feature: crud api test
  Scenario: as a user i need to create account
    Given api request prepared
    When send create account request
    Then account should be created