@employeeService @runAllServices
Feature: Employee Service Endpoints

@krishna
  Scenario Outline: Free CRM Login Test Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser

    Examples: 
      | username | password |
      | naveenk  | test@123 |
     # | tom      | test456  |
