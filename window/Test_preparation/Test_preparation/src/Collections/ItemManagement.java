package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ItemManagement {
	public static void main(String[] args) {
		HashMap<Integer, Item> Im = new HashMap<>();
		Item I1 = new Item("shirts",100,1.50);
		Item I2 = new Item("jeans",100,2.50);
		Item I3 = new Item("Tshirts",50,3.50);
		Item I4 = new Item("shoes",180,4.50);
		Item I5 = new Item("watches",150,5.50);
		Item I6 = new Item("perfumes",16,6.50);
		
		Im.put(1, I1);
		Im.put(2, I2);
		Im.put(3, I3);
		Im.put(4, I4);
		Im.put(5, I5);
		Im.put(6, I6);
		
		Item I;
		
		display(Im);
		addItem(Im);
		display(Im);
		removeItem(Im);
		display(Im);
	}
	
	static void display(HashMap<Integer,Item> Im)
	{
		for(Map.Entry<Integer, Item> II : Im.entrySet())
		{
			System.out.print(II.getKey());
			Item I=II.getValue();
			I.display();
		}
	}
	
	static void addItem(HashMap<Integer,Item> Im)
	{
		System.out.println("enter the item id you wan to add");
		Scanner sc = new Scanner(System.in);
		int Itemid = sc.nextInt();
		if(Im.containsKey(Itemid))
		{
			System.out.println("item with id "+Itemid+" already present");
		}
		else
		{
			System.out.println("enter the item name");
			String name = sc.next();
			System.out.println("enter the item quantity");
			int quantity =sc.nextInt();
			System.out.println("enter the item price in double : ");
			double price =sc.nextDouble();
			
			Item newItem = new Item(name,quantity,price);
			Im.put(Itemid, newItem);
			System.out.println("Item adde successfully");
		}
	}
	static void removeItem(HashMap<Integer, Item> Im)
	{
		System.out.println("enter the item id u want to remove");
		Scanner sc = new Scanner(System.in);
		int Itemid = sc.nextInt();
		if(Im.containsKey(Itemid))
		{
			Im.remove(Itemid);
		}
	}
}
