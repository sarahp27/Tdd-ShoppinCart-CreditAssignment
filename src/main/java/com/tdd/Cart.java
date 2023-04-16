package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<ItemSale> items;
    List<Cart> cart;
    String item_name;
    int price;
    int qty;
    
    public Cart(String item_name,int price,int qty){

        this.item_name=item_name;
        this.price=price;
        this.qty=qty;
    }
    public Cart(){
        cart=new ArrayList<>();
        items=new ArrayList<>();
    }
    public int getItem() {
        return cart.size();
    }
}