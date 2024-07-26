Feature: Docuport Login Logout Feature
#lenguaje de gherkins
#  detras de esto esta escondido my codigo
#  2 horas 20 minutos, clase 11 nadir.
#  these are the scenarios.
  @smoke
  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should be able to see the home for client

    @smoke
  Scenario: Login as an employee
    Given user is on Docuport login page
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

#      si el codigo ya esta escrito una vez, el solo va y lo reutiliza