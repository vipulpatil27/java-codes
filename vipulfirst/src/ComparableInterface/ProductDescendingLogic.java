package ComparableInterface;

import java.util.*;

class Productt implements Comparable {

	private int id;
	private String name;
	private int price;

	Productt() {

	}

	public Productt(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// @Override
	public int compareTo(Object o) {

		Productt p = (Productt) o;
		if (this.price > p.price) {
			return -1;
		} else if (this.id < p.price) {
			return 1;
		} else {
			return 0;
		}
	}

}
public class ProductDescendingLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter the number of products you want");
		int no = xyz.nextInt();

		Productt p1[] = new Productt[no];

		System.out.println("Enter the ID, Name and price");
		for (int i = 0; i < no; i++) {
			p1[i] = new Productt();
			int id = xyz.nextInt();
			String name = xyz.next();
			int price = xyz.nextInt();
			p1[i] = new Productt(id, name, price);
			al.add(p1[i]);
		}

		System.out.println("Display the before sorting");
		for (Object obj : al) {
			Productt p = (Productt) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
		}
		Collections.shuffle(al);

		System.out.println("Display the before sorting");
		for (Object obj : al) {
			Productt p = (Productt) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
		}
	}

}
