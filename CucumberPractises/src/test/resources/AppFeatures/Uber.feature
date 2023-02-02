@All
Feature: Uber Booking Feature
@Regression
Scenario: Booking Cab sedan
Given User wants to select a car type "sedan" from uber application
When user select car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab suv
Given User wants to select a car type "suv" from uber application
When user select car "suv" and pick up point "Hyderabad" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Sanity
Scenario: Booking Cab mini
Given User wants to select a car type "mini" from uber application
When user select car "sedan" and pick up point "Banglore" and drop location "Chennai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD