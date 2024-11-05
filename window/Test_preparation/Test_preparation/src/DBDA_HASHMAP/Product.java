package DBDA_HASHMAP;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId, String productName, double price, int quantity) 
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	void display()
	{
		System.out.println(productId+" "+productName+" "+price+" "+quantity);
	}
}
