package ch03;

public class VIPCustomer extends Customer {



	double saleRatio;
	String agentID;
	
	/*
	 * public VIPCustomer() {
	 * super(0, "no-name");
	 * bonusRatio = 0.05;
	 * saleRatio = 0.1;
	 * customerGrade = "VIP";
	 * 
	 * System.out.println("VIPCustomer() call"); }
	 */
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}
}
