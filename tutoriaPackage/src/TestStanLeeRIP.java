
public class TestStanLeeRIP {

	private String name;
	private String power;
	private int age;
	private int health;
	private int damage;
	
	public Hero() {
		name = "Jane doe";
		power = "Super speed";
		age = 20;
		health = 100;
		damage = 10;
	}
	
	public Hero(String name, String power, int age, int health, int damage) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.health = health;
		this.damage = damage;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void fight(Hero h) {
		h.setHealth(h.getHealth() - this.damage);
}
	
	public String toString() {
		return "Name: " + name + " Power: " + power;
	}	
}//end Hero class

public class Metorite {
	
	private String[] powers = {"extreme smacking","explosion","doing taxes","baking"};
	
	public Metorite() {}
	
	public void mutate(Hero h) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		h.setPower(newPower);
		System.out.println(h.toString());
	}

}//end Metorite class



public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero();
		Hero h2 = new Hero("bill","strong",19,200,20);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		
		Metorite m = new Metorite();
		
		m.mutate(h1);
		m.mutate(h2);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println();
		
		while(h1.getHealth() >= 0) {
			h2.fight(h1);
			System.out.println("h1 health: " + h1.getHealth());
		}//end while
	
	}//end main

}//end class
