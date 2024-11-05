package Array_of_objects;

import java.util.Scanner;

public class libraryManagement 
{
	Library[] l;
	void createObjectArray()
	{
		l = new Library[3];
		System.out.println("enter the details of the library");
		for(int i=0;i<l.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the "+i+" book");
			String BookList = sc.next();
			System.out.println("enter the "+i+ "member");
			String MemberList = sc.next();
			
			l[i] =new Library(BookList,MemberList);
		}
	}
	public void Display()
	{
		for(int i=0;i<l.length;i++)
		{
			l[i].displayDetails();
		}
	}
	public void searchBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the title of the book");
		String title = sc.next();
		for(int i =0;i<l.length;i++)
		{
			if(l[i].BookList.equals(title))
			{
				System.out.println("book "+title+" serached successfully");
				break;
			}
			System.out.println("book not fond");
		}
	}
	public void issueBook()
	{
		System.out.println("enter the title of the book u want to take");
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		for(int i=0;i<l.length;i++)
		{
			if(l[i] !=null && l[i].BookList.equals(title))
			{
				System.out.println("book "+title+" is isuued to you successfully");
				break;
			}
			System.out.println("book not found");
		}
	}
	public void returnBook()
	{
		System.out.println("enter the title of the book u want to take");
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		for(int i=0;i<l.length;i++)
		{
			if(l[i].BookList.equals(title))
			{
				System.out.println("book "+title+" is returned");
				break;
			}
			System.out.println("book not found");
		}
	}
}
