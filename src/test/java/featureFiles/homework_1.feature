Feature: Homework_1 Login Test

  Scenario: Successful change name in automationpractice.com
    Given I navigate to "http://automationpractice.com/index.php"
    Then I try to login in by email and password.
    When I click on the My personal information.
    Then I try to change password.
    And I successfuly changed the password.