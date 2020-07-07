package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashonhand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address+= "Dealership city";
		this.address = address;
	}
	public double getcashonhand() {
		return cashonhand;
	}
	public void setcashonhand(double cashonhand) {
		this.cashonhand = cashonhand;
	}
	public void purchasecar(Vehicle vehicle , Employee emp, boolean finance) {
		emp.handlecustomer(this, finance, vehicle);
	}
	}
	


