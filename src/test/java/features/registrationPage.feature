Feature: Registration Page Functionality

  Scenario: Completing the registration form with valid entries and clicking submit redirects the user to the Dashboard Page
    Given the user is on the registration page
    When the user enters valid entries into all fields
    And the user clicks on the Registration button
    Then the user is directed to the Dashboard Page
    And a personalised greeting is displayed
    And 5 suggested job vacancies are displayed

  Scenario Outline: Completing the registration form with invalid entries and clicking submit fails to register the user and displays the appropriate error message
    Given the user is on the registration page
    When the user enters "<Email>" into the Email field
    And the user enters "<Password>" into the Password field
    And the user enters "<ConfirmPassword>" into the Confirm Password field
    And the user completes the rest of the registration form
    And the user clicks on the Registration button
    Then the user is shown the "<Error>" error message

    Examples:
      | Email           | Password | ConfirmPassword | Error                                          |
      | email           | Password | Password        | You must provide a valid email address         |
      | email@email.com | Passwor  | Passwor         | Your password must be longer than 8 characters |
      | email@email.com | Password | Passwor         | Your passwords did not match                   |