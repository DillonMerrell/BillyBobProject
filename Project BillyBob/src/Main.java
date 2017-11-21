import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		//player variables
		String name;
		
		//game variables
		boolean running = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("##########################");
		System.out.println("#   Project Billy Bob    #");
		System.out.println("##########################");
		promptEnterKey();
		clearScreen();
				
		System.out.print("What is your name? ");
		name = input.nextLine();
		System.out.println("Your name is: " + name);
		promptEnterKey();
		clearScreen();
		
		GAME:
			while(running)
			{
				System.out.println("Time: Some time in the future.");
				System.out.println("------------------------------------");
				System.out.println("You come home from a long days work. You sit down at\n"
						+ "the kitchen table and your wife \"Patricia\" looks somber.\n"
						+ "She looks up at you with a tear in her eye and murmurs\n");
				waitWords();
				System.out.println("\tPatricia: Your father...");
				waitWords();
				System.out.println("\t" + name + ": What about him?");
				waitWords();
				System.out.println("\tPatricia: He's dead...");
				waitWords();
				System.out.println("\t" + name + ": Wh...what?");
				waitWords();
				System.out.println("\tPatricia: I'm sorry...");
				waitWords();
				System.out.println("\tPatricia: He left you this.\n");
				waitWords();
				System.out.println("She slides you a notecard written by your father.");
				System.out.println("It reads: ");
				System.out.println("---------------------------------------------------------");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("|   Dear offspring,                                      |");
				System.out.println("|       If you're reading this I am dead.                |");
				System.out.println("|   I have left you one of my most valued possesions,    |");
				System.out.println("|   go to the basement in my house to find it. It will   |");
				System.out.println("|   be in a box marked \"Project T\".                      |");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("---------------------------------------------------------\n\n\n");
				
				System.out.println("You place the notecard down on the table.");
				
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
	
	public static void waitWords()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
