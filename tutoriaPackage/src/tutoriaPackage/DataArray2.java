package tutoriaPackage;

public class DataArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] NameArray = {"Brix","Gio","Angel","Stefano","Brad","Bradley"}; //array of names
		int[] gradeNum = {11,12,10,11,12,12}; //array of which grade the students are in
		int[] exam1 = {45,96,92,67,12,70}; //first exam marks
		int[] exam2 = {5,87,81,93,46,98}; //second exam marks
		int[] exam3 = {31,76,80,24,68,76}; //third exam marks
		
		System.out.println("Name: " + NameArray[0]); //prints name of first student
		System.out.println("Grade: " + gradeNum[0]); //prints grade of first student
		System.out.println("Exam 1: " + exam1[0]); //prints mark of first exam
		System.out.println("Exam 2: " + exam2[0]); //prints mark of second exam
		System.out.println("Exam 3: " + exam3[0]); //prints mark of third exam
		System.out.println();//Used for spacing
		System.out.println("Name: " + NameArray[5]); //prints name of last student
		System.out.println("Grade: " + gradeNum[5]); //prints grade of last student
		System.out.println("Exam 1: " + exam1[5]); //prints mark of first exam
		System.out.println("Exam 2: " + exam2[5]); //prints mark of second exam
		System.out.println("Exam 3: " + exam3[5]); //prints mark of third exam
		
		System.out.println();//Used for spacing
		for(int i = 0; i < NameArray.length; i++) { //prints all students names
		System.out.println(NameArray[i]);// Prints Out the names
		}
		
		System.out.println();//Used for spacing
		for(int i = 0; i < NameArray.length; i++) { //prints all students names, grades, and exam marks
			System.out.println(NameArray[i] + " Grade: " + gradeNum[i] + "\nExam 1: " + exam1[i] + "\nExam 2: " + exam2[i] + "\nExam 3: " + exam3[i]); // Prints the student's name, grade, and their exam grade from exams 1-3
		}
		
		System.out.println();//Used for spacing
		for(int i = 0; i < NameArray.length; i++) { //prints all students names, grades, and exam marks along with their number order in NameArray
			System.out.println((i + 1) + " " + NameArray[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i]); //Prints out the students name, grades, and from exam 1-3
		}
		
		System.out.println();//Used for spacing
		System.out.println("/*********************Next 20%***********/"); // Prints out the next 20%
		
		for(int i = 0; i < NameArray.length; i++) { //prints averages of each student's marks
			int sum = exam1[i] + exam2[i] + exam3[i]; //sum of all 3 exams
			int avg = sum / 3;// divides sum by the amount of exams (3 exams)
			System.out.println("The average of: " + NameArray[i] + " is " + avg); // Prints out the students average
		}
		
		System.out.println();//Used for spacing
		System.out.println("/*********************Next 20%***********/"); // Prints out the next 20%
		
		for(int i = 0; i < NameArray.length; i++) {//prints students names that have a higher mark than 79 on exam 3
			if(exam3[i] > 79) {//if grade is higher than 79 continue
				System.out.println("Student: " + NameArray[i] + " got a grade higher than 79 on exam 3");	//tells student their name and when they got a higher mark than 79
			}
		}
		
		for(int i = 0; i < NameArray.length; i++) {	//prints students name that have lower mark than 50
			if(exam1[i] > 50) {	//if grade is lower than 50 continue
				exam1[i] = 40;	//changes grade to 40
				System.out.println("Student: " + NameArray[i] + " Exam 1 mark lower than 50, changed to: " + exam1[i]); //Prints words inside brackets + values of variables inside brackets
			}
		}
	}
}
