Feature: OrderProduct

Scenario: verify user is able to order the product

Given i opened demowebshop app for ordering product
When i click on login link
Then i should see login page
And i entered Email on the email text box "sophia123@gmail.com"
And i entered Password text box "sophia15"
And i clicked on Login button
Then i should see demo web shop welcome page


When i hovered on computers header
Then i should see list of product Headers
And  i clicked on Notebooks
Then i should see list of laptop products
And i clicked on add to cart button of Laptop

And i clicked on shopping cart link
Then i should see added product in shopping cart


And  i clicked on terms and conditions checkbox
And i clicked on checkout button
Then i should see checkout page

And i clicked on Billing address continue button
And i clicked on shipping address continue button
And i clicked on shipping method continue button
And i clicked on payment method continue button
And i clicked on payment information continue button
When  i clicked on confirm order button
Then i should see-Your order has been successfully processed!


