
Feature: Amazon Search
Scenario: Search a Product Apple macbook
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed

Scenario: Search a Product Apple mobile
Given I have a search field on Amazon Page
When I search for a product with name "Apple Iphone" and price 1200
Then Product with name "Apple Iphone" should be displayed