package ArrayList;

public class Student {
	String name;
	int rollno;
	int marks;
	public Student(String name, int rollno, int marks) 
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println(name + " "+rollno+" "+marks);
	}
}
