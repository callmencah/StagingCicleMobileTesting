Feature: Archive Card and Archive List Board

  Scenario: TCM07_ArchiveBoard

    Given user card board list page
    When  user click tree dot card by coordinate
    And   user click archive this list card
    And   user success archive show notify
    And   user click tree dot list
    And   user click archive this list board
    Then  user success archive list show notify





