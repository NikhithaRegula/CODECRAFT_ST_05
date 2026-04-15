Feature: Register

Scenario: verify user is able to register 

Given i opened demowebshop app
When i click on register
Then i should see register page
And i clicked gender female radiobutton
And i entered firstname "lara"
And i entered lastname "williams"
And i entered email "larawilliams123@gmail.com"
And i entered password "123456"
And i entered confirmpassword "123456"
And i clicked on register button
Then i should see success message

