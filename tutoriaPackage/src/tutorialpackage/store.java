package tutorialpackage;
import java.util.Scanner;

//Tesla Roadster = $257 000
//Honda Civic Type R = $33 900
//Bugatti Chiron = $3 000 000

public class store {
	public static void startUp() {
		Scanner scStr = new Scanner( System.in );
		System.out.println("Hello what is your name?");
		String name = scStr.nextLine();
		System.out.println("Hello, "+ name+ ", welcome to the Veloso's Black Market Vehicles.");
	}

	public static void calculations()	{
		
	}
	
	public static void carStoreMain()	{
	int teslaQuantity = 0;
	int chironQuantity = 0;
	int typeRQuantity = 0;
	int thanosQuantity = 0;
	double totalCost = 0;
	int loop = 0;
	final double TAX = 0.05;
	double teslaCost = 257000;
	double chironCost = 3000000;
	double typeRCost = 33900;
	double thanosCost = 2000000000;
	startUp();
	Scanner scanNum = new Scanner( System.in );
	while(loop == 0) {
		System.out.println("What vehicle would you like to buy?\n1. 2052 Tesla Roadster\n2. 2018 Bugatti Chiron\n3. 2018 Honda Civic Type R\n4. Thanos Car");
		int choice = scanNum.nextInt();
		if (choice == 1)	{
			System.out.println("How many would you like?");
			int quantity = scanNum.nextInt();
			double carCost = quantity*teslaCost;
			double carTax = carCost*TAX;
			totalCost = carCost+carTax;
			teslaQuantity = teslaQuantity+quantity;
			System.out.println("Would you like to buy something else?\n1. Yes\n2. No");
			int choiceExit = scanNum.nextInt();
			if (choiceExit == 1)	{
			}
			else if (choiceExit == 2)	{
				break;
			}
			else	{
				System.out.println("Not a valid option");
			}
			
		}
		else if (choice == 2)	{
			System.out.println("How many would you like?");
			int quantity = scanNum.nextInt();
			double carCost = quantity*chironCost;
			double carTax = carCost*TAX;
			totalCost = carCost+carTax;
			chironQuantity = chironQuantity+quantity;
			System.out.println("Would you like to buy something else?\n1. Yes\n2. No");
			int choiceExit = scanNum.nextInt();
			if (choiceExit == 1)	{
			}
			else if (choiceExit == 2)	{
				break;
			}
			else	{
				System.out.println("Not a valid option");
			}
		}
		else if (choice == 3)	{
			System.out.println("How many would you like?");
			int quantity = scanNum.nextInt();
			double carCost = quantity*typeRCost;
			double carTax = carCost*TAX;
			totalCost = carCost+carTax;
			typeRQuantity = typeRQuantity+quantity;
			System.out.println("Would you like to buy something else?\n1. Yes\n2. No");
			int choiceExit = scanNum.nextInt();
			if (choiceExit == 1)	{
			}
			else if (choiceExit == 2)	{
				break;
			}
			else	{
				System.out.println("Not a valid option");
			}
		}
		else if (choice == 4)	{
			System.out.println("How many would you like?");
			int quantity = scanNum.nextInt();
			double carCost = quantity*thanosCost;
			double carTax = carCost*TAX;
			totalCost = carCost+carTax;
			thanosQuantity = thanosQuantity+quantity;
			System.out.println("Would you like to buy something else?\n1. Yes\n2. No");
			int choiceExit = scanNum.nextInt();
			if (choiceExit == 1)	{
			}
			else if (choiceExit == 2)	{
				break;
			}
			else	{
				System.out.println("Not a valid option");
			}
		}
		else	{
			System.out.println("Sorry that is not a valid option.");
		}
	}
	System.out.printf("\nYou have\nTesla : " + teslaQuantity + "\nChiron : " + chironQuantity + "\nType R : " + typeRQuantity + "\nThanos Car : " + thanosQuantity + "\nThe total cost is : $%.2f" , totalCost);
}

	public static void main(String[] args) {
		carStoreMain();
	}

}

