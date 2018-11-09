package tutoriaPackage;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		public static void final() {
			Scanner user_input = new Scanner( System.in );
			String first_name;
		System.out.print("What's your name?");
			first_name = user_input.next( );
		System.out.print("Hi," + first_name + "\nWould you like to play the worst guessing game ever?\nENTER 1.yes or 2.no:"  );
		Scanner  sc = new Scanner( System.in );
		int yes_no = sc.nextInt();
		if (yes_no == 1)	{
		System.out.println("boy");
		}
		else if (yes_no == 2)	{
		System.out.println("Youre hella nice");
		}
		}
			int w = 1;
			int w2 = 1;
			int y = 1;
			do {
				Random x = new Random();
				int number = x.nextInt(101);
				do {
				  if (y == 1) {System.out.println("Guess my number between 0 and a hundred");
				  y = 0;
				  }
				
				  else {}
				Random scanNum;
				int answer = scanNum.nextInt();
				 
				if (answer < number) {
					System.out.println("Your answer: " + answer);
					System.out.println("Higher");
				}
				else if (answer > number) {
					 System.out.println("Your answer: " + answer);
			     	 System.out.println("Lower");
				}
				else if (answer == number) {
					 System.out.println("Your answer: " + answer);
					 System.out.println("Your correct!");
					 w2 = 0;
				}
				else {}
				} while (w2 == 1); {
				    String name;
					System.out.println("Ok " + name + (" would you like to guess my numbers again?... Yes or No"));
					Scanner scanStrings;
					String secondQuestion = scanStrings.nextLine();
					  if (secondQuestion.equalsIgnoreCase("yes")) {
						  w2 = 1;
						  y = 1;
					}
					
					  else if(secondQuestion.equalsIgnoreCase("no")) {
						  System.out.println("Ok have a nice day");
						  w = 0;
					}
					  else {
						  System.out.println("Thats not a valid answer silly");
					}
				}
			} while (w == 1);
		}
	public static void main(String[] args) {
			System.out.println("Hey man what's your name?");
			Scanner scanStrings = null;
			String name = scanStrings.nextLine();
			System.out.println("Ok " + name + (" would you like to guess my numbers?... Yes or No"));
			
			String firstQuestion = scanStrings.nextLine();
			
			if (firstQuestion.equalsIgnoreCase("yes")) {
				question();
			}
				
			else if(firstQuestion.equalsIgnoreCase("no")) {
				System.out.println("ok...");
			}
			else {
				System.out.println("Thats not a valid answer silly");
			}			


	}
	private static void question() {
		// TODO Auto-generated method stub
		
	}

}
