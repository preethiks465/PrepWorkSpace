Feature: To Test CRM login Page
Scenario: Verifying whether user is able to login to crm
Given user navigates to gmail login page
When user gives Credentials to login
|Username|Password|
|preethik|Liveall@456|
Then user lands on home page
