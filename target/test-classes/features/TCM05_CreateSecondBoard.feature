Feature: Create Second board list , create second new card , create second private card

  Scenario: TCM05_BoardSecondBoard

    Given user card board list page
    Then  user click plus button
    And   user set add new board list
    And   user click submit
    And   user swipe
    Then  user add new card second board
    And   user click cek list second board
    And   user click add new card second board
    And   user click private card second board
    And   user click cek list second board





