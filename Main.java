package com.company;
import java.util.*;

public class Main {
    static int ORDERTIME=30;
    public static void main(String[] args) {
	boolean done = false;
        Scanner sc= new Scanner(System.in);
	while (!done){
	    System.out.println("Enter number of orders: ");
	    int numorder= sc.nextInt();
        cheese [] orders =  new cheese[numorder];
        System.out.println ("Please enter your first name: ");
        String ordername= sc.next();
        for (int i=0; i <numorder; i++){
            System.out.println ("Enter '1' for pepperoni or '2' for cheese: ");
            int type= sc.nextInt();
            switch(type){
                case 1:
                pep p1= new pep (ordername);
                orders[i]= p1;
                break;

            case 2:
                cheese p2= new cheese (ordername);
                orders[i]=p2;
                break;

            default :
                i--;
                System.out.println ("please enter a valid number");
            }

        }
        double totalPrice = 0;
        System.out.println("Your name is: " +ordername);
        System.out.println ("Your ordernumber is: " +ordername.substring(0,1)+(int)(Math.random()*100+1));
        for (int i=0; i <numorder; i++) {
            System.out.println("Pizza " + (i+1) + ":");
            orders[i].print();
            totalPrice += orders[i].getPrice();

        }
        System.out.println ("total price: "+ totalPrice);
        System.out.println("your ordertime is less than "+ ORDERTIME);
        System.out.println ("Would you like to make a new order? (y/n)" );
        String choice= sc.next();
        if (choice.equals("n")){
            done= true;
    }
    }

    }
}
