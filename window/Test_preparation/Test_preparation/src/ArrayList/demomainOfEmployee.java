package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class demomainOfEmployee {
	public static void main(String[] args) {
		EmployeeManagement em = new EmployeeManagement();
		ArrayList<Employee> al = null;
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("1. add data in list \n2. display data of the list \n3. remove element from the list \n4.update element in the list \n");
			int op =sc.nextInt();
			switch(op)
			{
			case 1:
				al = em.createEmpObject();
				break;
			case 2:
				em.displayEmpObject(al);
				break;
			case 3:
				em.RemoveEmpObject(al);
				break;
			case 4:
				em.UpdateEmpObject(al);
				break;
			default:
				System.out.println("hiiii");
			}
		}
	}
}
