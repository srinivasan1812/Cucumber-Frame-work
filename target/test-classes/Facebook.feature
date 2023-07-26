Feature: To Validate the Facebook Application
Background:
Given To configure Facebook application of url

Scenario: To Validate the login valid username and valid password
When To launch facebook url
And To pass valid userName on email Textbox
And To pass valid password on password Textbox
And User have to click the login button
Then close the browser
Scenario Outline:
To check positive and negative login functionality
When To launch facebook application
And To pass positive and negative "<emaildatas>" on email field
And To pass positive and negative "<passworddatas>"on password field
And To click submit button
Then browser quit
Examples:

|emaildatas			 |passworddatas|
|sele@gmail.com  |123456			 |
|Greens@gmail.com|9879766			 |
|abcd@gmail.com	 |8768988			 |