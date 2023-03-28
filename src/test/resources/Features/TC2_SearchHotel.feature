@SearchHotel
Feature: Verifying Adactin Search Hotel details

  Scenario Outline: Verifying Adactin Serach Hotel by select all fileds
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2023  | 12/02/2023   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin Serach Hotel by select with only mandatory fields
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel by selecting mandatory fields only "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName  | password  | location | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Krishhh95 | 123456789 | London   | 1 - One       | 10/02/2023  | 11/02/2023   | 1 - One       |

  Scenario Outline: Verifying Adactin search hotel by date checking
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel date error message  "Check-In Date shall be before than Check-Out Date" , "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2025  | 12/02/2023   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin Serach Hotel without Enter any fileds
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User should click search button without Enter any field
    Then User should verify error message after search hotel in location field "Please Select a Location"

    Examples: 
      | userName  | password  |
      | Krishhh95 | 123456789 |
