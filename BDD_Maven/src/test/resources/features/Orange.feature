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

@leaveScenario 
Feature: Testing Leave application features in Orange HRM
  User will be able to apply different types of leaves in HRM application

@persoanlLeave @TC_001 @sanity
  Scenario: Apply personal leave
  
  Given user is login to Orange HRM application
  When user navigates to Leave meanu in Orange HRM application
  And user clicks apply link in leave screen of Orange HRM application
  Then user should able to view Apply Leave screen in Orange HRM application
  
  When user selects personal leave in leave screen of Orange HRM application
  Then user is able to view leave balance in leave screen of Orange HRM application
  
  When user selects from and to dates in leave screen of Orange HRM application
  And user enters comments in leave screen of Orange HRM application
  And user clicks Apply button in leave screen of Orange HRM application
  Then user is able to view success message in leave screen of Orange HRM application
    