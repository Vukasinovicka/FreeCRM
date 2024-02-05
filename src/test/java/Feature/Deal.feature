Feature: Add New Deal

  Scenario: Add New Deal Scenario
    Given User is on Application Page
    When  Application Page Title is Free CRM
    Then  User clicks log in button
    Then  User enters username and password
          | m.vukasinovic1504@gmail.com | David041123 |
    And   User clicks on Login button
    When  User navigate to user profile
    Then Go to Deals
    Then Open New Deal form
    Then user enters deal form
         | New Deal | 1000 | 20 | 3 | This is new Deal | To be Discussed |
    #Then Save the Deal
    Then Close the Browser
