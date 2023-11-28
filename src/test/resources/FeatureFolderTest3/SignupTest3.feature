Feature: This feature is for signup functionality

@SignupTest3

Scenario: verify user can successfully sign up 

Given Launch "<URL>"
When user click signup link
And enter username, password and click signup button
Then verify user can successfully signup
