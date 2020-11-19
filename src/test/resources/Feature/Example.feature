Feature: Verifying Adactin hotel booking page
Scenario Outline: Verifying Adactin Logindetails With Invalid Credential
Given User Is On The Adaction  Page
When User should enter the"<String>" and "<String1>"
When User should click the login btn
Then User should verify the msg




Examples:

|String|String1|
|yed   |123    |
