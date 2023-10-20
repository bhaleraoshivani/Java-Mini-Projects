package com.shivani;

import java.util.Scanner;

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String cName,String cID)
	{
		customerName = cName;
		customerID = cID;
	}
	
	void  deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdrow(int amount)
	{
		if(amount !=0)
		{
			balance = balance - amount;
			previousTransaction = amount;
		}
		
	}
	
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited : "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdrow : "+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction is occured");
		}
	}
	
	
	void showMenu()
	{
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		Character.toUpperCase(option);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is : "+customerID);
		
		System.out.println();
		
		
		System.out.println("A.Check Balance");
		System.out.println("B.Deposite");
		System.out.println("C.Withdrow");
		System.out.println("D.Prevoius Transaction");
		System.out.println("E.Exit");
		
		do
		{
			System.out.println("=====================================");
			System.out.println("Enter the Option");
			System.out.println("=====================================");
			
			option = sc.next().charAt(0);	
			
			switch(option)
			{
			   case 'A' :
				   System.out.println("=====================================");
				   System.out.println("Balance is :"+balance);
				   System.out.println("=====================================");
				   System.out.println();
				   break;
				   
			   case 'B' :
				   System.out.println("=====================================");
				   System.out.println("Enter the amount to deposit");
				   System.out.println("=====================================");
				   int amount = sc.nextInt();
				   deposit(amount);
				   System.out.println();
				   break;
				   
			   case 'C' :
				   System.out.println("=====================================");
				   System.out.println("Enter the amount to Withdrow");
				   System.out.println("=====================================");
				   int amount1 = sc.nextInt();
				   withdrow(amount1);
				   System.out.println();
				   break;
				   
			   case 'D' :
				   System.out.println("=====================================");
				   getpreviousTransaction();
				   System.out.println("=====================================");
				  
				   System.out.println();
				   break;
				   
			   case 'E' :
				   System.out.println("=====================================");
				   System.out.println();
				   break;
				   
			   default:
				  ;
				   System.out.println("Invalid o[ption !!!!!!!");
				   break;
				   
			}
			
		}while(option !='E');
	}	
}




public class BankingApplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount("Shivani","101");
		bank.showMenu();
		

	}

}

