$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Add New Deal",
  "description": "",
  "id": "add-new-deal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3777342300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login Free CRM with Valid Credentials",
  "description": "",
  "id": "add-new-deal;login-free-crm-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Application Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Application Page Title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "m.vukasinovic1504@gmail.com",
        "David041123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User navigate to user profile",
  "keyword": "When "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Page()"
});
formatter.result({
  "duration": 6527060600,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.application_Page_Title_is_Free_CRM()"
});
formatter.result({
  "duration": 20520401,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_log_in_button()"
});
formatter.result({
  "duration": 4986770299,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 447699199,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 92451200,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_navigate_to_user_profile()"
});
formatter.result({
  "duration": 12872499,
  "status": "passed"
});
formatter.after({
  "duration": 728588901,
  "status": "passed"
});
formatter.before({
  "duration": 1785203300,
  "status": "passed"
});
formatter.before({
  "duration": 152701,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Free CRM with InValid Credentials",
  "description": "",
  "id": "add-new-deal;login-free-crm-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on Application Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Application Page Title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19
    },
    {
      "cells": [
        "m.vukasinovic1504@gmail.com",
        "David0423"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Application Page Title is Free CRM",
  "keyword": "When "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Page()"
});
formatter.result({
  "duration": 6236747700,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.application_Page_Title_is_Free_CRM()"
});
formatter.result({
  "duration": 19797800,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_log_in_button()"
});
formatter.result({
  "duration": 4891694800,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 335870200,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 120173100,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.application_Page_Title_is_Free_CRM()"
});
formatter.result({
  "duration": 12386100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[#1 Free CRM Power Up your Entire Business Free Forever]\u003e but was:\u003c[Cogmento CRM]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat StepDefinitions.MultiDealsSteps.application_Page_Title_is_Free_CRM(MultiDealsSteps.java:58)\r\n\tat ✽.When Application Page Title is Free CRM(src/test/java/Feature/Hooks.feature:22)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 159900,
  "status": "passed"
});
formatter.after({
  "duration": 716051400,
  "status": "passed"
});
formatter.before({
  "duration": 1736056199,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Add New  Multi Deal",
  "description": "",
  "id": "add-new-deal;add-new--multi-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on Application Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Application Page Title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User clicks log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 29
    },
    {
      "cells": [
        "m.vukasinovic1504@gmail.com",
        "David041123"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User navigate to user profile",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Go to Deals",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Open New Deal form",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user enters deal form",
  "rows": [
    {
      "cells": [
        "Title",
        "Amount",
        "Probability",
        "Commission",
        "Description",
        "Next Step"
      ],
      "line": 36
    },
    {
      "cells": [
        "New Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To be Discussed"
      ],
      "line": 37
    },
    {
      "cells": [
        "CX Deal",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be Discussed"
      ],
      "line": 38
    },
    {
      "cells": [
        "Shoes Top",
        "1000",
        "20",
        "3",
        "This is new Deal",
        "To Be Discussed"
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Save the Deal",
  "keyword": "Then "
});
formatter.match({
  "location": "MultiDealsSteps.user_is_on_Application_Page()"
});
formatter.result({
  "duration": 6395451101,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.application_Page_Title_is_Free_CRM()"
});
formatter.result({
  "duration": 22039900,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_log_in_button()"
});
formatter.result({
  "duration": 4952924600,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 457966000,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 129221600,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_navigate_to_user_profile()"
});
formatter.result({
  "duration": 22052699,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.go_to_Deals()"
});
formatter.result({
  "duration": 1973678699,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.open_New_Deal_form()"
});
formatter.result({
  "duration": 242030801,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.user_enters_deal_form(DataTable)"
});
formatter.result({
  "duration": 15520452000,
  "status": "passed"
});
formatter.match({
  "location": "MultiDealsSteps.save_the_Deal()"
});
formatter.result({
  "duration": 284343500,
  "status": "passed"
});
formatter.after({
  "duration": 803257300,
  "status": "passed"
});
});