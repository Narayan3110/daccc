package DBDA_HASHMAP;

public class CDAC {
	int id;
	String name;
	int age;
	float sal;
	public CDAC(int id, String name, int age, float sal) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	void display()
	{
		System.out.println(id + " "+name+ " "+age + " "+sal);
	}
}
