package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "Lee");
//		customerLee.setCustomerName("Lee");
//		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim ");
//		customerKim.setCustomerName("Kim");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		
//		vc.    Customer형으로만 가능
	}

}
