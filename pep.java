package com.company;

/**
 * Created by samch on 5/11/2017.
 */
public class pep extends cheese {
    public pep (){
        super ();
    }
    public pep (String ordername){
        super (ordername);
        setPrice((double) 14);
    }
    @Override
    public void print (){
        System.out.println("pizza types: pepperoni");
        System.out.println ("price: " + getPrice());
    }

}
