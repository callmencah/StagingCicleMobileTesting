Feature: Edit name list board

  Scenario: TCM08_EditBoard

    Given user card board list page
    When  user click board list
    And   user edit name board list
    When  user click checklist edit
    And   user click card
    And   user click symbol pencil
    And   user edit name card
    And   user click symbol checklist card
    Then  user click notification edit success