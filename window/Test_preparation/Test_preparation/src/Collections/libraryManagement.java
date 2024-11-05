package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class libraryManagement {
	public static void main(String[] args) {
		HashMap<Integer , librarymain> lb = new HashMap<>();
		librarymain l1 = new librarymain("success","harsh",100);
		librarymain l2 = new librarymain("jawan","pathan",200);
		librarymain l3 = new librarymain("da","ff",20);
		librarymain l4 = new librarymain("cc","dkad",400);
		
		lb.put(1, l1);
		lb.put(2, l2);
		lb.put(3, l3);
		lb.put(4, l4);
		// librarymain l;
		
		display(lb);
		addBook(lb);
		display(lb);
		removeBook(lb);
		display(lb);
	}
	static void display(HashMap<Integer,librarymain> lb)
	{
		for(Map.Entry<Integer, librarymain> ll : lb.entrySet())
		{
			System.out.print(ll.getKey()+" -->  ");
			librarymain l = ll.getValue();
			l.display();
		}
	}
	static void addBook(HashMap<Integer,librarymain> lb)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Bookid u want to add : ");
		int Bookid = sc.nextInt();
		if(lb.containsKey(Bookid))
		{
			System.out.println("book already present");
		}
		else
		{
			System.out.println("enter the book title");
			String title = sc.next();
			System.out.println("enter the book author");
			String author = sc.next();
			System.out.println("enter the book availableCopies");
			int availableCopies = sc.nextInt();
			
			librarymain newlib = new librarymain(title,author,availableCopies);
			lb.put(Bookid, newlib);
			System.out.println("book added successfully");
		}
	}
	static void removeBook(HashMap<Integer,librarymain> lb)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the booktitle u want to remove");
		String Booktitle = sc.next();
		for (Map.Entry<Integer, librarymain> entry : lb.entrySet())
		{
			 if (entry.getValue().title.equalsIgnoreCase(Booktitle)) {
		            lb.remove(entry.getKey());
	            System.out.println("Book with title '" + Booktitle + "' removed successfully.");
	            return;
	        }
		}
	}
}
