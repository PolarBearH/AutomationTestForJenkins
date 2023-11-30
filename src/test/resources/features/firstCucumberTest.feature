Feature: Login Functionality

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be logged in successfully

  Scenario: Unsuccessful login
    Given the user is not on the login page
    When the user enters invalid credentials
    Then the user should not be logged in successfully
    And an error message should be displayed

    @Outline
  Scenario Outline: Various login attempts
    Given the user is on the login page
    When the user enters correct "<username>" username
    And correct "<password>" password
    And the user clicks the login button
    Then verify the user logs in successfully

    Examples:
      | username    | password   |
      | John        | pass123    |
      | AliceSmith  | secret456  |
      | TestUser1   | testpass   |

