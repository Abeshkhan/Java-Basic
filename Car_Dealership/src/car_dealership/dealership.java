package car_dealership;

public class dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    java.util.Scanner sc =new java.util.Scanner(System.in);
    Customer cust1 = new Customer();
    cust1.setName("Mehrab Mohsin Khan");
    cust1.setAddress("35 Mirpur Road, Dhanmondi,Dhaka 1205");
    cust1.setcashonhand(12000);
    Vehicle vehi1=new Vehicle("corola","c-300",1000);
    
    Employee emp = new Employee();
    cust1.purchasecar(vehi1, emp , false);
    
		 
	}

}
