$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/aravind/eclipse-workspace/cucumber/src/fb.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook login application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "To validate the login functionality with invalide user name and passsword",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.the_user_should_be_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill ibnvalid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.the_user_has_to_fill_ibnvalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.the_user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate the invalide login page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLogin.the_user_should_navigate_the_invalide_login_page()"
});
formatter.result({
  "status": "passed"
});
});