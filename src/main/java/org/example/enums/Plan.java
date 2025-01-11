package org.example.enums;

public enum Plan {

    BASIC();
    private String name;
    private double price;



    public  String getName(){
        return  name;
    }

    public  double getPrice(){
        return  price;
    }
}
