Feature: Google Search Functionality Title Verification
  User Story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see the relevant information


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should see Loop Academy - Google Search in the google title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "Loop Academy" in the google search box and clicks enter
    Then user should see "Loop Academy - Google Search" in the google title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "Sergio Vargas" in the google search box and clicks enter
    Then user should see "Sergio Vargas - Google Search" in the google title
#    the blue String means that it does not need a variable, is sending directly