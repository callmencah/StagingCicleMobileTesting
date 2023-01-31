Feature: Create Team

  Scenario: TCM03_CreateTeam

    Given user success create company
    Then  user click plus button
    And   user click add new team
    And   user set new team name
    And   user set new team desc
    And   user click create

