Feature: Set Due Date, add Label

  Scenario: TCM09_SetDueDate

    Given user card edit page
    When  user click set due date
    And   user click pencil calender
    And   user set date
    And   user click ok calender
    And   user click ok time
    When  user click add label
    And   user set label name
    And   user click label colour
    And   user click submit label
    And   user click label
    Then  user click empty



