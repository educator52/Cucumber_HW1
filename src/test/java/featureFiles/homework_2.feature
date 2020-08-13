Feature: Homework_2 Buy a product test.

  Scenario: Successful buy a product from automationpractice.com
    Given I navigate to "http://automationpractice.com/index.php"
    Then I try to login in by email and password.
    When I click on the Dresses button.
    And I added an item to card.
    Then I checked Total products + Total shipping = Total.
    And I click Proceed to Checkout button
    Then I generate the shipping address if I didn't before than Click on the proceed to checkout button.
    And I click on the -I agree....- and the proceed to checkout button.
    Then I click on the Pay by bank wire.
    When I click on the I confirm my order button.
    Then I successfully Order my product.
