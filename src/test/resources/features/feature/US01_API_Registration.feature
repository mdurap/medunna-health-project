@US01_API @medunna_team6 @Wiip
Feature: US01_API_feature

  @US01_TC08
  Scenario: US01_TC08_valid_Create_registrants_using_api_and_validate
    Given user provides valid body from Swagger
    Given user send post request to url "https://medunna.com/api/register"
    Then verify status code is 201
    And assert email, login, firstname, lastname, ssn with given data in body
