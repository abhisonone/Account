package com.demo.beans;

public class SavingAccount extends Account {
	private static float int_rate;
	private static int minBal;
	private String chkBN;
	
	static {
		int_rate=0.08f;
		minBal=500;
	}
	public SavingAccount() {
		super();
		this.chkBN=null;
	}
	public SavingAccount(int id, String name, String mobile, int pin, float balance,String cbnum)
	{
		super(id, name, mobile, pin, balance);
		this.chkBN=cbnum;
	}
	public static float getInt_rate() {
		return int_rate;
	}
	public static void setInt_rate(float intrate) {
	         int_rate = intrate;
	}
	public static int getMinBal() {
		return minBal;
	}
	public static void setMinBal(int minBal) {
		SavingAccount.minBal = minBal;
	}
	public String getChkBN() {
		return chkBN;
	}
	public void setChkBN(String chkBN) {
		this.chkBN = chkBN;
	}
	public String toString()
	{
		return super.toString()+"Chkbooknum: "+chkBN;
	}
	public void withdraw(float Amount) {
		if(balance-Amount>minBal) {
			balance=balance-Amount;
		}
		else {
		System.out.println("limit exceed above minimum balance");
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
