package Interface;

import java.util.*;

interface SportsMan {
	// interface class

	public static int id = 0;
	public static String name = "";
	public static String sport = "";
}

class Player implements SportsMan {
	int totatMatch;
	int totalrun;
	int id;
	String name;
	String sport;

	Player(int id, String name, String sport, int totalMatch, int totalrun) {
		// initializing constructor
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.totatMatch = totalMatch;
		this.totalrun = totalrun;
	}

	public int getTotatMatch() {
		return totatMatch;
	}

	public void setTotatMatch(int totatMatch) {
		this.totatMatch = totatMatch;
	}

	public int getTotalrun() {
		return totalrun;
	}

	public void setTotalrun(int totalrun) {
		this.totalrun = totalrun;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

}

public class SportsManDetails {
	public static void main(String[] args) {
		// main method
		Scanner xyz = new Scanner(System.in);
		System.out.println("How many palyers u want to add");
		int no = xyz.nextInt();
		Player p[] = new Player[no];
		for (int i = 0; i < no; i++) {
			System.out.println("Enter ID,Name,Sports name,Total Matches,Total Runs");
			int id = xyz.nextInt();
			String name = xyz.next();
			String sport = xyz.next();
			int totalMatch = xyz.nextInt();
			int totalrun = xyz.nextInt();
			p[i] = new Player(id, name, sport, totalMatch, totalrun);
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = (i + 1); j < p.length; j++) {
				if (p[i].getTotalrun() < p[j].getTotalrun()) {
					Player temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		System.out.println("Player details in highest runs"); // users output
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getId() + "\t" + p[i].getName() + "\t" + p[i].getSport() + "\t" + p[i].getTotalrun()
					+ "\t" + p[i].getTotatMatch());
		}
	}

}
