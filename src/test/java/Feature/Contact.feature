Feature: Add New Contact

 Scenario Outline: Add New Contact Scenario
   Given User is on Application Page
   When  Application Page Title is Free CRM
   Then  User clicks log in button
   Then  User enters "<username>" and "<password>"
   And   User clicks on Login button
   When  User navigate to user profile
   Then Go to Contacts
   Then Open Contact form
   Then user enters "<firstname>" and "<lastname>" and "<mobile>" and "<positions>"
   Then Save the Contacts
   Then Close the Browser

 Examples:
   | username | password | firstname | lastname | mobile | positions |
   | m.vukasinovic1504@gmail.com | David041123 | Ana | Vukasinovic | 06656565565 | QA |
   | m.vukasinovic1504@gmail.com | David041123 | Jelena | Petrovic | 06234453453 | Engineer |