import java.util.ArrayList;
import java.util.Scanner;
public class iPod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		allSongs.add("thank u, next");
		artists.add("Ariana Grande");
		allSongs.add("Happier");
		artists.add("Marshmellow");
		allSongs.add("Mans Not Hot");
		artists.add("Big Shaq");
		allSongs.add("Gangdam Style");
		artists.add("Psy");
		allSongs.add("Into You");
		artists.add("Ariana Grande");
		
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i+1+". "+ allSongs.get(i)+ " - "+artists.get(i));
		}
		
		System.out.println("\nSelect menu option: \n"
				+ "1. add song to library \n"
				+ "2. delete song \n"
				+ "3. Add to party Playlist\n"
				+ "4. Stop");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 1:
			input.nextLine();
			System.out.print("enter title");
			allSongs.add(input.nextLine());
			System.out.print("enter artist name");
			artists.add(input.nextLine());
			break;
		case 2:
			System.out.println("enter song number to delete");
			int delete = input.nextInt();
			allSongs.remove(delete);
			artists.remove(delete);
			break;
		case 3:
			System.out.println("what song number would you like to add?");
			partyPlaylist.add(allSongs.get(input.nextInt()-1));
			System.out.println(partyPlaylist);
			break;
		case 4:
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
