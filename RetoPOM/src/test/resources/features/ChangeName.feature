Feature: Change employee name

  Background:
    Given user open the browser
    When user insert credentials "<User>" "<Password>" and click on sign in

    Scenario: Change employee name of an order
      When User do click on open orders button and select any of the orders
      And user select an employee
      Then user can view the alert of saving successfully
