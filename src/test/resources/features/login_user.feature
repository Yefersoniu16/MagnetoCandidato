Feature: The candidate logs into the magnet page using a registered account


Background:
  Given the user enters the page

  @LoginWithoutSymbol
  Scenario: Login without the mail symbol
    When enter the mail without the symbol
    Then incorrect mail message is displayed


    @LoginWithoutDomain
      Scenario: Login without email domain
      When  enter the mail without the domain
      Then incorrect mail message is displayed



  @LoginSuccessful
    Scenario: Login with the correct data
      When Enter correct email and password
      Then verify correct entry


