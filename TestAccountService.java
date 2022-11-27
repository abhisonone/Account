package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.service.AccountService;

  public class TestAccountService {

		public static void main(String[] args) {
			int choice=0;
			Scanner sc=new Scanner(System.in);
			do{
				System.out.println("Menu:\n1.Withdraw Amount\n2.Deposit Amount\n"
						+ "3.Check Balance\n4.Change pin num\n"
						+ "5.Open new account\n6.Exit");
				System.out.println("choice:");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Account no:");
					int acc=sc.nextInt();
					System.out.println("Enter pin no:");
					int pin=sc.nextInt();
					System.out.println("Enter amount :");
					float amt=sc.nextFloat();
					AccountService.withdrawAmt(acc,pin,amt);
					break;
				case 2:
					System.out.println("Enter Account no:");
					int acc2=sc.nextInt();
					System.out.println("Enter amount :");
					float amt2=sc.nextFloat();
					AccountService.depositeAmt(acc2,amt2);
					break;
					
				case 3:
					System.out.println("enter acc: ");
					int acc1=sc.nextInt();
					System.out.println("enter pin: ");
					int pin1=sc.nextInt();
					AccountService.checkBalance(acc1, pin1);
					break;
				case 4:
					System.out.println("Enter accno:");
					acc1=sc.nextInt();
					System.out.println("Enter old pin num");
					pin=sc.nextInt();
					System.out.println("Enter new pin no:");
					int newpin=sc.nextInt();
					AccountService.changePin(acc1,pin,newpin);
					
					break;
				case 5 :
					AccountService[] ob1=new AccountService[2];
					AccountService.createAccount();
					//System.out.println(arr[i]);
					AccountService.displayAccount();
					
				case 6:
					System.out.println("Thank you for using the system!!");
				    sc.close();	
				    break;

				}
			}while(choice!=6);

		}

	}
	
			


