Feature: Enter Information in the field
  Scenario: Name and age submission
    Given User is on How old are you? page
    When Enter all the details
      |Your name|DOB |
      |Jayanta  | 17/03/2003|
    Then User should see the age