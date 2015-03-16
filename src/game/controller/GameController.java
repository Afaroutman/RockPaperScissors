package game.controller;
import java.util.Scanner; 
import java.util.Random;

public class GameController
{

//	private int getTie;
//	private int getLoose;
//	private int getWin;
//	
//	private int score()
//	{
//		getLoose = 0;
//		getTie = 1;
//		getWin = 2;
//		
//		
//		
//		return 0;
//	}
	public void start()
	{
		/**
		 * User's play -- "Rock", "Paper", or "Scissors"
		 */
	    String personPlay; 
	    /**
	     * Computer's play -- "Rock", "Paper", or "Scissor"
	     */
	    String computerPlay = ""; 
	    /**
	     * Randomly generated number used to determine 
	     */
	    int computerInt; 
	     /**
	     * computer's play 
	     */
	    String response; 
	    
	    Scanner scan = new Scanner(System.in); 
	    
	    Random generator = new Random();
	    
	    System.out.println("Wanna play Rock, Paper, Scissors?\n" + 
	                       "Please enter a move.\n" + "Rock, Paper" + 
	                       ", or Scissors.");
	    /**
	     * Generate computer's play (0,1,2) 
	     */
	    computerInt = generator.nextInt(3)+1;
	    /**
	     * string using if //statements 
	     * Translate computer's randomly generated play to
	     */
	    if (computerInt == 1) 
	       computerPlay = "Rock"; 
	    else if (computerInt == 2) 
	       computerPlay = "Paper"; 
	    else if (computerInt == 3) 
	       computerPlay = "Scissors";
	    /**
	     * Get player's play from input-- note that this is 
	     *  stored as a string 
	     */
	    System.out.println("Enter your play: "); 
	    personPlay = scan.next();
	    /**
	     * Make player's play uppercase for ease of comparison 
	     */
	    personPlay = personPlay.toUpperCase(); 
	    /**
	     * Print computer's play 
	     */
	    System.out.println("Computer play is: " + computerPlay); 
	    /**
	     * if Theres a tie
	     */
	    if (personPlay.equalsIgnoreCase(computerPlay)) 
	       System.out.println("Wow you chose the same thing as the computer"); 
	    /**
	     * |Player| vs. |Computer| This goes through all the comments
	     * |Rock| vs. |Scissors|
	     */
	    else if (personPlay.equalsIgnoreCase("Rock")) 
	       if (computerPlay.equalsIgnoreCase("Scissors")) 
	          System.out.println("Rock destroys Scissors. You win!!");
	    /**
	     * |Rock| vs. |Paper|
	     */
	    else if (computerPlay.equalsIgnoreCase("Paper")) 
	            System.out.println("Paper can cover rock of course. You lose!!"); 
	    /**
	     * |Paper| vs. |Scissors|
	     */
	    else if (personPlay.equalsIgnoreCase("Paper")) 
	       if (computerPlay.equalsIgnoreCase("Scissors")) 
	       System.out.println("Computer decided to join scrapbooking. You lose!!");
	    /**
	     * |Paper| vs. |rock|
	     */
	    else if (computerPlay.equalsIgnoreCase("Rock")) 
	            System.out.println("Paper can cover rock of course. You win!!"); 
	    /**
	     * |Scissor| vs. |Paper|
	     */
	    else if (personPlay.equalsIgnoreCase("Scissors")) 
	         if (computerPlay.equalsIgnoreCase("Paper")) 
	         System.out.println("You making money cause, You win!!"); 
	    /**
	     * |Scissor| vs. |Rock|
	     */
	    else if (computerPlay.equalsIgnoreCase("Rock")) 
	            System.out.println("You blew it. You lose!!"); 
	    /**
	     * anything else
	     */
	    System.out.println("Again? Yes/No");
	    personPlay = scan.next();
	    if(personPlay.equalsIgnoreCase("yes"))
	    {
	    	secondTime();
	    }
	    		
	    	
	    	else
	    	{
	    		System.out.println("Bye have good time");
	    	}
	    }
	    /**
	     * Tried to make it a loop to keep playing but in process
	     */
	 
	    
	
	private String secondTime()
	{
		/**
		 * User's play -- "Rock", "Paper", or "Scissors"
		 */
	    String personPlay; 
	    /**
	     * Computer's play -- "Rock", "Paper", or "Scissor"
	     */
	 
	    int computerInt; 
	     /**
	     * computer's play 
	     */
	    Scanner scan = new Scanner(System.in); 
	    Random generator = new Random();
	    computerInt = generator.nextInt(3)+1;
	    
	    String computerPlay = ""; 
    	if (computerInt == 1) 
 	       computerPlay = "Rock"; 
 	    else if (computerInt == 2) 
 	       computerPlay = "Paper"; 
 	    else if (computerInt == 3) 
 	       computerPlay = "Scissors";
    	
    	 System.out.println("Enter your play: "); 
 	    personPlay = scan.next();
 	    
 	   System.out.println("Computer play is: " + computerPlay); 
 	    
 	   personPlay = personPlay.toUpperCase(); 

	    if (personPlay.equalsIgnoreCase(computerPlay)) 
	       System.out.println("Wow you chose the same thing as the computer"); 
	    	
	    else if (personPlay.equalsIgnoreCase("Rock")) 
	       if (computerPlay.equalsIgnoreCase("Scissors")) 
	          System.out.println("Rock destroys Scissors. You win!!");
	    		
	    else if (computerPlay.equalsIgnoreCase("Paper")) 
	            System.out.println("Paper can cover rock of course. You lose!!"); 
	    else if (personPlay.equalsIgnoreCase("Paper")) 
	       if (computerPlay.equalsIgnoreCase("Scissors")) 
	       System.out.println("Computer decided to join scrapbooking. You lose!!"); 
	    else if (computerPlay.equalsIgnoreCase("Rock")) 
	            System.out.println("Paper can cover rock of course. You win!!"); 
	    else if (personPlay.equalsIgnoreCase("Scissors")) 
	         if (computerPlay.equalsIgnoreCase("Paper")) 
	         System.out.println("You making money cause, You win!!"); 
	    else if (computerPlay.equalsIgnoreCase("Rock")) 
	            System.out.println("You blew it. You lose!!"); 
	    else 
	    	System.out.println("Bye have good time");
	    
			System.out.println("Again? Yes/No");
		 
		    personPlay = scan.next();
		    
		    if(personPlay.equalsIgnoreCase("yes"))
		    {
		    	secondTime();
		    }
		   	else
		    {
		    	System.out.println("Bye have good time");
		    }
		  
		    return computerPlay; 
	}
	
}
