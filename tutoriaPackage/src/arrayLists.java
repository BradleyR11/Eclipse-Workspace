import java.util.ArrayList;
public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new ArrayList object
		ArrayList<Integer> grades = new ArrayList<Integer>();
		// useful methods for ArrayList
		grades.add(76); // adds to array list
		grades.add(86);
		grades.add(1, 90); // insert 90 at index 1
		grades.remove(0); // removes first item (index 0)in ArrayList
		grades.get(0); //return index 0
		grades.size();// returns length of ArrayList
		//prints arraylist
		for(int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}
		grades.remove(1);
		
		for(int grade: grades) {
			System.out.println(grade);;
		}
	}

}
