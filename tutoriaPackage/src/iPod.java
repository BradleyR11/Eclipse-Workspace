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
		
		System.out.println("Select menu option: \n"
				+ "1. add song to library \n"
				+ "2. delete song \n"
				+ "3. Add to party Playlist");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 1) {
			input.nextLine();
			System.out.print("enter title");
			allSongs.add(input.nextLine());
			System.out.print("enter artist name");
			artists.add(input.nextLine());
		}
		else if(choice == 2) {
			System.out.println("enter song number to delete");
			allSongs.remove((input.nextInt()));
			artists.remove((input.nextInt()));
		}
		else if(choice == 3) {
			System.out.println("what song number would you like to add?");
			partyPlaylist.add(allSongs.get(input.nextInt()-1));
			System.out.println(partyPlaylist);
		}
		else {
			System.out.println("Invalid");
		}
	}

}
