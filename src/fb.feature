@sanity
Feature: To validate the login functionality of facebook login application

Scenario: To validate the login functionality with invalide user name and passsword
Given The user should be in facebook login page
When The user has to fill ibnvalid username and password
And The user has to click login button
Then The user should navigate the invalide login page


