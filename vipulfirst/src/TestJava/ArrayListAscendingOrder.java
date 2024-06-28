package TestJava;

import java.util.*;

class Player {
	int id;
	String name;
	int run;

	Player() {

	}

	public Player(int id, String name, int run) {
		this.id = id;
		this.name = name;
		this.run = run;
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

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

public class ArrayListAscendingOrder {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		do {
			xyz = new Scanner(System.in);
			System.out.println("Enter the ID Name and Runs of player");
			int id = xyz.nextInt();
			String name = xyz.next();
			int run = xyz.nextInt();
			al.add(new Player(id, name, run));
			System.out.println("Do u want more players");
			boolean flag = false;
			String msg = xyz.next();
			if (msg.equals("no")) {
				break;
			}

		} while (true);
		System.out.println("Display the all players details");
		for (Object obj : al) {
			Player p=(Player)obj;
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		Player p;
		for(int i=0;i<al.size();i++)
		{
			Object  obj=al.get(i);
			for(int j=(i+1);j<al.size();j++)
			{
				Object obj1=al.get(j);
				p=(Player)obj;
				Player p1=(Player)obj1;
				if(p.getRun()>p1.getRun())
				{
					al.set(j, p);
					al.set(i, p1);
				}
			}
		}
		for(Object obj: al)
		{
			p=(Player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
	}
}
