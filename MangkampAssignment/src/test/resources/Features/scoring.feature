#Feature: Welcome message
#I am a sports administrator and I want to be welcomed.

#  Scenario: Administrator
#  Given I am a sports administrator
#  And I want to be welcomed
#  When I click next
#  Then I see it welcoming me
    
Feature: Initiation. #hur många + vilken kamp
As a sportsadministrator I want to choose competition and number of contestants.
 
 		Scenario Outline: Setup succesfull
 		Given I am a administrator
 		And I select <competition>
 		And  I enter <number> of contestants
 		When I press next 
 		Then it saves whitch <competition> and how <number> contestants.
 		
		Examples:
		| competition | number |
		|	hepathlon   |   1 	 |
		|	hepathlon   |  40 	 |
		| decathlon   |   1 	 |
		| decathlon   |  40 	 |
		
#Feature: Information #namn + nationalitet
#Hejsan hoppsan

#			Scenario: Who
#		  Given I am event administrator
#			And I enter contestants name and nationality
#		  When I have done that 			#slumpar fram 40 
#			Then I verify name and nationality  #verifierar