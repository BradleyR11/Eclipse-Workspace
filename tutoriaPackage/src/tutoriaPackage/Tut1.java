package tutoriaPackage;
import java.util.Scanner;
import java.util.Random;
public class Tut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName();
			
		String inData;
		Scanner scan = new Scanner( System.in);
		
		System.out.println("Enter the data");
		inData = scan.nextLine();
		
		System.out.println("You entered:" + inData );
	}
	
	private static void printName() {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int randomNum = rand.nextInt(10)+1;
		
		System.out.println(randomNum);
		
	}
	
}
