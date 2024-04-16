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
@tag
Feature: Login feature
  I want to use this template for my feature file
Background:
Given user is given to homepage
When user logs in
Then user is good to go 

  @login
  Scenario Outline: Log in successfully
    Given user navigate to the login page
    When user enter the correct "<username>" and "<password>"
    Then user should be directed to Homepage and verify the "<result>"

    Examples: 
      | username  | password | result  |
      | bekenlmm | b@czzz | success |
      
	@searchhotel
	Scenario: Search the hotel
	 Given user navigate to search hotel page
	 When user fills all details to search the hotel
	 Then user should be navigated to hotel confirmation page