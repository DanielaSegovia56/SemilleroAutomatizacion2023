Feature: Login demo
  Scenario: Login successfully in Demo
    Given user open the browser
    When user insert credentials "<User>" "<Password>" and click on sign in
    Then user can view the word Dashboard on the screen