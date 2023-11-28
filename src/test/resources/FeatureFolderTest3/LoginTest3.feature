Feature: This feature is for log in functionality

@LoginTest3

Scenario: veriy user can successfully log in

Given Launch "<URL>"
When user click login link 
And enter username, password and click login button
Then verify user can successfully logged in