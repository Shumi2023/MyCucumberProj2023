Feature: Validating Dell sign up

  Scenario Outline: 
    Given user navigate to dell homepage
    When user mouse hover to sign In option & click create Account button
    When user enters "<First name>"  "<Last name>" and valid "<email address>" and "<new password>"
    When user cheaked email notification
    When user clicked create account button
    Then a user account should be successfully created

    Examples: 
      | First name | Last name | email address    | new password |
      | Farzana    | Shumi     | any123@gmail.com | Clas@123     |
