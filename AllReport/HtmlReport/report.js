$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/srini/eclipse-workspace/CucumberFrameWork/src/test/resources/FeatureFile/Login.feature");
formatter.feature({
  "name": "To Validate the login functionality of Facebook Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "To Validate the login invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User have to launch Facebook application thru Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_launch_Facebook_application_thru_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter invalid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_the_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate the login invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User have to launch Facebook application thru Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_launch_Facebook_application_thru_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter invalid username and invalid password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User have to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to reach the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_the_invalid_credential_page()"
});
formatter.result({
  "status": "skipped"
});
});