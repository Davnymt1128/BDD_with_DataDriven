Feature: Sign up for a travel account at PHPTravel

Scenario Outline: Account registration
Given initialize the Chrome browser to navigate to "<website>" site
When user clicks on Sign Up button after click on my account button on the landing page
Then user enters required information on "<firstName>" , "<lastName>" , "<phoneNumber>" , "<email>" , "<password>" and clicks SIGN UP 
Then verify user is registered successfully

Examples:
|	website					|		firstName	|	lastName	|	phoneNumber	|	email			|	password		|
|https://www.phptravels.net	|	YoYo			|	Yamaguchi	|	3145889899	|	YY@Yahoo.com	| Yy1234	|	