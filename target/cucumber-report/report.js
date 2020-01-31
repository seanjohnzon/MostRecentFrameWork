$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/DummyScenarios/main.feature");
formatter.feature({
  "name": "user is on landing page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.scenario({
  "name": "user is on landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "page title is \"Selenium: Beginners Guide\"",
  "keyword": "Then "
});
formatter.match({
  "location": "First.pageTitleIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});