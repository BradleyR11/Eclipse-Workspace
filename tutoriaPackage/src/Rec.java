
public class Rec {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rec() {
		x=10;
		y=10;
		width=50;
		height=100;
	}
	
	public Rec(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y +" width: "+ width + " height: "+ height;
		
	}
	public int getx() {
		return x;
	}
	public void translate(int moveX, int moveY) {
		x += moveX;
		y += moveY;
	}
}
