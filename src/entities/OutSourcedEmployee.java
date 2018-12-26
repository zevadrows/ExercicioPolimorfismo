package entities;

public class OutSourcedEmployee extends Employee {

	double additionalCharge;
	
	public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return (this.getHours() * this.getValuePerHour()) + additionalCharge*110/100;
	}
	

}
