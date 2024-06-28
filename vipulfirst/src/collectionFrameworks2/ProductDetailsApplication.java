package collectionFrameworks2;

import java.util.*;

class Product {
	private int id;
	private String name;
	private int price;
	Product() {
		
	}
	public  Product(String name,int id ,int price) {
		this.name=name;
		this.id=id;
		this.price=price;
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

public class ProductDetailsApplication {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		Scanner xyz=new Scanner(System.in);
		do {
			xyz=new Scanner(System.in);
			System.out.println("Enter the name,Id and price of the product");
			String name =xyz.nextLine();
			int id=xyz.nextInt();
			int price=xyz.nextInt();
			al.add(new Product(name,id,price));
			xyz.nextLine();
			System.out.println("Do u want more products");
			String msg=xyz.nextLine();
			if(msg.equals("no")) {
				break;
			}
		}while(true);
		System.out.println("Display the all products");
		for(Object obj : al)
		{
			Product p=(Product)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());
		}
		System.out.println("Enter the id for search");
		int prodId=xyz.nextInt();
		boolean flag=false;
		for(Object obj : al) {
			Product p=(Product)obj;
			if(p.getId()==prodId) {
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Product found");
		}
		else
		{
			System.out.println("Product not found");
		}
	}

}
