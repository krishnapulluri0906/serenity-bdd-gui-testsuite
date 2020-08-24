@testTagsToRunInParallel
Feature: Parallel execution Free CRM application functional test cases

@loginParallel
  Scenario Outline: Free CRM Login Test Scenario functional
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser

    Examples: 
      | username | password |
      | gedam.sonali@gmail.com  | Sonali@123 |
      | pulluri.kittu1@gmail.com  | Cts@2017 |
