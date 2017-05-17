package com.company;
import java.util.*;

/**
 * Created by samch on 5/11/2017.
 */
public class cheese {
    private String ordername;
    private double price;
    public cheese() {
        ordername = "";

        price= 12;
    }
    public cheese (String name){
        ordername = name;

        price = 12;
    }
    public String getOrdername (){
        return ordername;
    }
    public double getPrice (){
        return price;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }
    public void setPrice (Double price){
        this.price= price;
    }
    public void print (){
        System.out.println("pizza types: cheese");
        System.out.println ("price: " + getPrice());

    }
}




