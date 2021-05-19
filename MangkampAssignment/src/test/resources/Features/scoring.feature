Feature: Scoring
I want to use this template for my feature file

  Scenario Outline: User story
    Given I am a sports administrator
    When I register an <athlete> 
    And I also register their <sport>
    And I register their <result>
    Then I want to see the total score

    Examples: 
     |athlete| sport | result |
     | "" | "track" | 10 | # Lars, 10 sekunder
     | "" | "field" | 5 | # Lasse (Åberg), 5 meter
     
 Feature: Initiation. #hur många + vilken kamp
 As a sportsadministrator I want to choose competition and number of contestants.
 
 		Scenario Outline: Setup succesfull
 		Given I am a sports administrator
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
		
		Scenario Outline: Setup less succesfull
 		Given I am a sports administrator
 		And I select <competition> 
 		And  I enter <number> of contestants
 		When I press next 
 		Then it gives "<error message>"
 		
		Examples:
		| competition | number | error message		 |
		|	hepathlon   |   0 	 | minst en          |
		|	hepathlon   |  41 	 | max 40 din potatis|
		| decathlon   |   0 	 | minst en          |
		| decathlon   |  41 	 | max 40 din potatis|
		
Feature: Register Contestant. #namn/var osv
As a sportsadministrator I want to register contestant information so I can have a proper competition.
	
		Scenario Outline: Succesfull registration
		Given I am a hurdidurr
		And osv
#Gör scenario på samma sätt. 
 
Feature: Overview. #deltagarlista	
AS a sportadministrator I want to see all contestants information to get an overview over the competition.
#Gör scenario på samma sätt.