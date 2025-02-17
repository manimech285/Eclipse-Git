
Feature: Checking saucedemo login
@positive
Scenario: Entering valid credentials and check the login
Given Entering the saucedemo website
When the user entering "standard_user" and "secret_sauce"
Then user should redirect to home page


@negative
Scenario: Entering valid credentials and check the login
Given Entering the saucedemo website
When the user entering "standard_user" and "secret_sauce"
Then user should redirect to home page