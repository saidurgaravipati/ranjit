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
Feature: salesforce module using multi-class

@tag1
Scenario: Login to the application 
Given Login to salesforce
And enter into Home Page 
When enter Username and Password 
Then logout the application

@tag2
	Scenario: Salesforce opportunity
	Given Login to salesforce
And enter into Home Page 
When enter Username and Password 
Then create new opportunity
Then logout the application

	
@tag3
Scenario: Salesforce chatter
Given Login to salesforce
And enter into Home Page 
When enter Username and Password 
Then create new Chatter
Then logout the application
	
@tag4
Scenario: Salesforce cases
Given Login to salesforce
And enter into Home Page 
When enter Username and Password 
Then create new case post
Then logout the application
	
@tag5
	Scenario: Salesforce App Launcher
Given Login to salesforce
And enter into Home Page 
When enter Username and Password 
Then create events from app launcher
Then logout the application
