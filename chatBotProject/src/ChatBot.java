import java.util.*;

public class ChatBot {
	
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in); // Here we are taking input.
		System.out.println("Hey there I'm Chat Bot");  // we are printing on screen that I am chatBot.
		boolean running = true;  // Declaring boolean as running and assigning the value as true for while loop.
		String input;  // Declaring the string as input .
	
			
			
			while(running = true)  // checking running is true or not and running while loop.
			{
				System.out.println(" "); // This for printing space on screen.
				input = sc.nextLine();   // This line is for taking input from users.
				if( input.length() == 0 )  // If the input length is equal to zero or empty  then it will be print "Please say something.
		        {
		            System.out.println( "Please say something :)" );
		        }

		        else if(input.equals("Hi") ||  // This is for checking condition which has been given by users.
		            input.equals("hello") ||  // Here if User give following Inputs like Hi , hello , hey , hiya , heya then it will print Hello to you too!.
		            input.equals("hey") ||
		            input.equals("hiya") ||
		            input.equals("heya") )

		            {
		                System.out.println( "Hello to you too!" );  // This is for printing the message on screen.
		            }

		        else if(
			            input.equals("how are you") ||            // This is for checking condition which has been given by users.
			            input.equals("hows it going") ||           
			            input.equals("yo wassup") ||
			            input.equals("heya")  ||
			            input.equals("hey whats up") ||     // Here if User give following Inputs like How are you , then it will print Hello to you too!.
			            input.equals("How are you?") ||
			            input.equals("whats up") )
		        		
		            {
		                System.out.println( "I'm good, how are you?" );
		            }

				

				else if(
						input.equals("bye") ||        // This is for checking condition which has been given by users.
			            input.equals("Bye") ||
			            input.equals("over") ||
			            input.equals("Finished") ||
			            input.equals("finish") )   // Here if User give following Inputs like bye , Bye then it will print Bye See You Again!.
				{
					System.out.println("Bye See you Again !");  
					
				}
				
				else if(
						input.equals("What is District 99 ?") ||          // This is for checking condition which has been given by users.
			            input.equals("District 99 ") ||
			            input.equals("district 99") ||
			            input.equals("99") ||
			            input.equals("district99") )   // Here if User give following Inputs like District 99 then below line will print on screen 
				{
					System.out.println("District 99 provides a caring and challenging environment where all students develop as lifelong learners !");
					
				}

				else if(input.equals("Who is Marvin Mark Smith?"))      // This is for checking condition which has been given by users.
				{
					System.out.println("He is an American businessman and politician.");
					 // Here if User give following Inputs like Who is Marvin Mark Smith  then below line will print on screen 
				}

				else if(input.equals("Which party is he associated with?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("He is associated with the Republican party.");
					
				}

				else if(input.equals("When was he born?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("He was born on june 18,1970 in Bamberg , Germany.");
			
				}

				else if(input.equals("What was his father's name?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("His father's name was Randy smith.");
					 // Here if User give following Inputs like What was his father's name  then below line will print on screen 
					
				}

				else if(input.equals("What was his mother's name?"))       // This is for checking condition which has been given by users.
				{
					System.out.println("His mother's name was Elayne Forastiere.");
					// Here if User give following Inputs like What was his mother's name?  then below line will print on screen 
				}

				else if(input.equals("What was his son’s name?"))      // This is for checking condition which has been given by users.
				{
					System.out.println("His son's name was  Parker,Avery and Dominic.");
					// Here if User give following Inputs like What was his son’s name? then below line will print on screen 
				}
 
				else if(input.equals("How many son’s he have?"))       // This is for checking condition which has been given by users.
				{
					System.out.println("He has three sons");
					// Here if User give following Inputs like How many son’s he have? then below line will print on screen
				}

				else if(input.equals("When he was married?"))       // This is for checking condition which has been given by users.
				{
					System.out.println("He married on october 24 , 1993 .");
					// Here if User give following Inputs like When he was married? then below line will print on screen
				}

				else if(input.equals("Where did he graduate from?"))      // This is for checking condition which has been given by users.
				{
					System.out.println("He graduated from Fayetteville Technical college.");
					// Here if User give following Inputs like Where did he graduate from? then below line will print on screen
				}

				else if(input.equals("When did he graduate?"))      // This is for checking condition which has been given by users.
				{
					System.out.println(" He graduated in 1993.");
					// Here if User give following Inputs like When did he graduate? then below line will print on screen
				}

				else if(input.equals("Who is the  president of McAlister-Smith funeral Homes ,inc?"))   // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin Mark Smith is the president of McAlister -Smith funeral Homes ,inc.");
					// Here if User give following Inputs like Who is the  president of McAlister-Smith funeral Homes ,inc? then below line will print on screen
				}

				else if(input.equals("Who is the CEO of McAlister-Smith Funeral Homes,inc?"))    // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin Mark Smith is the CEO  of  McAlister -Smith funeral Homes,inc.");
					// Here if User give following Inputs like Who is the CEO of McAlister-Smith Funeral Homes,inc? then below line will print on screen
				}

				else if(input.equals("What was his Columbai Address?"))    // This is for checking condition which has been given by users.
				{
					System.out.println("His Columbai Address are is "+ "327A Blatt Bldg."+ "Columbia 29201.");
					// Here if User give following Inputs like What was his Columbai Address? then below line will print on screen
				}

				else if(input.equals("What is his Business phone number?"))    // This is for checking condition which has been given by users.
				{
					System.out.println("His Business phone number is (803) 221-6719.");
					// Here if User give following Inputs like What is his Business phone number? then below line will print on screen
				}
				else if(input.equals("What was his Home Address?"))       // This is for checking condition which has been given by users.
				{
					System.out.println("His Home Address is "+ " 1125 Pinefield Drive"+ "Charleston 29492.");
					// Here if User give following Inputs like What was his Home Address? then below line will print on screen
				}

				else if(input.equals("What was his home phone number?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("His Home phone number is (843) 442-8371.");
					// Here if User give following Inputs like What was his home phone number? then below line will print on screen
				}

				else if(input.equals("Who was the past president  of East cooper Republican Club?"))      // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin Mark Smith was the past president  of the East Republican club.");
					// Here if User give following Inputs like Who was the past president  of East cooper Republican Club?  then below line will print on screen
				}

				else if(input.equals("Who is a member of Daniel Island Rotary Club?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin Mark Smith is a member of Daniel Island Rotary Club.");
					// Here if User give following Inputs like Who is a member of Daniel Island Rotary Club? then below line will print on screen
				}

				else if(input.equals("Who is the past chairman of a low country food  bank?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin Mark Smith was a past chairman of a low country food bank.");
					// Here if User give following Inputs like Who is the past chairman of a low country food  bank?  then below line will print on screen
				}

				else if(input.equals("Who was Director General at (IWMI)?"))     // This is for checking condition which has been given by users.
				{
					System.out.println("Marvin  Mark Smith Director General at (IWMI).");
					// Here if User give following Inputs like Who was Director General at (IWMI)?  then below line will print on screen
				}
				else            // If the input given by user is not matched then "Sorry I don't understand message will print on screen.
				{
					System.out.println("Sorry I don't understand");
	
				}

	
			}
			
	}
		
}
	


