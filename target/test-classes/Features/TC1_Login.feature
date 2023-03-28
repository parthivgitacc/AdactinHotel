@Login
Feature: Verifying Adactin Hotel login details

  Scenario Outline: Verifying Adactin Hotel login valid
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login success message "Hello krishhh95!"

    Examples: 
      | userName  | password  |
      | Krishhh95 | 123456789 |

  Scenario Outline: Verifying Adactin Hotel login user Enter
    Given User is on the Adactin page
    When User perform login "<userName>","<password>" with Enter key
    Then User should verify after login success message "Hello krishhh95!"

    Examples: 
      | userName  | password  |
      | Krishhh95 | 123456789 |

  Scenario Outline: Verifying Adactin Hotel login invalid credential
    Given User is on the Adactin page
    When User perform login "<userName>","<password>"
    Then User should verify after login with invalid credential error message contains "Invalid Log In deatils"

    Examples: 
      | userName   | password |
      | Greens1234 | @R739    |
