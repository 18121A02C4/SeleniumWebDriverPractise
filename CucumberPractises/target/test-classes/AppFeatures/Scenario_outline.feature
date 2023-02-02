Feature: Checking Example usage in scenario outline
Scenario Outline: Checking
When user2 enters <UserName> in username field
And user2 enters <Password> in password field
Then we will check


Examples:
|UserName|Password|
   |123|321|
   |980|98|
   
   # getting error for 98
   |456|654|