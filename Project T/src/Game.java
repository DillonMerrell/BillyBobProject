
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Game
{
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, informationPanel, setPlayerNamePanel, playerNameNextButtonPanel, playerNameTextFieldPanel;
	JLabel titleNameLabel, timeLabel, timeNum, nameLabel, nameText, setPlayerNameLabel,playerNameTextFieldLabel;
	Font titleFont = new Font("PROMETHEUS", Font.PLAIN, 90);
	Font defaultFont = new Font("Roboto Lt", Font.PLAIN, 40);
	Font dialogFont = new Font("Roboto Lt", Font.PLAIN, 18);
	JButton startButton, choice1, choice2, choice3, choice4, playerNameNextButton;
	JTextArea mainTextArea;
	JTextField playerNameTextField;
	int time;
	String playerName, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	PlayerSetupScreenHandler psHandler = new PlayerSetupScreenHandler();
	ChoiceHandler cHandler = new ChoiceHandler();
	
	public static void main(String[] args)
	{
		new Game();

	}
	
	public Game()
	{
		window = new JFrame();
		window.setSize(800,1000); // Window resolution
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel= new JPanel(); //Creating the title panel
		titleNamePanel.setBounds (100,100,600,150); //Setting the title panel cords.
		titleNamePanel.setBackground(Color.black); //Setting the title panel background color
		titleNamePanel.setVisible(true); //Setting the title panel to be visible (true = visible, false = invisible)
		titleNameLabel = new JLabel("project t"); //Title Screen text
		titleNameLabel.setForeground(Color.white);//Setting the font color.
		titleNameLabel.setFont(titleFont);// Setting the font for the text.
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,350,200,100);
		startButtonPanel.setBackground(Color.black);
		startButtonPanel.setVisible(true);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(defaultFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
	}
	
	public void settingPlayerName()
	{
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		setPlayerNamePanel = new JPanel();
		setPlayerNamePanel.setBounds(100,100,600,100);
		setPlayerNamePanel.setBackground(Color.black);
		setPlayerNamePanel.setVisible(true);
		setPlayerNameLabel = new JLabel("What is your name?");
		setPlayerNameLabel.setForeground(Color.white);
		setPlayerNameLabel.setFont(dialogFont);
		
		playerNameTextFieldPanel = new JPanel();
		playerNameTextFieldPanel.setBounds(100,250,600,25);
		playerNameTextFieldPanel.setBackground(Color.black);
		playerNameTextFieldPanel.setVisible(true);
		playerNameTextFieldLabel = new JLabel();
		playerNameTextFieldLabel.setBounds(100,250,600,150);
		playerNameTextFieldLabel.setForeground(Color.white);
		playerNameTextFieldLabel.setFont(dialogFont);
		playerNameTextField = new JTextField("Type Name Here", 30);
		playerNameTextField.addActionListener(psHandler);
		playerNameTextField.setBounds(100,250,600,150);
		playerNameTextField.setVisible(true);
		playerNameTextFieldPanel.add(playerNameTextFieldLabel);
		playerNameTextFieldPanel.add(playerNameTextField);
		con.add(playerNameTextFieldPanel);
		
		
		playerNameNextButtonPanel = new JPanel();
		playerNameNextButtonPanel.setBounds(275,350,250,100);
		playerNameNextButtonPanel.setBackground(Color.black);
		playerNameNextButtonPanel.setVisible(true);
		playerNameNextButton = new JButton("Start Story");
		playerNameNextButton.setBackground(Color.black);
		playerNameNextButton.setForeground(Color.white);
		playerNameNextButton.setFont(defaultFont);
		playerNameNextButton.addActionListener(psHandler);
		playerNameNextButton.setFocusPainted(false);
		
		setPlayerNamePanel.add(setPlayerNameLabel);
		playerNameNextButtonPanel.add(playerNameNextButton);
		
		con.add(setPlayerNamePanel);
		con.add(playerNameNextButtonPanel);
		
	}
	
	public void createGameScreen()
	{
		setPlayerNamePanel.setVisible(false);
		playerNameNextButtonPanel.setVisible(false);
		playerNameTextFieldPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100,100,600,550);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("");
		mainTextArea.setBounds(100,100,600,550);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(dialogFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setHighlighter(null);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(100,650,600,250);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setVisible(true);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(dialogFont);
		choiceButtonPanel.add(choice1);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(dialogFont);
		choiceButtonPanel.add(choice2);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("c2");
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(dialogFont);
		choiceButtonPanel.add(choice3);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(dialogFont);
		choiceButtonPanel.add(choice4);
		choice4.setFocusPainted(false);
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("c4");
		
		informationPanel = new JPanel();
		informationPanel.setBounds (100,15,600,50);
		informationPanel.setBackground(Color.black);
		informationPanel.setLayout(new GridLayout(1,4));
		informationPanel.setVisible(true);
		con.add(informationPanel);
		
		timeLabel = new JLabel("Time: ");
		timeLabel.setFont(dialogFont);
		timeLabel.setForeground(Color.white);
		informationPanel.add(timeLabel);
		timeNum = new JLabel("Present Day");
		timeNum.setFont(dialogFont);
		timeLabel.setForeground(Color.white);
		informationPanel.add(timeNum);
		nameLabel = new JLabel("Name: ");
		nameLabel.setFont(dialogFont);
		nameLabel.setForeground(Color.white);
		informationPanel.add(nameLabel);
		nameText = new JLabel(playerName);
		nameText.setFont(dialogFont);
		nameText.setForeground(Color.white);
		informationPanel.add(nameText);
		
		openingScene();
	}
	
	public void openingScene()
	{
		position = "openingScene";
		mainTextArea.setText("Chapter 1: Dads gone AWOL\n"
				+ "----------------------------"
				+ "\nYou come home from a long days work."
				+ " You sit down at the kitchen table \nand your wife \"Patricia\" looks somber."
				+ " She looks up at you with a tear in her\neye and murmurs.\n\n"
				+ "\tPatricia: Your father... He's... He's gone missing...\n\n"
				+ "How do you respond?");
		choice1.setText("What do you mean \"Gone missing\"?");
		choice2.setText("Wh... What?");
		choice3.setText("He couldn't have gotten far could he?");
		choice4.setText("How did he go missing?");
	}
	
	public void osc1()
	{
		position = "osc1";
		mainTextArea.setText("Your wife looks up at you and starts crying.\n\n"
				+ "\tPatricia: No one has seen or heard from him in 10 days \n\t"
				+ "and when your Aunt Jenifer went to go check up\n\t"
				+ "on him he wasn't home.. There was dust\n\t"
				+ "on everything an inch thick. The power was\n\t"
				+ "cut off. It was as if the place was abandoned.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	
	public void osc2()
	{
		position = "osc2";
		mainTextArea.setText("Your wife looks up at and tears start pouring from her eyes.\n\n"
				+ "\tPatricia: I don't know what happened to him.. I'm so sorry\n\t hunny.\n\n"
				+ "She wipes the tears from her eyes.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	
	public void osc3()
	{
		position = "osc3";
		mainTextArea.setText("\tPatricia: No one has seen or heard from him in 10 days.\n"
				+ "\tHe could have anywhere by this point.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	
	public void osc4()
	{
		position = "osc4";
		mainTextArea.setText("\tPatricia: No one has seen or heard from him in 10 days.\n"
				+ "\tWhen your Aunt Jenifer went to go check up on him\n"
				+ "\the wasn't home.. There was dust\n\t"
				+ "on everything an inch thick. The power was\n\t"
				+ "cut off. It was as if the place was abandoned.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	
	public void os2()
	{
		position = "os2";
		mainTextArea.setText("\tPatricia: We got a letter from him in\n"
				+ "\tthe mail today. I figured you should\n"
				+ "\tbe the one to open it.\n\n"
				+ "She hands you a letter addressed to you from your father.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void os3()
	{
		position = "os3";
		mainTextArea.setText("It reads:\n\n"
				+ "Dear " + playerName + ",\n"
				+ "      If you have recieved this letter. I am in dire need of\n"
				+ "    your help. Go to my house and head down into the\n"
				+ "    basement. There is a project I have been working\n"
				+ "    on for many years now. It is a box that reads\n"
				+ "    \"Project T\" on the top of it. Open it and press\n"
				+ "    the button. Please hurry.\n"
				+ "-Dad");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void os3c1()
	{
		position = "os3c1";
		mainTextArea.setText("Do you wish to go on this Journey?");
		choice1.setText("Yes");
		choice2.setText("No (Exits game)");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pbs1()
	{
		position = "pbs1";
		mainTextArea.setText("You head to your fathers house and once you get inside\n"
				+ "you see how abandoned the place looks. Everything was scattered\n"
				+ "everywhere. Like he was in a rush to get something. Maybe he was\n"
				+ "kidnapped and he fought back leaving this mess around the place.\n"
				+ "No, thats not like your father.\"He's a mad scientist, he would\n"
				+ "have turned them into monkeys to do simple tasks for him\"\n"
				+ "you think to yourself. You go into the basement and turn on\n"
				+ "the one light thats in the room and there it is. Right in\n"
				+ "front of your face.\n"
				+ "\"Project T\"\n\n"
				+ "Do you open the box?");
		choice1.setText("Yes");
		choice2.setText("No");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pbs1c1()
	{
		position = "pbs1c1";
		mainTextArea.setText("Chapter 2: General Relativity\n"
				+ "----------------------------\n"
				+ "You open the box and see the dials are set to\n"
				+ "\"December 7th, 1992\". You think nothing of it and press the\n"
				+ "button. A huge flash of light emerges from the box, blinding you.\n"
				+ "Everything seems to be moving at light speed, yet everything is\n"
				+ "still. You get knocked off your feet by the sudden stop. When\n"
				+ "you land on the ground you being to roll into the desk that\n"
				+ "\"Project T\" was sitting on. Making noise but not harming\n"
				+ "anything. You then hear footsteps coming from upstairs. You\n"
				+ "know you are not in the same location you were a few minutes\n"
				+ "ago but, you know this is the same place because this place is\n"
				+ "very familiar to you. As if it was from your\n"
				+ "childhood, down to every last detail. You hear a voice coming\n"
				+ "from upstairs. You could hear them saying \"Did you hear that?\"\n"
				+ "but couldn't make out who it was but, yet again, a familiar voice.\n"
				+ "The door starts to open.\n\n"
				+ "What do you do?");
		choice1.setText("Hide");
		choice2.setText("Stand out in the open");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pabsHide()
	{
		timeNum.setText("Past (1992)");
		position = "pabsHide";
		mainTextArea.setText("You hear the voice of your father coming from behind\n"
				+ "some boxes. His head peeks up and to your surprise your father\n"
				+ "is there.\n\n"
				+ "\tFather: Come here quick.\n\n"
				+ "\t" + playerName + ": Da-\n\n"
				+ "\tFather: Quiet. Come here now.\n\n"
				+ "You run over to your father without making a sound. A younger\n"
				+ "version of your father walks down the stairs. You have no\n"
				+ "idea what is going on. You whisper to your father.\n\n"
				+ "\t" + playerName + ": What is going on?\n\n"
				+ "\tFather: Be quiet. I'll explain after he leaves.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pabsOpen()
	{
		position = "pabsOpen";
		mainTextArea.setText("You stand up and brush yourself off. When all of\n"
				+ "A sudden, your father jumps out from behind some boxes and \n"
				+ "says.\n\n"
				+ "\tFather: You don't know how happy I am to see you but you \n"
				+ "\tneed to be quiet right now. I'll explain everything when he\n"
				+ "\tleaves.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pabsManLeft()
	{
		position = "pabsManLeft";
		mainTextArea.setText("The man walks down the stairs and comes to a complete\n"
				+ "stop once he reaches the botton step. He then looks around and\n"
				+ "whistles. He turns around a leaves assuming it was nothing.\n\n"
				+ "\tFather: That was a close one. Thank God you found me\n"
				+ "\twhen you did. I thought I was gonna die here with a broken\n"
				+ "\ttime machine.\n"
				+ "\t" + playerName + ": That's what this is? A time machine?\n"
				+ "\tFather: Yes. It's the most complex invention I have yet to\n"
				+ "\tfinish\n\n"
				+ "\t" + playerName + ": If you broke your time machine in the past.\n"
				+ "\tHow was I able to use the time machine that would\n"
				+ "\ttechnically be in the future?\n\n"
				+ "\tFather: I didn't break my time machine in the past.\n"
				+ "\tI broke it in the in the future. As a last effort to save myself\n"
				+ "\tthe time machine tried to send me back to the present day\n"
				+ "\tbut, it failed to do so. It sent me back to the past with my\n"
				+ "\tbroken time machine to be by my side. That letter I had sent\n"
				+ "\tto you was just a precaution incase just this thing happened.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void pabsEx()
	{
		position = "pabsEx";
		mainTextArea.setText("\t" + playerName + ": So you want this time machine to\n"
				+ "\ttake us back to present day?\n\n"
				+ "\tFather: That's the goal. Let's just hoipe that it works\n\n"
				+ "\t" + playerName + ": You mean theres a chance it wont?\n\n"
				+ "\tFather: Yes " + playerName + ", I broke my time machine\n"
				+ "\tin the future right? If the time machine messes up and\n"
				+ "\tsends us further in the future than when I initally broke\n"
				+ "\tthe machine. It will create the butterfly effect on our\n"
				+ "\tcurrent time machine. Causing it to be broken somewhere\n"
				+ "\tin the future.. where we will be. Don't think about it and\n"
				+ "\thand me the box.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void goingToFuture()
	{
		position = "goingToFuture";
		mainTextArea.setText("Chapter 3: A Wrinkle in Time\n"
				+ "----------------------------\n"
				+ "You hand your father the box. He opens the box\n"
				+ "and sets the dials to December 6th, 2049. He looks up at\n"
				+ "and nods his head then presses the button. A large flash\n"
				+ "of light blinds you and your father. You are both knocked\n"
				+ "to the ground. Once everything calms down you and your\n"
				+ "father get up and dust yourself off. Everything inside the\n"
				+ "house is abandoned. Your father seems to be in shock.\n\n"
				+ "\tFather: What happened here?");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs1()
	{
		timeNum.setText("Future (2049)");
		position = "fs1";
		mainTextArea.setText("Your father looks around the empty room. You\n"
				+ "you watch as the fear in his eyes begin to turn into tears.\n\n"
				+ "\tFather: My work... All my work... Where did it go?\n\n"
				+ "How do you respond?");
		choice1.setText("It must be somewhere else.");
		choice2.setText("Did you die before \"now\"?");
		choice3.setText("Let's just go back and forget any of this ever happened.");
		choice4.setText("Let's go outside and see if anything else is different.");
	}
	
	public void fs1c1()
	{
		position = "fs1c1";
		mainTextArea.setText("\tFather: Let's go check upstairs.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs1c2()
	{
		position = "fs1c2";
		mainTextArea.setText("\tFather: Theres no way I died because of a\n"
				+ "\tbroken time machine. Unless...\n\n"
				+ "Your father rushes upstairs, you quickly follow him.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs1c3()
	{
		position = "fs1c3";
		mainTextArea.setText("\tFather: We can't \"Just go and forget it\n"
				+ "\tit ever happened\" we need to find out what happened\n"
				+ "\tto all my stuff. I've had these patented for years.\n"
				+ "\tThese are multimillion dollar ideas. I can't just\n"
				+ "\"Forget it ever happened\".\n\n"
				+ "Your father rushes upstairs, you quickly follow him.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs1c4()
	{
		position = "fs1c4";
		mainTextArea.setText("\tFather: Maybe we could get an idea as to what\n"
				+ "\thappened here. Let's go.\n\n"
				+ "Your father rushes upstairs, you quickly follow him.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs2()
	{
		position = "fs2";
		mainTextArea.setText("You and your father walk outside to see that\n"
				+ "evyerthing is super advanced. Teenagers riding hover\n"
				+ "boards, robots mowing lawns, self-driving cards.\n"
				+ "Your father walks out and is in shock.\n\n"
				+ "\tFather: This is unbelievable.. These are my inventions.\n"
				+ "\tWhy are my inventions here?\n\n"
				+ "You both see a passing commercial car come by. You both\n"
				+ "look at it as it passes. The logo on it says \"Kieth Enterprises\"\n\n"
				+ "\tFather: Unblieveable...\n\n"
				+ "\t" + playerName + ": What?\n\n"
				+ "\tFather: I wrote my will when you were a kid just in case\n"
				+ "\tone of my accidents ended badly. In my will I gave your\n"
				+ "\tuncle Kieth the rights to my patents so he can hold onto\n"
				+ "\tthem until you turn 18 so you can sell them for college.\n"
				+ "\tHe must have sold them when I went missing. So that must\n"
				+ "\tmean that this is the alternate reality where I was never\n"
				+ "\tfound.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void fs2AJ()
	{
		position = "fs2AJ";
		mainTextArea.setText("\t" + playerName + ": When I went to your house,\n"
				+ "\teverything was scattered all around the place. It must've\n"
				+ "\tbeen Uncle Kieth searching for them.\n\n"
				+ "\tFather: I also gave Aunt Jenifer the house in the will. She\n"
				+ "\tmust've put it up for sale... Wait...\n\n"
				+ "\t" + playerName + ": What...?\n\n"
				+ "\tFather: If I am presumed dead in this reality... and you\n"
				+ "\tcame to find me. We never returned.. So you're missing too\n\n"
				+ "\t" + playerName + ": If this is the future full of your\n"
				+ "\tinventions then, wouldn't you produce all of these \n"
				+ "\teventually?\n\n"
				+ "\tFather: In time I presume.\n\n"
				+ "\t" + playerName + ": So what do we need to be here for? Let's\n"
				+ "\tgo back to the present and get the patents from Uncle Kieth\n"
				+ "\tand prevent all of this.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void backToPresent()
	{
		position = "backToPresent";
		mainTextArea.setText("Your father agrees with you and you both go back\n"
				+ "into the basement and set the date on \"Project T\" back to\n"
				+ "\"December 7th, 2017\" A flash of light emerges from the box\n"
				+ "blinding you and your father. You both get knocked to the\n"
				+ "ground. When everything calms down, it all seems to be back\n"
				+ "to normal. You and your father get up and dust yourselves off.\n"
				+ "You walk outside and everything looks normal. ");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void psFinal()
	{
		timeNum.setText("Present day");
		position = "psFinal";
		mainTextArea.setText("\tFather: Thank you, " + playerName + ". \n\n"
				+ "Your father takes \"Project T\" and smashes it against a tree.\n\n"
				+ "\t" + playerName + ": What did you do that for?\n\n"
				+ "\tFather: Because, I won't be needing it anymore. \n"
				+ "\tI will however be needing this.\n\n"
				+ "He shows you a particle changer.\n\n"
				+ "\t" + playerName + ": What do you need that for?\n\n"
				+ "\tFather: I need to go have a talk to Kieth and Jenifer.");
		choice1.setText("**Continue**");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void endingWCredits()
	{
		informationPanel.setVisible(false);
		position = "endingWCredits";
		mainTextArea.setText("\t\tThe End\n"
				+ "---------------------------------------------------------------------------\n\n"
				+ "\t\tCredits\n"
				+ "---------------------------------------------------------------------------\n\n"
				+ "\t     Story Created by: Mike & Jeff\n"
				+ "\t     Revision & Drafted by: Dalton\n"
				+ "\t     Developed by: Dillon");
		choice1.setText("Exit Game");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	
	public class TitleScreenHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			settingPlayerName();
		}
	}
	
	public class PlayerSetupScreenHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			playerName = playerNameTextField.getText();
			playerNameTextFieldLabel.setText(playerName);
			createGameScreen();
		}
	}
	
	public class PlayerNameInputHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			playerName = playerNameTextField.getText();
			playerNameTextFieldLabel.setText(playerName);
			createGameScreen();
		}
	}
	
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String yourChoice = event.getActionCommand();
			
			switch(position)
			{
			case "openingScene":
				switch(yourChoice)
				{
					case "c1": osc1(); break;
					case "c2": osc2(); break;
					case "c3": osc3(); break;
					case "c4": osc4(); break;
				}
				break;
			case "osc1":
				switch(yourChoice)
				{
					case "c1": os2(); break;
					case "c2": break;
					case "c3": break;
					case "c4": break;
				}
				break;
			case "osc2":
				switch(yourChoice)
				{
				case "c1": os2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "osc3":
				switch(yourChoice)
				{
				case "c1": os2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "osc4":
				switch(yourChoice)
				{
				case "c1": os2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "os2":
				switch(yourChoice)
				{
				case "c1": os3(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "os3":
				switch(yourChoice)
				{
					case "c1": os3c1(); break;
					case "c2": break;
					case "c3": break;
					case "c4": break;
				}
				break;
			case "os3c1":
				switch(yourChoice)
				{
				case "c1": pbs1(); break;
				case "c2": System.exit(1000); break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pbs1":
				switch(yourChoice)
				{
				case "c1": pbs1c1(); break;
				case "c2": System.exit(1000); break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pbs1c1":
				switch(yourChoice)
				{
				case "c1": pabsHide(); break;
				case "c2": pabsOpen(); break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pabsHide":
				switch(yourChoice)
				{
				case "c1": pabsManLeft(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pabsOpen":
				switch(yourChoice)
				{
				case "c1": pabsManLeft(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pabsManLeft":
				switch(yourChoice)
				{
				case "c1": pabsEx(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "pabsEx":
				switch(yourChoice)
				{
				case "c1": goingToFuture(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "goingToFuture":
				switch(yourChoice)
				{
				case "c1": fs1(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs1":
				switch(yourChoice)
				{
				case "c1": fs1c1(); break;
				case "c2": fs1c2(); break;
				case "c3": fs1c3(); break;
				case "c4": fs1c4(); break;
				}
				break;
			case "fs1c1":
				switch(yourChoice)
				{
				case "c1": fs2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs1c2":
				switch(yourChoice)
				{
				case "c1": fs2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs1c3":
				switch(yourChoice)
				{
				case "c1": fs2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs1c4":
				switch(yourChoice)
				{
				case "c1": fs2(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs2":
				switch(yourChoice)
				{
				case "c1": fs2AJ(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "fs2AJ":
				switch(yourChoice)
				{
				case "c1": backToPresent(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "backToPresent":
				switch(yourChoice)
				{
				case "c1": psFinal(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "psFinal":
				switch(yourChoice)
				{
				case "c1": endingWCredits(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
				break;
			case "endingWCredits":
				switch(yourChoice)
				{
				case "c1": System.exit(0); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
			}
		}
	}
}
