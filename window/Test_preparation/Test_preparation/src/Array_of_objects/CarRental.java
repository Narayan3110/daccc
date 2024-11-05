package Array_of_objects;

class Car
{
	String carmodel;
	int regno;
	int rentpn;
	boolean availability = true;
	public Car(String carmodel, int regno, int rentpn, boolean availability) 
	{
		this.carmodel = carmodel;
		this.regno = regno;
		this.rentpn = rentpn;
		this.availability = availability;
	}
	void displayDetails()
	{
		System.out.println("carmodel : "+carmodel);
		System.out.println("regno : "+regno);
		System.out.println("rent per day : "+rentpn);
		System.out.println("availability : "+(availability ? "Available":"Not"));
		System.out.println();
	}
}
public class CarRental {
	public static void main(String[] args) 
	{
		carManagement cr = new carManagement();
		cr.createObjectArray();
		cr.displayCar();
		cr.rentcar();
		cr.returnCar();
	}
}

