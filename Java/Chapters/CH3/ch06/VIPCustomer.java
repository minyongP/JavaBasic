package ch06;

public class VIPCustomer extends Customer {



	double saleRatio;
	String agentID;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		saleRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";

		
		
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
