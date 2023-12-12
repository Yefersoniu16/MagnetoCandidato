Feature: The user registers bronze, silver and gold on the magnet page }

  Background:
    Given the user enters the registration page

  @BronzeRecord
  Scenario: Make Bronze Record
    When the user registers bronze
    Then user verifies record bronze

  @SilverRecord
  Scenario: Make silver Record
    When the user registers silver
    Then user verifies record silver


   @GoldRecord
  Scenario: Make gold Record
    When the user registers gold
    Then user verifies record gold




