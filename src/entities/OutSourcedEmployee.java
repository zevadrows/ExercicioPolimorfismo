package entities;

public class OutSourcedEmployee extends Employee {

	double additionalCharge;
	
	public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge*110/100;
	}
	

}
