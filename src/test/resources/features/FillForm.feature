Feature: Fill selenium dev form

  Scenario: Fill and submit the form
    Given the page is loaded and the title is loaded
    And fill the current form
    Then the form is submitted
