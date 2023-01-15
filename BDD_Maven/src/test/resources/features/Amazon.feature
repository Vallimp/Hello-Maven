#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@amazon
Feature: User has to order a book on Amazon
User has to be successful in this task

 @launch  
  Scenario: A
  
  Given Application needs to be launched
  When user gives the website link
  Then user searches for the book
  And user clicks on the book
  And Set the quantity
  When user sets the quantity to 2
  Then add book to the cart
  
  

    