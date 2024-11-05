package DBDA_HASHMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class productManagement {
	public static void main(String[] args) {
		HashMap<Integer,Product> hm = new HashMap<>();
		Product p1 = new Product(1,"shirt",11.00,100);
		Product p2 = new Product(1,"Tshirt",12.00,200);
		Product p3 = new Product(1,"jeans",13.00,300);
		Product p4 = new Product(1,"shoes",14.00,400);
		Product p5 = new Product(1,"caps",15.00,500);
		
		hm.put(1, p1);
		hm.put(2, p2);
		hm.put(3, p3);
		hm.put(4, p4);
		hm.put(5, p5);
		
		productManagement pm = new productManagement();
		while(true)
		{
			System.out.println("1.Display /2.add /3.remove /4.update");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the option");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				pm.displayProduct(hm);
				break;
			case 2:
				pm.addProduct(hm);
				break;
			case 3:
				pm.removeProduct(hm);
				break;
			default :
					System.out.println("hiiii");
			}
		}
	}
	
	void displayProduct(HashMap<Integer,Product> lb)
	{
		for(Map.Entry<Integer, Product> ll : lb.entrySet())
		{
			System.out.print(ll.getKey()+" --> ");
			Product p = ll.getValue();
			p.display();
		}
	}
	
	void addProduct(HashMap<Integer,Product> lb)
	{
		System.out.println("enter the ProductId");
		Scanner sc = new Scanner(System.in);
		int ProdId = sc.nextInt();
		if(lb.containsKey(ProdId))
		{
			System.out.println("product already present");
		}
		else
		{
			System.out.println("enter the ProductId");
			int ProductId = sc.nextInt();
			System.out.println("enter the ProductName");
			String ProductName = sc.next();
			System.out.println("enter the price");
			double price = sc.nextDouble();
			System.out.println("enter the quantity");
			int quantity = sc.nextInt();
			
			Product newprod = new Product(ProductId,ProductName,price,quantity);
			lb.put(ProdId, newprod);
			System.out.println("product added successfully");
		}
	}
	void removeProduct(HashMap<Integer,Product> lb)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ProductName u want to remove");
		String ProductName = sc.next();
		for(Map.Entry<Integer, Product> ll : lb.entrySet())
		{
			if (ll.getValue().productName.equalsIgnoreCase(ProductName)) {
                lb.remove(ll.getKey());
                System.out.println("Product with name '" + ProductName + "' removed successfully.");
                break;
            }
		}
	}
}
