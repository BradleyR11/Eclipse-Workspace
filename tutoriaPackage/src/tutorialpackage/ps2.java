package tutorialpackage;

public class ps2 {

	public static void main(String[] args) {
		// assigns the integer 5 to weekday
		int weekday = 5;
		// this line states that is it not a holiday
				boolean holiday = false;
				// the integer used for weekday will help determine dayOfTheWeek
				int dayOfTheWeek;
				// if it is not a holiday and weekday is less than or equal to 5 and greater than 0, it prints Wake up at 7:00
				if ( !holiday && weekday <= 5 && weekday > 0) {
					System.out.println("Wake up at 7:00");
				} else {
				// if the previous parameters aren’t met the output will be, Sleep in!
				System.out.println("Sleep in!");
				}
			}
		}
