Feature: the candidate performs a search and applies to a vacancy

  Background:
    Given the user enters the page and performs login


    Scenario: the user performs a search by entering a category
      When enter category and select vacancy
      Then Verify application



