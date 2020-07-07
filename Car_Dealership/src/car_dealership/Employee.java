package car_dealership;

public class Employee {
	public void handlecustomer( Customer cust,Boolean Finance, Vehicle vehicle) {
		if(Finance == true ) {
			double loanammount = vehicle.getPrice() - cust.getcashonhand();
		runcredithistory (cust,loanammount);
	
		}
		else if (vehicle.getPrice()<= cust.getcashonhand()) {
			//customer pays in cash 
			processtransaction(cust,vehicle);
		}
		else
			System.out.println("Customer will need more money to purchase vehicle : " +vehicle );
		
	}
	
	public void runcredithistory (Customer cust, Double loanammount) {
		System.out.println("Ran credit history for customer");
		System.out.println("Customer has been approved to purchase the vehicle ");
		
	}
	public void processtransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle " +vehicle+" for the price "+vehicle.getPrice());
	}

}
