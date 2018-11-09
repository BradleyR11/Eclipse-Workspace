
public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] board = new char[3];
		board[0] = '-';
		board[1] = '-';
		board[2] = '-';
		
		for(char token:board) {
			System.out.println(token);
		}
		
		char[][] gameboard = new char[3][3];
		
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				gameboard[row][col] = '-';
			}
		}
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				System.out.print(gameboard[row][col]);
			}
		System.out.println();
	}

		gameboard[1][1] = 'X';
		
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				System.out.print(gameboard[row][col]);
			}
		System.out.println();
	}
		int player = 1;
		// ask input
		// place token
		// switch players
		player = 2:
		// ask input
		// place token
		// switch players			
}}
