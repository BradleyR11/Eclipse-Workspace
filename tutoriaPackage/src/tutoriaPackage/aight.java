package tutoriaPackage;

import java.util.Scanner;

public class aight {
	
public static void main(String[] args) {
	Scanner nameReversal = new Scanner(System.in);// prompts input for user name
	System.out.print("Enter your name my dude:");// asks user for name
	String name = nameReversal.nextLine( ); // name = nameReversal

	int stringLength = name.length( );// amount of characters from user input
	String nameReversal1 = "";// blank output, which then adds the name backwards with the following code
	for(int j = stringLength - 1; j >= 0; j--)
		 {
	String letter = name.substring(j, j + 1); //picks up just one letter at a time
	 nameReversal1 = nameReversal1 + letter;
		 }
	System.out.println(nameReversal1.toLowerCase()); // makes all lower case
		 }
		{

	
	
}}
