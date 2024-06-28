package inheritence;

import java.util.*;

abstract class Sportsman {
	int id;
	String name;
	String sport;

	Sportsman(int id, String name, String sport) {
		this.id = id;
		this.name = name;
		this.sport = sport;
	}

	abstract void display();
}

class Player extends Sportsman {
	int totalmatch;
	int totalrun;

	Player(int totalmatch, int totalrun, int id, String name, String sport) {
		super(id, name, sport); // here through super() class we call the parent details
		this.totalmatch = totalmatch;
		this.totalrun = totalrun;
		this.id = id;
		this.name = name;
		this.sport = sport;
	}

	void dispaly() {
		System.out.printf("---Players Details---");
		System.out.printf("\n\nID of player: %d", id);
		System.out.printf("\nName of player :%s", name);
		System.out.printf("\nSport palyed by palyer :%s", sport);
		System.out.printf("\n----Palyer details who have played matches----");
		System.out.printf("\n\nTotal Matches by player :%d", totalmatch);
		System.out.printf("\nTotal Runs by player :%d", totalrun);
	}

	void display() {

	}
}

public class SportsPlayerApp {

	public int runs = 0;

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the player's details");
		System.out.println("Enter the id of player :");
		int id = xyz.nextInt();
		System.out.println("Name :");
		String name = xyz.next();
		System.out.println("Enter the sports of player");
		String sport = xyz.next();
		System.out.println("Enter the details of player who had played the mathces");
		System.out.println("Enter the total number of mathces  played");
		int totalmatch = xyz.nextInt();
		System.out.println("Enter the total runs of player");
		int totalrun = xyz.nextInt();
		Player p = new Player(totalmatch, totalrun, id, name, sport);
		p.dispaly();
		xyz.close();
	}

}
