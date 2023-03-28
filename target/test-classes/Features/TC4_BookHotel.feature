@BookHotel
Feature: Verifying Adactin Book Hotel details

  Scenario Outline: Verifying Adactin Book Hotel by select all fields
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform select hotel and click continue
    Then User should verify after continue success message "Book A Hotel"
    When User perform book hotel "<firstName>" , "<lastName>" and "<billingAddress>"
      | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cVVNumber |
      | 8789876545678765 | VISA             | January     |       2022 |      9875 |
      | 7689875435678906 | American Express | February    |       2022 |      9376 |
      | 6689815535678906 | Master Card      | January     |       2022 |      1878 |
      | 8689815535678906 | Others           | May         |       2022 |      4555 |
    Then User should verify after book hotel sucess message "Booking Confirmation" and save the order id

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2023  | 12/02/2023   | 3 - Three     | 1 - One         | Parthi    | Eswar    | Vandavasi      |

  Scenario Outline: Verifying Adactin Book Hotel without select any fields
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform select hotel and click continue
    Then User should verify after continue success message "Book A Hotel"
    When User perform book hotel without select any fields
    Then User should verify after book hotel error message "Please Enter your First Name" , "Please Enter you Last Name" , "Please Enter your Address" , "Please Enter your 16 Digit Credit Card Number" , "Please Select your Credit Card Type" , "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | password  | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Krishhh95 | 123456789 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 11/02/2023  | 12/02/2023   | 3 - Three     | 1 - One         |
