package ch04;

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
		
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= (int)(price*saleRatio);
		return super.calcPrice(price);
	}



	public String getAgentID() {
		return agentID;
	}
}
