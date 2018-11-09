
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] employeeName = {"john", "jill", "george", "basil"};
int[] wage = {15,16,22,17,25};
int[] hours = new int[5];

hours[0] = 34;
hours[1] = 25;
hours[2] = 45;
hours[3] = 58;
hours[4] = 40;

for(int i = 0; i < wage.length; i++) {
	System.out.println("i: " + i + "name:" + employeeName[i]+" \twage: $"+wage[i]);
}
System.out.println();

for(int i = 0; i < wage.length; i++) {
	System.out.println("Name: " + employeeName[i] + "Pay: "+ wage[i]*hours[i]);
} 
System.out.println();
for(int i = 0; i < wage.length; i++) {
	if (hours[i] < 40) {
		System.out.println("FIRE: " + employeeName[i]);
		employeeName[i] ="";
		wage[i] = 0;
	}
}
	}

}
