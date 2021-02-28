$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_12.feature");
formatter.feature({
  "name": "Manage Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us12"
    }
  ]
});
formatter.background({
  "name": "login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user clicks my operation on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Manage Customer on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "All customers should show up on the manage customers module populating the account information of the customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us12"
    }
  ]
});
formatter.step({
  "name": "verify customers info populated",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user clicks my operation on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Manage Customer on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "There should be a View option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us12"
    }
  ]
});
formatter.step({
  "name": "user clicks view option to see all customers all info",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the edit button is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user clicks my operation on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Manage Customer on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "There should be an Edit button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us12"
    }
  ]
});
formatter.step({
  "name": "user clicks Edit option to see customers all info on customer page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user can update or create customer info on Edit portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "login as an employee",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user clicks my operation on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Manage Customer on employee page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "User can delete a customer, but seeing a message if the user is sure about deletion",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us12"
    }
  ]
});
formatter.step({
  "name": "user should clicks delete button",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should see message if user sure about deletion",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});