Feature: Admin Login
Background:
 Given I am at OrangeHRM Login page

  @test
    Scenario: login with valid Username and password
        Given I am at OrangeHRM Login page
        And I enter valid username
        And I enter valid password
        When I click on Login button
       Then I should be able to successfully login

  @test12

    Scenario: login with invalid Username and valid password
        And I enter invalid username
        And I enter valid password
        When I click on Login button
        Then I should not be able to successfully login

  @test
  Scenario: login with invalid Username and invalid password
        And I enter invalid username
        And I enter invalid password
        When I click on Login button
        Then I should not be able to successfully login