Feature: User Registration
Scenario: user registration with different data
Given User is on registration page
When user enters following user details
 |Shashank|peta|psr@gmail.com|999|Tirupathi|
 |Tom|Hooland|tom@yahho.com|777|LosAngels|
 |lucy|star|luci@gmail.com|111|Sanfransisco|
Then user registration should be successful
Scenario: user registration with different data with columns
Given User is on registration page
When user enters following user details with columns
|firstname|lastname|email|phoneno|city|
 |Shashank|peta|psr@gmail.com|999|Tirupathi|
 |Tom|Hooland|tom@yahho.com|777|LosAngels|
 |lucy|star|luci@gmail.com|111|Sanfransisco|
Then user registration should be successful