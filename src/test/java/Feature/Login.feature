Feature: Login Application Feature

Scenario Outline: User Login Scenario
  Given User is on Application Page
  When  Application Page Title is Free CRM
  Then  User clicks log in button
  Then  User enters "<username>" and "<password>"
  And   User clicks on Login button
  When  User navigate to user profile

Examples:
  | username | password |
  | m.vukasinovic1504@gmail.com | David041123 |
  | m.vukasinovic@gmail.com    | David041123 |
  | David@gmail.com            | Marijana    |

