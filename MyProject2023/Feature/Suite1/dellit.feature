Feature: Validating Dell IT Infrastructure tab 

@smoke
  Scenario: Validating Dell IT Insfrastructure tab
    Given User is already in the dell homepage
    When user mouse hover to the IT Insfrastructure tab
    When user mouse hover to the product menu
    When user click the Networking option
    Then user should redirect to the Networking homepage