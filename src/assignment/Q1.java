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
	
	protected String name;
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


class Commission extends Hourly{
	private double totalSales;
	private double commissionRate;
	
	/*(the commission rate will be type double and will represent the percent (in
	decimal form) commission the employee earns on sales (so .2 would mean the
			employee earns 20% commission on sales)).*/
	
	Commission (String name, String address, String phoneNumber, String socialSecurityNumber,double payRate, double commissionRate){
		super(name, address, phoneNumber, socialSecurityNumber, payRate); 
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales+= totalSales;
	}
	
	public double pay() {
		
	}
	
}

