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
#  trhis is with list. it will run once scenario and each time it clears the search box.--> it does not open other browser
#  con este data table puedo iterar si fuera lista de String, pero deberia rid off del header, si le tengo el header se convierte en una lista de map, y cada mapa key
#List<Map<String(items),String(loop academy)>>map1.
#List<Map<String(items),String(java)>>map1.
#List<Map<String(items),String(selenium)>>map1.
#List<Map<String(items),String(cucumber bdd)>>map1.
#List<Map<String(items),String(sql)>>map1.
#List<Map<String(items),String(Andrew)>>map1.
#List<Map<String(items),String(Anna)>>map1.