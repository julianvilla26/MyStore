#Author: julianvilla30@gmail.com

Feature: Create a user in the website MyStore
	As a user of the page, I need to create a user
	
Background:
	Given I am on the page
	
@CreateAccountOk	
Scenario: Create user account ok
When I create the account
	|title|firstName|lastName|day|month|year|company|address|city|state|postalCode|country|mobilePhone|addressReference|
	|Mr.|Juanita|Lopez|18|4|1992|Sofka|Calle65|Medellin|Alabama|00000|United States|3146834992|My address|
Then I verify that the account was create successful
	|Welcome to your account. Here you can manage all of your personal information and orders.|
	
@CreateAccountNoOk
Scenario: Create user account not ok
When I register the mail
Then I verify that the account was not create successful
	|An account using this email address has already been registered. Please enter a valid password or request a new one.|