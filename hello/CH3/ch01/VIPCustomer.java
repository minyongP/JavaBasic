package ch01;

public class VIPCustomer extends Customer {

//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	double saleRatio;
	String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}
}
