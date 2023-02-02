Feature: Checking again
Scenario Outline: Not getting properly
When user3 enters <"UserName"> in username field
And user3 enters <"Password"> in password field
Then user3 we will check


Examples:
   |UserName|Password|
   |879|978|
   |111|999|
   |343|980|
   |654|921|
   