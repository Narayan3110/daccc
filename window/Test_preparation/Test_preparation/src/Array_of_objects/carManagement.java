package Array_of_objects;

import java.util.Scanner;

public class carManagement {
	Car[] c;
	void createObjectArray()
	{
		c=new Car[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("enter the details of the car");
			System.out.println("enter carmodel");
			String carmodel = sc.next();
			System.out.println("enter the regno");
			int regno = sc.nextInt();
			System.out.println("enter the rentpn");
			int rentpn = sc.nextInt();
			System.out.println("enter the availability of the car");
			boolean availability = sc.nextBoolean();
			
			c[i] =new Car(carmodel,regno,rentpn,availability);
		}
	}
	void displayCar()
	{
		for(int i=0;i<c.length;i++)
		{
			c[i].displayDetails();
		}
	}
	void rentcar()
	{
		System.out.println("enter the carmodel u want to book");
		Scanner sc = new Scanner(System.in);
		String carUwant = sc.next();
		boolean availability =false;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != null)
			{
				if(c[i].carmodel.equals(carUwant))
				{
					availability = true;
					c[i].availability = false;
					System.out.println("carmodel " + carUwant +" has booked successfully");
				}
				else
				{
					System.out.println("carmodel " + carUwant +" is already booked");
				}
				break;
			}
		}
		if(!availability)
		{
			System.out.println("carmodel " + carUwant +" is not found");
		}
	}
	void returnCar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the car u want return");
		String returnCar = sc.next();
		boolean availability = false;
		for(int i=0;i<c.length;i++)
		{
			if(c[i].carmodel.equals(returnCar))
			{
				availability =true;
				c[i].availability = true;
				System.out.println("Booking for car " + returnCar + " has been successfully canceled.");
			}
			else
			{
				System.out.println("Booking for car " + returnCar + " was not booked.");
			}
			break;
		}
	}
}
