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
     
 Feature: Register Contestant.
 As a sportsadministrator I want to register 1-40 contestants so I can have a proper competition.
 
 		Scenario Outline: Setup succesfull
 		Given I am a sports administrator
 		And I select <numthlon>
 		And  I enter <number> of contestants
 		When I press next 
 		Then it saves whitch <numthlon> and how <number> contestants.
 		
		Examples:
		| numthlon  | number |
		|	hepathlon |   1 	 |
		|	hepathlon |  40 	 |
		| decathlon |   1 	 |
		| decathlon |  40 	 |
		
		Scenario Outline: Setup less succesfull
 		Given I am a sports administrator
 		And I select <numthlon> 
 		And  I enter <number> of contestants
 		When I press next 
 		Then it gives "<error message>"
 		
		Examples:
		| numthlon  | number | error message		 |
		|	hepathlon |   0 	 | minst en          |
		|	hepathlon |  41 	 | max 40 din potatis|
		| decathlon |   0 	 | minst en          |
		| decathlon |  41 	 | max 40 din potatis|
		 		