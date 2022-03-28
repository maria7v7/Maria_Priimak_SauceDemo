Feature: SauceDemo

  @Login
  Scenario Outline: Login
  User should be able to log in with valid credentials
    Given User on the login page
    When User enters valid  "<username>" and "<password>"
    And User clicks on Sign In button
    Then url should contain inventory word
    Examples:
      |  username       | password     |
      | standard_user   | secret_sauce |

  @Sort
  Scenario: Sort
  User should be able to sort and assert products price to lowest first
    Given User is on product page
    Then User clicks on sort dropdown
    And User select price low to high
    Then Products price should be sorted low to high

  @AddItems
  Scenario: User should be able to add items to the cart
    Given User adds an item to the cart
    And User adds on one more item to the cart
    Then Shopping Cart should show items count 2

  @DeleteItems
  Scenario: User delete an item from the cart
    Given User is on the Shopping Cart page
    When User delete an item from the cart
    And User adds one more item to the cart


  @CheckOut
  Scenario: User should be able to checkout successfully
    Given User is on the Shopping Cart page
    When User clicks checkout button
    And User enters his first name and last name and zipcode
    And User clicks on continue button
    And User clicks on the finish button
    Then User should be able to see confirmation message