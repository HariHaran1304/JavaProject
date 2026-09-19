Feature: verify login module

  Scenario Outline: verifying Greens OMR login with valid credentials
    Given user is on the Greens OMR page
    When user enters "<username>" and "<password>"
    And user clicks the login button
    Then user verify success message after login

    Examples:
      | username                 | password  |
      | hariharanamu13@gmail.com | Hari@1304 |

  