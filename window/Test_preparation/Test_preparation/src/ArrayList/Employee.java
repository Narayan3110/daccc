package ArrayList;

public class Employee {
	int eid;
	String name;
	float sal;
	public Employee(int eid, String name, float sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	void despEmployee()
	{
		System.out.println(eid+ " "+name+" "+sal);
	}
}
