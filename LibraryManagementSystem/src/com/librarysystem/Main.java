package com.librarysystem;

import java.util.Scanner;



public class Main {
	

	public static void main(String[] args) {
		
		 Scanner obj=new Scanner(System.in);

	        int choice =0;

	        while(choice !=3){

	        	 System.out.println("Enter 1- for Student Details: ");
	        	 System.out.println(" Enter 2- for Available Books: ");
	        	 System.out.println(" Enter 3- for Book Deatils: ");
	        	 
	        	
	    	        
	            choice =obj.nextInt();

	            if (choice == 1) {
	            Student obj1=new Student();
	                System.out.println("Enter student's name");
	            obj1.name=obj.nextLine();obj1.name=obj.nextLine();
	                System.out.println("Enter the Department name");
	                obj1.dept=obj.nextLine();
	                System.out.println("Enter university id");
	                obj1.uni_id=obj.nextLine();
	                System.out.println("Enter the User id");
	                obj1.uid=obj.nextLine();
	                System.out.println("In which semester do you study:");
	                obj1.sem=obj.nextInt();

	                obj1.getdata(obj1.name, obj1.dept, obj1.uid,obj1.uni_id,obj1.sem);
	                obj1.setdata();
	            }
	            else if(choice ==2){
	                Books obj2=new Books();

	                obj2.chemistry();
	                obj2.physics();
	                obj2.biology();
	                
	              

	            }
	            else {
	            	Library obj3=new Library();
	            	obj3.add();
	   
	            	Library obj4=new Library();
	            	obj4.iss();
	            	
	            	Library c=new Library();
	            	c.ret();
	            	
	            	
	            	
	    	        	
	    	        

	    	        }
	            }
	        }
	    	    	}
	        
	
	    