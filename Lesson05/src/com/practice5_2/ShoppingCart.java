package com.practice5_2;

public class ShoppingCart {

    public static void main (String[] ars){
        String custName = "Mary Smith";
        String message;

        String[] items = {"Shirt", "Socks", "Scraf", "Belt"};

        message = custName + " want to purchase " + items.length + " items.";

        System.out.println(items[2]);
        System.out.println(items[items.length-1]);
    }
}
