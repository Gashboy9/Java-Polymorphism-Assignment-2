package assignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff staff = new Staff (8);
		
		Commission ce1 = new Commission("Gabriel", "3rd Street", "0276345055", "SSN001", 6.25, 0.2);
		Commission ce2 = new Commission("Michael", "82th Lane", "0548526325", "SSN0101", 9.75, 0.15);
		
		staff.staffList[0] = ce1;
		staff.staffList[1] = ce2;
		
		ce1.addHours(35);
		ce1.addSales(400);
		
		ce2.addHours(40);
		ce2.addSales(950);
		
		System.out.println(ce1);
		System.out.println(ce2);
		
		
	}

}


class Staff {
	StaffMember [] staffList;
	
	Staff (int size){
		this.staffList = new StaffMember[size];
	}
	
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

	Hourly(String name, String address, String phoneNumber, String socialSecurityNumber, double payRate) {
		this.name = name;
		this.address = address;
		this.phone = phoneNumber;
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}

	public void addHours(int moreHours) {
		this.hoursWorked+= moreHours;		
	}
	
	public double pay() {
		return hoursWorked * payRate ;
	}
	
	public String toString() {
		return "Total hours worked: " + hoursWorked;
	}
}


class Commission extends Hourly{
	private double totalSales;
	private double commissionRate;
	
	Commission (String name, String address, String phoneNumber, String socialSecurityNumber,double payRate, double commissionRate){
		super(name, address, phoneNumber, socialSecurityNumber, payRate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales+= totalSales;
	}
	
	public double pay() {
		double p = super.pay()+ (totalSales * commissionRate);
		return p;
	}
	
	public String toString() {
		return super.toString() + " Total sales: "+totalSales;
	}
	
}

