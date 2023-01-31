Feature: Login with Swipe

  Scenario: TCM15_LoginWithSwipe

    Given user is on boarding screen
    When  user click Yes
    And   user swipe page
    And   user click go to sign button
    And   user click go to sign button with google account
    And   user choose account google
    And   user click button x notification
    Then  user success login with google account

