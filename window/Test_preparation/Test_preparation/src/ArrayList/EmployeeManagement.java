package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement 
{
	Employee[] em;
	ArrayList<Employee> createEmpObject()
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		System.out.println("enter the no. of employees u want to add");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		em = new Employee[n];
		System.out.println("enter the deatils of the employees");
		for(int i=0;i<em.length;i++)
		{
			System.out.println("enter eid");
			int eid = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter sal");
			float sal = sc.nextFloat();
			//al.add(new Employee(eid,name,sal));
			em[i] = new Employee(eid,name,sal);
			al.add(em[i]);
		}
		return al;
	}
	
	void displayEmpObject(ArrayList<Employee> al)
	{
		for(Employee ele : al)
		{
			ele.despEmployee();
		}
	}
	
	void RemoveEmpObject(ArrayList<Employee> al)
	{
		System.out.println("enter the eid u want to remove");
		Scanner sc = new Scanner(System.in);
		int iduwanttoremove = sc.nextInt();
		int pos = 0;
		for(Employee ele : al)
		{
			if(ele.eid == iduwanttoremove)
			{
				pos = al.indexOf(ele);
			}
		}
		al.remove(pos);
		System.out.println("given object is removed");
	}
	
	void UpdateEmpObject(ArrayList<Employee> al)
	{
		System.out.println("enter the eid u want to update ");
		Scanner sc = new Scanner(System.in);
		float iduwanttoupdate = sc.nextInt();
		System.out.println("enter the new salary");
		float newsal = sc.nextFloat();
		for(Employee ele : al)
		{
			if(ele.eid == iduwanttoupdate)
			{
				ele.sal = newsal;
			}
		}
	}
}
