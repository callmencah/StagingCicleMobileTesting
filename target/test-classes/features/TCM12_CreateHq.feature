Feature: Create Headquarter

  Scenario: TCM12_CreateHq

    Given user home page
    And   user click logo home
    And   user click plus button
    And   user click add new hq
    And   user set new hq name
    And   user set new hq desc
    Then  user click create