package stepDefinitions;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	//TEST 2021-04-30
		String input = "";
		double result;
	
		@Given("I am a sports administrator")
		public void i_am_a_sports_administrator() {
		    System.out.println("First");
		}
		
		@When("I register an {string}")
		public void i_register_an(String string) {
			System.out.println("Second");
			Scanner scan = new Scanner(System.in);

			System.out.print("How many participants? ");
			int numParticipants = scan.nextInt();
			Participants[] newParticipants = new Participants[numParticipants];

			for (int i = 0; i < numParticipants; i++) {
				System.out.print("Name the participants " + (i + 1) + ": ");
				String name = scan.next();
				Participants.Participants(name);
				System.out.println(newParticipants [i]);
				}
			
			//input = name1;
			//input av namn p� atlet
		}
		
		public boolean isTrack = true;
		
		@When("I also register their {string}")
		public void i_also_register_their(String string) {
		//sporten if-sats bra
			if (string.equals("track")){
				isTrack = true;
			}
			if (string.equals("field")){
				//something
				isTrack = false;
			}
		}

		@When("I register their {int}")
		public void i_register_their(Integer int1) {
			System.out.println(newParticipants [1]);
			//ekvation f�r B-P (7-kamp)!!
			if(isTrack = true) {
			double A = 25.4347;
			double B = 18;
			double C = 1.81;
			double x = B-int1;
			double i = Math.pow(x, C);
			double resultekv = i*A;
			int result = (int)resultekv;
			System.out.println(result);
			}
			
			// 7-kamp!!!
			if (isTrack = false) {
				double A = 1.84523;
				double B = 75;
				double C = 1.348;
				double x = int1 - B;
				double i = Math.pow(x, C);
				double resultekv = i*A;
				int result = (int)resultekv;
				System.out.println(result);
			}
			
		//	result = Math.pow(1.81, (25.4347(18-10)));
			//Skriver in po�ngen fr�n grenen
		}
		
		@Then("I want to see the total score")
		public void i_want_to_see_the_total_score() {
			System.out.println("First");
			
			//Int Po�ng = (A(B-P)^C)
			//Utr�kning sker fr�n sparade v�rden och vi f�r po�ngen sparade
		}
		//metoder
		
}