package Array_of_objects;

import java.util.Scanner;

class Library
{
	String BookList;
	String MemberList;
	public Library(String bookList, String memberList) 
	{
		BookList = bookList;
		MemberList = memberList;
	}
	void displayDetails()
	{
		System.out.println("Details of the library are : ");
		System.out.println("BookList " + BookList);
		System.out.println("MemberList "+MemberList);
	}
}
public class librarymain {
	public static void main(String[] args) {
		libraryManagement lm= new libraryManagement();
		lm.createObjectArray();
		for(;;)
		{
			System.out.println("enter what option you want /1.Display details /2.serachBook /3.issueBook /4.returnBook");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				lm.Display();
				break;
			case 2:
				lm.searchBook();
				break;
			case 3:
				lm.issueBook();
				break;
			case 4:
				lm.returnBook();
				break;
			default : 
				System.out.println("enter the valid option");
			}
		}
	}
}
