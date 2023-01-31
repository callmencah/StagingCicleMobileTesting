Feature: Create Project

  Scenario: TCM13_Project

    Given user home page
    When  user click plus button
    And   user click add new project
    And   user set new project name
    And   user set new project desc
    Then  user click create