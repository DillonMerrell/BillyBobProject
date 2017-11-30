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
				
		System.out.println("What is your name? ");
		System.out.print("Name: ");
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
				System.out.println("\tPatricia: Your father...");
				System.out.println("\t" + name + ": What about him?");
				System.out.println("\tPatricia: He's dead...");
				System.out.println("\t" + name + ": Wh...what?");
				System.out.println("\tPatricia: I'm sorry...");
				System.out.println("\tPatricia: He left you this.\n");
				promptEnterKey();
				System.out.println("She slides you a notecard written by your father.");
				System.out.println("It reads: ");
				System.out.println("---------------------------------------------------------");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("|                                                        |");
				System.out.println("|   Dear offspring,                                      |");
				System.out.println("|       If you're reading this I need your help.         |");
				System.out.println("|   I have left you one of my most valued possesions,    |");
				System.out.println("|   go to the basement in my house to find it. It will   |");
				System.out.println("|   be in a box marked \"Project T\".                      |");
				System.out.println("|                                                        |");
				System.out.println("|                                     -Dad               |");
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
					System.out.println("A) Yes");
					System.out.println("B) No");
					String dec1 = input.nextLine();
					if(dec1.equals("A") || dec1.equals("a"))
					{
						decision1 = false;
						System.out.println("\nYou open the box and you see a shiny button with some dials set to \"December 7, 1970\"\n"
								+ "You press the button. It makes noises and knocks you off your feet. You look around and nothing seems\n"
								+ "to have changed. You hear footsteps coming from upstairs...\n");
						break;
					}
					else if(dec1.equals("B")|| dec1.equals("b"))
					{
						System.out.println("You go home and die at the age of 78.\n"
								+ "THE END");
								promptEnterKey();
								System.exit(0);
					}
					else
					{
						System.out.println("Invalid Command");
						promptEnterKey();
						clearScreen();
					}
				}
				break;
			}
		PAST:
			while(running)
			{
				boolean breakWhile = false;
				System.out.println("You hear the door open and you stand up only to bump into the table making a lot of noise.\n"
						+ "You hear the voice of your father.");
				System.out.println("\tFather: Who's there?");
				System.out.println("\nDo you hide or do you stand out in the open?\n"
						+ "A) Hide\n"
						+ "B) Stand in the open");
				String pastBasementDecision1 = input.nextLine();
				if(pastBasementDecision1.equals("A") || pastBasementDecision1.equals("a"))
				{
					System.out.println("You run a hide behind some stacked boxes.\n"
							+ "Your father walks over to his workbench and grabs a flashlight. He then looks\n"
							+ "around the room. He then walks over to the boxes you are hiding behind and points\n"
							+ "his flashlight at you. You then stand up and brush yourself off. He sees \"Project T\" \n"
							+ "in your hands and looks flabberghasted.");
					breakWhile = true;
				}
				else if(pastBasementDecision1.equals("B") || pastBasementDecision1.equals("b"))
				{
					System.out.println("You stand up and try to speak but before you could your father turns on the light to\n"
							+ "see you standing there next to \"Project T\". ");
					breakWhile = true;
				}
				else
				{
					System.out.println("Invalid command.");
				}
				if (breakWhile == true)
				{
					break;
				}
			}
			while(running)
			{
				System.out.println("\n\tFather: " + name + "! You don't know how happy I am to see you!\n\t"
						+ "You must have recieved my letter.\n");
				System.out.println("\t" + name + ": Yes I did but... I thought you were dead.\n");
				System.out.println("\tFather: I thought I was too, until you came and found me.\n");
				System.out.println("\t" + name + ": What do you mean?\n");
				System.out.println("\tFather: I went back in time to test my invention. It didn't work as planned. \n\t"
						+ "You see I went into the future to steal a super CPU for one of my inventions.\n");
				System.out.println("\t" + name + ": Go on...\n");
				System.out.println("\tFather: When I was coming back to present day I put the wrong year in the time machine\n"
						+ "\tcausing it to transport me back to the 70's. I've been stuck here for 10 days in this empty house.\n");
				System.out.println("\t" + name + ": So why did you give me that postacard saying you were dead on it?\n");
				System.out.println("\tFather: I scheduled the letter to be sent in 10 days just incase I didn't come back. If \n"
						+ "\tI came back I could just cancel the letter. If not you would come rescue me.\n");
				System.out.println("\t " + name + ": What do you want me to do then?\n");
				System.out.println("\tFather: We can use your time machine.\n");
				promptEnterKey();
				break;
			}
			
			FUTURE:
				while(running)
				{
					clearScreen();
					System.out.println("Chapter: 3\n\n");
					System.out.println("  Your Father takes the time machine and sets the time to \"December 7, 2017\"\n"
							+ "The time machine starts making noises and gets very bright. You get closer to your Father\n"
							+ "trying to stay in the radius of the time machine. When the light calms down, everything seems\n"
							+ "be back to normal. Your father puts the time machine in his pocket and you both walk outside\n"
							+ "only to see that everything is different. There are robots mowing lawns, teenagers riding hoverboards,\n"
							+ "adults riding self-driving hover cars. You are in awe. In shock you turn to your father.");
					System.out.println("\nA) I don't think it worked.");
					System.out.println("B) Wow...");
					System.out.println("C) I wonder if they have lightsabers in this time period...");
					String futureDec1 = input.nextLine();
					if (futureDec1.equals("A") || futureDec1.equals("a"))
					{
						System.out.println("\tFather: No.. It didn't work.");
						promptEnterKey();
						break;
					}
					else if (futureDec1.equals("B") || futureDec1.equals("b"))
					{
						System.out.println("\tFather: Pretty breathtaking when you first see it isn't it?");
						promptEnterKey();
						break;
					}
					else if (futureDec1.equals("C") || futureDec1.equals("c"))
					{
						System.out.println("\tFather: I don't think this is the right time for jokes. ");
						promptEnterKey();
						break;
					}
					else
					{
						System.out.println("Invalid command");
						promptEnterKey();
					}
				}
			while(running)
			{
				clearScreen();
				System.out.println("\nYour father takes the time machine out of his hand and looks at it\n"
						+ "for a few minutes. He walks over to a nearby tree.\n\n");
				System.out.println("\tFather: This thing is a piece of junk.\n\n");
				System.out.println("He smashes the time machine against the tree. It breaks\n"
						+ "into a million pieces and scatters acorss the ground.\n\n");
				System.out.println("\t" + name + ":What are you doing?!?!\n");
				System.out.println("\tFather: We're in the future. They sell time machines on every corner store here.\n");
				System.out.println("\t" + name + ": Working time machines...\n");
				System.out.println("\tFather: Very funny...\n\n");
				System.out.println("You and your Father are walking down towards the store. He looks very\n"
						+ "frustrated with himself.");
				System.out.println("A) You okay Dad?");
				System.out.println("B) What invention needed you to go into the future?");
				System.out.println("C) Takes a pretty smart guy to travel time like you did.");
				String futureDec2 = input.nextLine();
				if (futureDec2.equals("a") || futureDec2.equals("A"))
				{
					System.out.println("\tFather: Yeah, I'm alright. ")
				}
				else if(futureDec2.equals("b") || futureDec2.equals("B"))
				{
					
				}
				else if (futureDec2.equals("c") || futureDec2.equals("C"))
				{
					
				}
				else
				{
					
				}
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
