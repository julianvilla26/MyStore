#Author: julianvilla30@gmail.com

Feature: To buy a product in the website
	As a user of the page, I need to buy a product
	
Scenario: Buy a dress
	Given I am logged in on the website
	When I was buy a dress
	Then I verify that the buy is successful
	|Your order on My Store is complete.|