Feature: Docuport Login Logout Feature

  Background:
    Given user is on Docuport login page

  Scenario: Login as a client
    #Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should be able to see the home for client

  @regression
  Scenario: Login as an employee
    #Given user is on Docuport login page
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

  Scenario: Login as an advisor
    When user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor

  Scenario: Login as an supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user clicks login button
    Then user should see the home page for supervisor


    #lenguaje de gherkins
#  detras de esto esta escondido my codigo
#  2 horas 20 minutos, clase 11 nadir.
#  these are the scenarios.

  @dataTableMap
  Scenario: Login as a client map practice
    When user enters credentials
    |username|b1g2_client@gmail.com|
    |password|Group2               |
    Then user should be able to see the home for client
# with maps we provided the map info