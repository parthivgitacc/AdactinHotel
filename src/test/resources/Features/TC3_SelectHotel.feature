@SelectHotel
Feature: Verifying Adactin select Hotel Details

  Scenario Outline: Verifying Adactin select Hotel and continue
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform select hotel and click continue
    Then User should verify after continue success message "Book A Hotel"

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2023  | 12/02/2023   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin without select hotel and continue
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform click continue without selecting hotel
    Then User should verify after continue error message "Please Select a Hotel"

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2023  | 12/02/2023   | 3 - Three     | 1 - One         |
