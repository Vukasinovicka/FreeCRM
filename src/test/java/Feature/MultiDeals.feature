Feature: Add New Multi Deal

  Scenario: Add New  Multi Deal
    Given User is on Application Page
    When  Application Page Title is Free CRM
    Then  User clicks log in button
    Then  User enters username and password
      | username | password |
      | m.vukasinovic1504@gmail.com | David041123 |
    And   User clicks on Login button
    When  User navigate to user profile
    Then Go to Deals
    Then Open New Deal form
    Then user enters deal form
      | Title | Amount | Probability | Commission | Description | Next Step |
      | New Deal | 1000 | 20 | 3 | This is new Deal | To be Discussed |
      | CX Deal | 1000 | 20 | 3 | This is new Deal | To Be Discussed |
      | Shoes Top | 1000 | 20 | 3 | This is new Deal | To Be Discussed |
      | Header Poster | 1000 | 20 | 3 | This is new Deal | To Be Discussed |
      | Amazon Bottom | 1000 | 20 | 3 | This is new Deal | To Be Discussed |
      | Flipkart | 1000 | 20 | 3 | This is new Deal | To Be Discussed |
      | ebayl | 1000 | 20 | 3 | This is new Deal | To Be Discussed |

    #Then Save the Deal
    Then Close the Browser