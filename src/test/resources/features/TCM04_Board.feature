Feature: Create add board list , add new card , add private card

  Scenario: TCM04_Board

    Given user home page
    Then  user click team
    And   user click board
    And   user click plus button
    And   user set add new board list
    And   user click submit
    And   user success create board
    Then  user add new card
    And   user click cek list
    And   user click add new card
    And   user click private card
    And   user click cek list