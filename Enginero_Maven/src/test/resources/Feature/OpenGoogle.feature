
Feature: Open google.com feature
@google
  Scenario: Open google website and search
  Given  user is entering google website
  When  user clicks the search box
  Then  the user should see the results of Kholi