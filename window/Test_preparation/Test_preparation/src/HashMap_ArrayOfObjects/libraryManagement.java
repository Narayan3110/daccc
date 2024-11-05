package HashMap_ArrayOfObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class libraryManagement {
	librarymain[] l;
	HashMap<Integer,librarymain> lb = new HashMap<>();
	void createObjectArray()
	{
		System.out.println("enter the no. of books u want to add in the library");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		l=new librarymain[n];
		System.out.println("enter the details of the books");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter title");
			String title = sc.next();
			System.out.println("enter author");
			String author = sc.next();
			System.out.println("enter copies");
			int availableCopies = sc.nextInt();
			
			l[i] = new librarymain(title,author,availableCopies);
			lb.put(i+1, l[i]);
		}
	}
	void display(HashMap<Integer,librarymain> lb)
	{
		for(Map.Entry<Integer, librarymain> ll : lb.entrySet())
		{
			System.out.print(ll.getKey()+" --> ");
			librarymain l = ll.getValue();
			l.display();
		}
	}
	void remove(HashMap<Integer, librarymain> lb)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the booktitle u want to remove");
		String Booktitle = sc.next();
		for(Map.Entry<Integer, librarymain> ll : lb.entrySet())
		{
			if(ll.getValue().title.equalsIgnoreCase(Booktitle))
			{
				lb.remove(ll.getKey());
				System.out.println("Book with title " + Booktitle + " removed successfully.");
				return;
			}
		}
		System.out.println("Book with title '" + Booktitle + "' not found.");
	}
	public static void main(String[] args) {
		libraryManagement lbl = new libraryManagement();
		lbl.createObjectArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
	
		while(true)
		{
			System.out.println("1. display /2.remove");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				lbl.display(lbl.lb);
				break;
			case 2:
				lbl.remove(lbl.lb);
				break;
			default :
				System.out.println("enter the valid option");
			}
		}
	}
}

