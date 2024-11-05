package DBDA_HASHMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cdacManagement 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,CDAC> hm = new HashMap<>();
		CDAC c1 = new CDAC(10,"harsh",23,90000);
		CDAC c2 = new CDAC(20,"pawan",231,80000);
		CDAC c3 = new CDAC(30,"praveen",24,70000);
		CDAC c4 = new CDAC(40,"pratyush",22,60000);
		
		hm.put(1, c1);
		hm.put(2, c2);
		hm.put(3, c3);
		hm.put(4, c4);
		
		cdacManagement cm = new cdacManagement();
		while(true)
		{
			System.out.println("enter options : 1.details /2.add /3.remove");
			Scanner sc = new Scanner(System.in);
			int option =sc.nextInt();
			switch(option)
			{
			case 1:
				cm.displaycdac(hm);
				break;
			case 2:
				cm.addcdac(hm);
				break;
			case 3:
				cm.removecdac(hm);
				break;
			default:
				System.out.println("done");
			}
		}
	}
	void displaycdac(HashMap<Integer,CDAC> lb)
	{
		for(Map.Entry<Integer, CDAC> ll : lb.entrySet())
		{
			System.out.print(ll.getKey()+" ==> ");
			CDAC c = ll.getValue();
			c.display();
		}
	}
	void addcdac(HashMap<Integer, CDAC> lb)
	{
		System.out.println("enter the id you want to add");
		Scanner sc = new Scanner(System.in);
		int iduwanttoadd = sc.nextInt();
		if(lb.containsKey(iduwanttoadd))
		{
			System.out.println("id is already present");
		}
		else
		{
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the age");
			int age = sc.nextInt();
			System.out.println("enter the sal");
			float sal = sc.nextFloat();
			
			CDAC newcdac = new CDAC(id,name,age,sal);
			lb.put(iduwanttoadd, newcdac);
		}
	}
	void removecdac(HashMap<Integer,CDAC> lb)
	{
		System.out.println("enter the name u want to remove");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(Map.Entry<Integer, CDAC> ll : lb.entrySet())
		{
			if(ll.getValue().name.equalsIgnoreCase(name))
			{
				lb.remove(ll.getKey());
				return;
			}
		}
	}
}
