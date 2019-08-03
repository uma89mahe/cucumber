Feature: Sign up

@RegressionTest
Scenario: Successful sign up

Given I have chosen to sign up
When I sign up with valid details
Then I should navigate to Welcome page

