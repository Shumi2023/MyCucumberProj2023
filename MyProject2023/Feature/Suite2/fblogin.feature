Feature: Validating Facebook login

  Scenario: user login with valid email id and password
    Given user navigates to FB login page
    When user types username "stewarttom188@gmail.com" and password "Tom123@Class2023"
    When user click login button
    Then user should be able to logged in successfully

  Scenario Outline: user login with valid phone and password
    Given user navigates to FB login page
    When user types valid username "<phone_number>" and password "<password>"
    When user click login button
    Then user should be able to logged in successfully

    Examples: 
      | phone_number | password         |
      |   9457321943 | Tom123@Class2023 |
