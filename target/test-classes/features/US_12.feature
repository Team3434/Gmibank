@us12
Feature: Manage Customer
  Background: login as an employee
    Given user clicks my operation on employee page
    Given user clicks Manage Customer on employee page

  Scenario: All customers should show up on the manage customers module populating the account information of the customer
    Given verify customers info populated

  Scenario: There should be a View option
    Given user clicks view option to see all customers all info
    Then verify the edit button is displayed

  Scenario: There should be an Edit button
    Given user clicks Edit option to see customers all info on customer page
    Then user can update or create customer info on Edit portal

  Scenario: User can delete a customer, but seeing a message if the user is sure about deletion
    Given user should clicks delete button
    Then user should see message if user sure about deletion


