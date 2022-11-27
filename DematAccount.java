package com.demo.beans;

public class DematAccount extends Account {
	private static float int_rate;
	private float commission;
	static {
		int_rate=0.05f;
		}
	
	public DematAccount(){
		this.commission=0;
	}

	public DematAccount(int id, String name, String mobile, int pin, float balance,float comm) {
		super(id, name, mobile, pin, balance);
		this .commission=comm;
	}

	public static float getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(float intrate) {
		int_rate = intrate;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	
	public String toString() {
		return "\n"+super.toString()+"DematAccount [commission=" + commission + "]";
	}
	
	public void withdraw(float amount) {
		if(amount<=5000) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("isse jyada mat nikal bhai");
		}
	}
	public void deposite(float Amount) {
		if(Amount>=0) {
			balance=balance+Amount;
		}
		else {
		System.out.println("money deposited");
	  }
   }
	
	

}
