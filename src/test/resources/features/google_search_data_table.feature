Feature: Passing multiple parameters to the same

  @sav
  Scenario: Searching multiple items
    Given user is on Google search page
    Then user searches the following item
#      the heading items, is new
      | items        |
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |
      | Andrew       |
      | Anna         |

#    CTRL +ALT+L
#  trhis is with list. it will run once scenario and each time it clears the search box.--> it does not open other browsers