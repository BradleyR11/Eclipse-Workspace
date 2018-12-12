
import java.util.Scanner;
public class Hangman1 {
	
		
		private static String[] words = {"brix", "gio", "math", "mouse", "cat", "dog" }; // The possible words that the player can get to guess
		private static String word = words[(int) (Math.random() * words.length)];// Gets the length of each word
		private static String letters = new String(new char[word.length()]).replace("\0", "*");
		private static int AmtGuesses = 0;

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);// scanner

			while (AmtGuesses < 6 && letters.contains("*")) {// limits the amount of guesses
				System.out.println("Guess a letter:");
				System.out.println(letters);
				String guess = input.next();
				hang(guess);
			}
			input.close();
		}

		public static void hang(String guess) {
			String newletters = "";
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == guess.charAt(0)) {
					newletters += guess.charAt(0);
				} else if (letters.charAt(i) != '*') {
					newletters += word.charAt(i);
				} else {
					newletters += "*";
				}
			}

			if (letters.equals(newletters)) {
				AmtGuesses++;
				hangmanDrawing();
			} else {
				letters = newletters;
			}
			if (letters.equals(word)) {
				System.out.println("Congratulations you won! The word was " + word);
			}
		}

		public static void hangmanDrawing() {
			if (AmtGuesses == 1) {
				System.out.println("Wrong! Try again:");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("___|___");
				System.out.println();
			}
			else if (AmtGuesses == 2) {
				System.out.println("Wrong! Come on, you're better than this....:");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			else if (AmtGuesses == 3) {
				System.out.println("Ur trash!");
				System.out.println("   ____________");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   | ");
				System.out.println("___|___");
			}
			else if (AmtGuesses == 4) {
				System.out.println("My guy, try again:");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			else if (AmtGuesses == 5) {
				System.out.println("Wrong guess, try again:");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |           |");
				System.out.println("   |           |");
				System.out.println("   |");
				System.out.println("___|___");
			}
		
			else if (AmtGuesses == 6) {
				System.out.println("GAME OVER! Nice try. YOU LOST!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |          _|_");
				System.out.println("   |         / | \\");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
				System.out.println("The word was " + word);
			}
			 
		}

	}

