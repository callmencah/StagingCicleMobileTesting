Feature: Login with Skip

  Scenario: TCM01_LoginWithSkip

    Given user is on boarding screen
    When  user click skip
    And   user click go to sign button
    And   user click go to sign button with google account
    And   user choose account google
    And   user click button x notification
    And   user success login with google account