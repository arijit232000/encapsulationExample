package com.arijit.watchpack;

import java.util.Scanner;

public class WatchDetails {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Watch w = null;
		boolean flag = true;
		do {
			System.out.println("   ************************\n +< WELCOME TO WATCH WORLD >+\n   ************************\n Enter Options\n ---------------- \n"
					+ " 1.Add Watch \n 2.Display watch\n 3.Display Price\n 4.Modifie Color\n 5.Exit");
			int option = scn.nextInt();
			switch(option) {
			case 1:{
				  System.out.println("Enter Model Name: ");
				  String name = scn.next();
				  System.out.println("Enter Price: ");
				  double price = scn.nextDouble();
				  System.out.println("Enter Color: ");
				  String color = scn.next();
				   w = new Watch(name, price, color);
				   System.out.println("watch Added Sucessfully");
				   System.out.println("*----------------------------------------------*");
			}break;
			case 2:{
				  if (w==null) {System.out.println("No Watch Found plz Add Watch first ");
				  System.out.println("*----------------------------------------------*");
				  }
				  else { 
					  w.displayDetails();
					  System.out.println();
					   System.out.println("*----------------------------------------------*");
				  }
			}break;
			 case 3:{
				 if (w==null) {
					 System.out.println("Watch Price not Found plz Add Watch first");
					 System.out.println("*----------------------------------------------*");
				 }
				 else {
					 w.getPrice();
					 System.out.println("*----------------------------------------------*");
				 }
				 }break;
			 case 4:{
				 if(w==null) {
					 System.out.println("Plz Add Watch first");
					 System.out.println("*----------------------------------------------*");
				 }
				 else {
					 System.out.println("Enter New Color: ");
					 String color = scn.next();
					 System.out.println("previous Color: "+w.getColor());
					 w.setColor(color);
					 System.out.println( "Modified Color"+w.getColor());
					 System.out.println("*----------------------------------------------*");
					 
				     }
				 }break;
			 case 5:{
				    flag=false;
				   System.out.println("*--* Thank You Visiting Again *--*");
				   }break;
				   default:{
					   System.out.println("Enter valid Option");
				   }break;
			}
			
			
		}while(flag);
            scn.close();
	}

}
