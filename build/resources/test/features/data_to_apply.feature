Feature: The candidate fills in the data to apply for a vacancy

  Scenario: Fill in the information to apply for a vacancy
    Given the user enters the page and performs login
    When the user fills in the fields to apply for a vacancy
    Then The user verifies that they can apply for vacancies
