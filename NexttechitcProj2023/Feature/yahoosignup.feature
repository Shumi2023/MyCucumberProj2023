Feature: validating Yahoo sign up

  Scenario Outline: Yahoo signup with valid data
    Given user visits to yahoo signup page
    When user types "<First_name>","<Last_name>" new "<New_yahoo_email>" and "<new password>"
    When user selects dropdown Month and type birth day "<Day>" and birth year "<Year>"
    Then user clicked continue button

    Examples: 
      | First_name | Last_name | New_yahoo_email | new password    | Day | Year |
      | Farzana    | Akter     | Frz2023Ak       | Sumi123@ak20072 |   5 | 1998 |
