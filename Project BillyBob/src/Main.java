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
				System.out.println("\tChapter 1");
				System.out.println("Time: Present Day");
				System.out.println("------------------------------------");
				System.out.println("You come home from a long days work. You sit down at\n"
						+ "the kitchen table and your wife \"Patricia\" looks somber.\n"
						+ "She looks up at you with a tear in her eye and murmurs\n");
				waitWords();
				waitWords();
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
				promptEnterKey();
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
				System.out.println("---------------------------------------------------------\n");
				System.out.println("You place the notecard down on the table and leave to your fathers house.\n");
				promptEnterKey();
				clearScreen();
				boolean decision1 = true;
				
				while(decision1 == true)
				{
					System.out.println("\tChapter 2");
					System.out.println("You enter your fathers basement and look around the room.\n"
							+ "You notice a glowing box on the table. Do you open it?\n");
					String dec1 = input.nextLine();
					if(dec1.equals("yes") || dec1.equals("Yes"))
					{
						decision1 = false;
						System.out.println("You open the box and you see a shiney button with some dials set to \"December 7, 1970\"\n"
								+ "You press the button. It makes noises and knocks you off your feet. You look around and nothing seems\n"
								+ "to have changed. You hear footsteps coming from upstairs...\n");
						break;
					}
					else if(dec1.equals("no")|| dec1.equals("No"))
					{
						System.out.println("You go home and die at the age of 78.\n"
								+ "THE END");
								promptEnterKey();
								System.exit(0);
					}
					
					break;
				}
				break;
			}
		PAST:
			while(running)
			{
				System.out.println("You hear the door open and you stand up only to bump into the table.);
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
