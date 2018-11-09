package tutoriaPackage;

public class ok {
	// assigns x to isSingleDigit 
	public static boolean isSingleDigit(int x)	{
		// figures out whether it is true or false 
		boolean determine;
		// figures out if it is true
		if (x > -10 && x < 10)	{
			
			determine = true;
		}
		// if it's anything but single digit numbers it is false
		else	{
			determine = false;
		}
		// returns whether it is true or false
		return determine;
	}
// determines if the next three numbers are single digit or not
	public static void main(String[] args)	{
			System.out.println(isSingleDigit(8643));
			System.out.println(isSingleDigit(7));
			System.out.println(isSingleDigit(0));}}

