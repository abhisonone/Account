package com.demo.service;

import java.util.Scanner;

//	import com.demo.beans.Account;
//	import com.demo.beans.DematAccount;
//	import com.demo.beans.SavingAccount;
import com.demo.beans.*;

public class AccountService  {
	private static Account[] arr=new Account[10];//Account array
	private static int count;
	static{
		arr[0]=new SavingAccount(4,"priiii","222277",4444,32000,"AB000");
		arr[1]=new SavingAccount(5,"vinu","715877",5555,40000,"BC111");
		arr[2]=new SavingAccount(6,"taufu","745677",6666,50000,"CD555");
		arr[3]=new DematAccount(1,"Abbby","77777",1111,20000,0.2f);
		arr[4]=new DematAccount(2,"Sidd","127777",2222,25000,0.3f);
		arr[5]=new DematAccount(3,"shailu","45777",3333,22000,0.4f);
	
	count=6;
	}
	//this will withdraw amount if pin matched else return false
	public static void withdrawAmt(int acc, int pin, float amt) {
		Account ac=SearchAcc(acc);
		if(ac!=null) {
			if(ac.getPin()==pin) {
				ac.withdraw(amt);//1st goes into acc class,then SA/DA class
				System.out.println("chal nikal lvd..");
			}
			else {
				System.out.println("plz barabr pin daliye :)");
			}
		}
		
	}
	public static void depositeAmt(int acc,float amt) {
		Account ac=SearchAcc(acc);
		if(ac!=null) {
			if(ac.getId()==acc){
				ac.deposite(amt);
				System.out.println("chal nikal lvd..");
			}
			else {
				System.out.println("type amount plz :)");
			}
		}
	}
	//this will search account and return account object if found 
	//else return null
	public static Account SearchAcc(int acc)
	{
		    for(int i=0;i<count;i++){
			    if(acc==arr[i].getId()){
			          return arr[i];
			}
		}
		return null;
	}
		
		public static void checkBalance(int acc, int pin) {
			Account ac=SearchAcc(acc);
			if(ac!=null ) {
			if(ac.getPin()==pin) {
			System.out.println(ac.getBalance());
		}
			else {
				System.out.println("pin tho sahil dal bc");
		}
	}
			else {
				System.out.println("acc bana le bhai pahile");
		}
}
	

	//this will change pin num if account found else return false
	public static void changePin(int acc, int pin, int newpin) {
		// TODO Auto-generated method stub
		Account ac=SearchAcc(acc);
		if(ac!=null && ac.getPin()==pin){
			ac.setPin(newpin);
			System.out.println("password changed");
		}
		else {
			System.out.println("enter appropriate credetials");
		}
	}
	
	public static void createAccount(Account ac[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter name");
		    String name=sc.nextLine();
			System.out.println("enter address");
			sc.nextLine();
			String Address=sc.nextLine();
			System.out.println("enter mobile");
			String mobile=sc.next();
			System.out.println("enter strong pin");
			int pin1=sc.nextInt();
		
			}
		
	}
	public static void displayAccount() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
		
		
	}



