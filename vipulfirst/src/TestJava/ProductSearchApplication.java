package TestJava;

import java.util.*;

class Product {
	int id;
	String name;
	int price;

	Product() {

	}

	public Product(int id, String name, int price) {
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
}

public class ProductSearchApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		do {
			System.out.println("Enter the ID,Name and Price of Product");
			int id = xyz.nextInt();
			String name = xyz.next();
			int price = xyz.nextInt();
			al.add(new Product(id, name, price));
			xyz.nextLine();
			System.out.println("Do u want more products");
			String msg = xyz.next();
			if (msg.equals("no")) {
				break;
			}
		} while (true);
		System.out.println("Display the all products");
		for (Object obj : al) {
			Product p = (Product) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
		}
		System.out.println("Enter the choice");
		System.out.println("1: Sort the product by id" + "\n" + "2: Sort the product  by price");

		int choice = xyz.nextInt();
		switch (choice) {
		case 1:
			Product p;
			for (int i = 0; i < al.size(); i++) {
				Object obj = al.get(i);
				for (int j = (i + 1); j < al.size(); j++) {
					Object obj1 = al.get(j);
					p = (Product) obj;
					Product p1 = (Product) obj1;
					if (p.getId() > p1.getId()) {
						al.set(j, p);
						al.set(i, p1);
					}
				}
			}
			for (Object obj : al) {
				p = (Product) obj;
				System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
			}
			break;
		case 2:
			// Product p;
			for (int i = 0; i < al.size(); i++) {
				Object obj = al.get(i);
				for (int j = (i + 1); j < al.size(); j++) {
					Object obj1 = al.get(j);
					p = (Product) obj;
					Product p1 = (Product) obj1;
					if (p.getPrice() > p1.getPrice()) {
						al.set(j, p);
						al.set(i, p1);
					}
				}
			}
			for (Object obj : al) {
				p = (Product) obj;
				System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
			}
			break;
		}
	}
}
