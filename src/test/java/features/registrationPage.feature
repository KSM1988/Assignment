Feature: Registration Page Functionality

  Scenario: Completing the registration form with valid entries and clicking submit redirects the user to the Dashboard Page
    Given the user is on the registration page
    When the user enters valid entries into all fields
    And the user clicks on the Registration button
    Then the user is directed to the Dashboard Page
    And a personalised greeting is displayed
    And 5 suggested job vacancies are displayed

  Scenario: Completing the registration form with invalid entries and clicking submit fails to register the user and displays the appropriate error message
    Given the user is on the registration page
    When the user enters ‘(entry)’ into the ‘(field)’ field
    And the user clicks on the Registration button
    Then the user is shown the ‘(error)’ error message

