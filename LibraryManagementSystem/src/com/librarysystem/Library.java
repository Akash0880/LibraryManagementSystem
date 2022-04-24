package com.librarysystem;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Library {
	
		static String str,b,date,date1;
		                                     
    	static int a,c;
    	void add()
    	{
    		System.out.println("Enter book name,price and Book_no");
    		Scanner obj3=new Scanner(System.in);
    		String str =obj3.nextLine();
    		float price=obj3.nextInt();
    		int bookno=obj3.nextInt();
    		System.out.println("your details is " + str +","+ price +","+ bookno +".");
    	}
    	void iss() {
    		Scanner obj4=new Scanner (System.in);
    		System.out.println("Book Name");
    		str=obj4.nextLine();
    		System.out.println("Book Id");
    		a=obj4.nextInt();
    		System.out.println("issue date");
    		date=obj4.next();
    		System.out.println("Total number of book Issused");
    		c=obj4.nextInt();
    		System.out.println("Return book date");
    		date1=obj4.next();
    		
    	}
    	
    	int getid() {
    		return a;
    	}

    	void ret() {
    		System.out.println("Book_Id");
    		Scanner c = new Scanner(System.in);
    		int bookid=c.nextInt();
    		if(a==bookid) {
    			System.out.println("Total Details");
    			System.out.println("Book Name: " + Library.str );
    			System.out.println("Book id: " + Library.a );
    			System.out.println("Total number of book issued: " + Library.c);
    			System.out.println("Book issue date: " + Library.date);
    			System.out.println("Book Return date: " + Library.date1);
    			
    			
    		}
    		else
    		{
    			System.out.println("Wrong id, plc Enter te correct id. ");
    		}
    	}
    	

}
