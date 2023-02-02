Feature: Amazon Order Page
 In order to check my order details
 As a registered user
 I want to specify the features of order details page
Background: 
 Given a registered user exists
 Given user is on Amazon login page
 When user enters username
 And user enters password
 And user clicks on login button
 Then user navigates to order page
 Scenario: Check previous order Details
 When user clicks on previous orders link
 Then user checks the previous order details
 Scenario: Check Open order Details
 When user clicks on Open orders link
 Then user checks the open order details
 Scenario: Check Cancelled order Details
 When user clicks on cancelled order link
 Then user checks the cancelled order details
 