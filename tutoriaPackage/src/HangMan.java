import java.util.Scanner;
public class HangMan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guessCount = 0;
		guessCount++;
String[] word = {"_","_","_","_","_","_","_"};
Scanner scStr = new Scanner( System.in );
System.out.println("Guess one letter:");
String letter = scStr.nextLine();
	if (letter.equals("b")){
		
}
	else {
		System.out.print("Wrong!!");}
	
	
	if (guessCount == 0){
		System.out.println(word);
	}
	else if (guessCount == 1){
		System.out.println("|");
		System.out.println(word);
	}
	else if (guessCount == 2) {
		System.out.println("|");
		System.out.println("O");
		System.out.println(word);
	}
	else if (guessCount == 3) {
		System.out.println("|");
		System.out.println("O");
		System.out.println("/ | \"");
		System.out.println(word);

	}
			
	while(guessCount != 6);{// if user gets to 6 guesses, they lose
		System.out.println("You lost, you already guessed 6 times, you are dead!! *_*.");
		System.out.println("The word you were guessing was, Bradley "); // It prints The year you were guessing was " + number
		System.out.println("Would you like to play again? \n1. Yes\n2. No"); // it prints out Would you like to play again? 1. Yes\n 2. No\n
		
	}
	
}
}
