package assignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Staff {
	private StaffMember [] staffList;
	
	public void payday() {
		
	}
	
}

abstract class StaffMember{
	
	protected String nane;
	protected String address;
	protected String phone;
	
	public String toString() {
		return " ";
	}
	
	abstract public double pay();
	
}


class volunteer extends StaffMember{
	
	public double pay() {
		return 0;
	}
	
}


class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	public String toString() {
		return " "; 
	}
	
	public double pay() {
		return 0;
	}
	
}


class Executive extends Employee{
	private double bonus;
	
	public void awardBonus(double execBonus) {
		
	}
	
	public double pay() {
		return 0;
	}
}


class Hourly extends Employee{
	private int hoursWorked;
	
	public void add(int moreHours) {
		
	}
	
	public double pay() {
		return 0;
	}
	
	public String toString() {
		return " ";
	}
}

