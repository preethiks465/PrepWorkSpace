$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("abc.feature");
formatter.feature({
  "line": 1,
  "name": "To Test CRM login Page",
  "description": "",
  "id": "to-test-crm-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verifying whether user is able to login to crm",
  "description": "",
  "id": "to-test-crm-login-page;verifying-whether-user-is-able-to-login-to-crm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user navigates to gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user gives Credentials to login",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 5
    },
    {
      "cells": [
        "preethik",
        "Liveall@456"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user lands on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_navigates_to_gmail_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepDefinition.user_gives_Credentials_to_login(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepDefinition.user_lands_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "To Test CRM login Page",
  "description": "",
  "id": "to-test-crm-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Verifying whether user is able to login to crm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user dummy",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user gives Credentials to login",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "preethik",
        "Liveall@456"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user lands on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_navigates_to_gmail_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "loginStepDefinition.user_gives_Credentials_to_login(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepDefinition.user_lands_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "abc",
  "description": "",
  "id": "to-test-crm-login-page;abc",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "ffff",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "aafsd",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "afdsfd",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});