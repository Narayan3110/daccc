package Collections;

public class Item {
	String name;
	int quantity;
	double price;
	public Item(String name, int quantity, double price) 
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	void display() {
		System.out.println(name + " " + quantity + " "+ price);
	}
}
