Feature: Add Description , Attach File

  Scenario: TCM10_AddDescription

    Given user card edit page
    When  user click pencil description
    And   user add description
    And   user click publish
    And   user click button x notification description
    When  user click attach file
    And   user click Allow
    And   user select item
    Then  user click notification attachments






