package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	Student[] s;
	ArrayList<Student> createObjectArray()
	{
		ArrayList<Student> al=new ArrayList<Student>(); 
		System.out.println("enter the no of students u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the rollno");
			int rollno = sc.nextInt();
			System.out.println("enter the marks");
			int marks = sc.nextInt();
			
			s[i] = new Student(name,rollno,marks);
			al.add(s[i]);
		}
		return al;
	}
	
	void displayStudent(ArrayList<Student> al)
	{
		for(Student ele :al)
		{
			ele.display();
		}
	}
	void removeStudent(ArrayList<Student> al)
	{
		System.out.println("enter the name you want to remove");
		Scanner sc = new Scanner(System.in);
		String nameremove = sc.next();
		int pos =0;
		for(Student ele :al)
		{
			if(ele.name == nameremove)
			{
				pos = al.indexOf(ele);
			}
			al.remove(pos);
			System.out.println("given object is removed");
		}
	}
	void updateStudent(ArrayList<Student> al)
	{
		System.out.println("enter the name you want to update");
		Scanner sc = new Scanner(System.in);
		String nametoupdate = sc.next();
		System.out.println("enter the new marks");
		int newmarks = sc.nextInt();
		for(Student ele : al)
		{
			if(ele.name.equalsIgnoreCase(nametoupdate))
			{
				ele.marks = newmarks;
			}
		}
	}
	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();
		ArrayList<Student> al = null;
		while(true)
		{
			System.out.println("1. add data in list \n2. display data of the list \n3. remove element from the list \n4.update element in the list \n");
			Scanner sc = new Scanner(System.in);
			int option =sc.nextInt();
			switch(option)
			{
			case 1:
				al =sm.createObjectArray();
				break;
			case 2:
				sm.displayStudent(al);
				break;
			case 3:
				sm.removeStudent(al);
				break;
			case 4:
				sm.updateStudent(al);
				break;
			default:
				System.out.println("hiii");
			}
		}
	}
}
