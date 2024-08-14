Feature: product data table practice

  @ListOfMap
  Scenario: verify each product price
# practice List<Map<String,String>>
    Given User is on the HomePage
    Then User should be able to see expected prices in the following products
#    if i have headers it means map
      | Category | Product           | expectedPrice |
      | Phones   | Samsung galaxy s6 | 360           |
      | Phones   | Nokia lumia 1520  | 820           |
      | Phones   | Nexus 6           | 650           |
      | Laptops  | Sony vaio i5      | 790           |
      | Laptops  | Sony vaio i7      | 790           |
      | Laptops  | MacBook air       | 700           |
      | Monitors | Apple monitor 24  | 400           |
      | Monitors | ASUS Full HD      | 230           |
#    this is call efficient test
#    cada mapa contiene toda la informacion per row
#  solo corre una vez, es decir i need

#  List Element 1 (Map):
#  {Category=Phones, Product=Samsung galaxy s6, expectedPrice=360}
#  List Element 2 (Map):
#  {Category=Phones, Product=Nokia lumia 1520, expectedPrice=820}
#  List Element 3 (Map):
#  {Category=Phones, Product=Nexus 6, expectedPrice=650}
#  List Element 4 (Map):
#  {Category=Laptops, Product=Sony vaio i5, expectedPrice=790}
#  List Element 5 (Map):
#  {Category=Laptops, Product=Sony vaio i7, expectedPrice=790}
#  List Element 6 (Map):
#  {Category=Laptops, Product=MacBook air, expectedPrice=700}
#  List Element 7 (Map):
#  {Category=Monitors, Product=Apple monitor 24, expectedPrice=400}
#  List Element 8 (Map):
#  {Category=Monitors, Product=ASUS Full HD, expectedPrice=230}

#  if ji have headings, i have to iterate with
  @ListOfList
     # practice List<List<String, Sting>>
  Scenario: verify each product price listOfList
    Given User is on the HomePage
    Then User should be able to see expected prices in following products with listOflist
#    i have to rid off the headers
      | Phones   | Samsung galaxy s6 | 360 |
      | Phones   | Nokia lumia 1520  | 820 |
      | Phones   | Nexus 6           | 650 |
      | Laptops  | Sony vaio i5      | 790 |
      | Laptops  | Sony vaio i7      | 790 |
      | Laptops  | MacBook air       | 700 |
      | Monitors | Apple monitor 24  | 400 |
      | Monitors | ASUS Full HD      | 230 |

#  List Element 1 (List<String>): [Phones, Samsung galaxy s6, 360]
#  List Element 2 (List<String>): [Phones, Nokia lumia 1520, 820]
#  List Element 3 (List<String>): [Phones, Nexus 6, 650]
#  List Element 4 (List<String>): [Laptops, Sony vaio i5, 790]
#  List Element 5 (List<String>): [Laptops, Sony vaio i7, 790]
#  List Element 6 (List<String>): [Laptops, MacBook air, 700]
#  List Element 7 (List<String>): [Monitors, Apple monitor 24, 400]
#  List Element 8 (List<String>): [Monitors, ASUS Full HD, 230]

    # practice Map<String, List<String>>
#  this exercise, just with map, the key is the first column, Group2 and Group3


  @mapList
  Scenario: verify students names on discord
    Then User should be able to see the following names in their groups
#este ejercicio se mira hacia la derecha, entonces en este mapa se tiene que group2 es la llave, y el valor es cada lista que contiene los valores de ese respectivo grupo.
      | Group2 | Nadir  | Feyruz | Gina  |
      | Group3 | Alex M | Alex S | James |

#    i can convert the first table as this exercise/

  @PracticingListOfMap
  Scenario: verify students names on discord like the first exercise
    Then User should be able to see the following names in their groups on Discord
#ejercicio List<Map<String,String>>

      | Group2 | Group3 |
      | Nadir  | Alex M |
      | Feyruz | Alex S |
      | Gina   | James  |

#another exercise



  @smalTaskMapofList
  Scenario: verify each product price
# practice Map of List
    Given User is on the HomePage
    Then User should be able to see expected prices in the following products with Map Of List
#    if i have headers it means map
      | Category      | Phones            | Phones           | Phones  | Laptops      | Laptops      | Laptops     | Monitors         | Monitors     |
      | Product       | Samsung galaxy s6 | Nokia lumia 1520 | Nexus 6 | Sony vaio i5 | Sony vaio i7 | MacBook air | Apple monitor 24 | ASUS Full HD |
      | expectedPrice | 360               | 820              | 650     | 790          | 790          | 700         | 400              | 230          |








