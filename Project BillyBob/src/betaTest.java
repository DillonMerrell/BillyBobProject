import java.util.Random;
import java.util.Scanner;

public class betaTest
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random ran = new Random(); //Random number generator for calcuating percentages
		//Game Variables
		int year;
		String[] encountersPast = { "businessMan", "cashier", "housewife" };
		
		//Player variables
		boolean gender; //true = Male. false = female.
		String profession; 
		int lives = 3;
		final int SPMAX = 100;
		int spSpeech = 50;
		int spIntelligence = 50;
		
		//Dev Variables
		String genderChoice;
		boolean running = true;
		
		MENU:
			while(running)
			{
				System.out.println("----------------------------------------");
				System.out.println("-Welcome to Project BillyBob beta 0.0.1-");
				System.out.println("----------------------------------------");
				promptEnterKey();
				break;
			}
		
		PLAYERSETUP:
		System.out.print("Are you a Male or a Female? ");
		genderChoice = input.nextLine();
		
		if(genderChoice == "Male" || genderChoice == "male")
		{
			gender = true;
		}
		else if(genderChoice == "Female" || genderChoice == "female")
		{
			gender = false;
		}
		
		System.out.println("You are a " + genderChoice);
		
		PROFESSION:
		while(running)
		{
			loadScreen();
			System.out.println("Time: Present Day \nPlace: Del City High School");
			System.out.println("----------------------------------------");
			System.out.println("\t You are sitting in class listening to your teacher\n"
					+ "about carrier choices. She's been asking random students what they\n"
					+ "would like to be when they grow up. She then turns to you and asks\n"
					+ "you. What is your response?");
			System.out.println("What would you like to be in the future?");
			System.out.println("\t1) Business man");
			System.out.println("\t2) Soldier");
			System.out.println("\t3) Cashier");
			
			String job = input.nextLine();
			if(job.equals("1"))
			{
				System.out.println("You have chosen the \"Business man\" profession!");
				profession = "Business Man";
				spSpeech = 75;
				spIntelligence = 75;
				break;
			}
			else if(job.equals("2"))
			{
				System.out.println("You have chosen the \"Cashier\" profession!");
				profession = "Soldier";
				spSpeech = 50;
				spIntelligence = 50;
				break;
			}
			else if(job.equals("3"))
			{
				System.out.println("You have chosen to be a \"Soldier\"!");
				profession = "Cashier";
				spSpeech = 25;
				spIntelligence = 25;
				break;
			}
			else
			{
				System.out.print("Invalid Command, Try again.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		CHAPTER1:
			while(running)
			{
				loadScreen();
				System.out.println("Chapter 1: Present Day.");
				break;
			}
	}

	
	
	
	//METHODS
	public static void promptEnterKey()
	{
		System.out.println("Press \"ENTER\" to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	public static void clearScreen()
	{  
		for (int i = 0; i < 100; ++i) System.out.println();  
	}
	public static void loadScreen()
	{
		clearScreen();
		System.out.println("Loading...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("Loading...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("Loaded");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clearScreen();
	}
}