package collectionFrameworks;

import java.util.*;

class Product {
	private int id;
	private String name;
	private int quantity;
	private int price;
	private int rate;
	private int TotalofProduct;
	
	 Product() {
		
	}
	 Product(int id,String name,int quantity,int price,int rate,int TotalofProduct) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		this.rate=rate;
		this.TotalofProduct=TotalofProduct;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
	this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int price() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getTotalofProduct() {
		return TotalofProduct;
	}

	public void setTotalofProduct(int totalofProduct) {
		this.TotalofProduct = totalofProduct;
	}
}

public class ArrayListProductApplication {

	public static void main(String[] args) {
		Scanner  xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		do {
			System.out.println("Enter the ID,name,price,quantity,rate");
			int id=xyz.nextInt();
			String name=xyz.next();
			int price=xyz.nextInt();
			int quantity=xyz.nextInt();
			int rate=xyz.nextInt();
			al.add(id);
			al.add(name);
			al.add(price);
			al.add(quantity);
			al.add(rate);
		}while(true);
	}
}
