package tutorialpackage;

import java.util.Random;

public class Arrays1 {
	public static void main(String[] args) {
		// create 2 arrays
		String[] studentsArray = {"Thanos","peter", "daneel", "shrek", "Bradley"};
		int[] gradesArray = new int [studentsArray.length];
		int avg = 0;
		// print arrays
		for(int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + " grades: " +gradesArray[i]);
		}		
	
		// create random object
		Random r = new Random();
		
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i]= r.nextInt(101);}
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println("name: " + studentsArray[i] + " grades: " +gradesArray[i]);}
		// avg
				for(int i = 0; i < gradesArray.length; i ++) {
					avg += gradesArray[i];
				}
				avg = avg/gradesArray.length;
				System.out.println("Class Avg: " + avg);
				
				for(int i = 0; i < gradesArray.length; i++) {
					if(gradesArray[i]==85) {
						System.out.println("You found it at index: " + i);
					}
						else {
							System.out.println("Not Found");
						}
					}
				}
	}
		
		

