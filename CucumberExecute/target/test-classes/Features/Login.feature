Feature: Login feature
This feature deals with login functionality

Scenario: Login with correct username and password
Given user navigates to login page
And user enters the email "email"
When  user enters username and password
|username|password|
|admin|adminpassword|
And   user clicks on login button
Then  user should see the userform page

Scenario Outline: Login with correct username and password using scenario outline

Given user navigates to login page
When  I enter "<username>" and "<password>"
And   user clicks on login button
Then  user should see the userform page
Examples:
|username|password|
|admin|adminpassword|
|admin|admin|