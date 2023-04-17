package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CartTest {

    //Test Case 1: Given that I a new shopper, when I begin shopping, then I expect my cart to be empty.
    @Test
    public void emptycart(){
        //Setup
        int items=0;
        //Execute
        Cart cart=new Cart();
        int item=cart.getItem();
        //assert
        assertEquals(items, item);
    }

    //Test Case 2: 
    @Test
    public void SumOfItems(){
        //Setup
        int items=1400;
        //Execute
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,2);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getTotalSum();
        //Asset
        assertEquals(items, sum);
    }

    //Test 3:
    @Test
    public void SumOfQty(){
        //Setup
        int Qty=3;
        //Execute
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,1);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getQtyUpdate();
        //Asset
        assertEquals(Qty, sum);
    }

    //Test Case 4:
    @Test
    public void PriceAndQty(){
        //Setup
        int Qty=2;
        //
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,1);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getPriceAndQty();
        //Asset
        assertEquals(Qty, sum);

    }

    @Test
    public void ItemOnSale(){
        boolean sale=true;
        Cart cart=new Cart();
        ItemSale item1 = new ItemSale("Meezan oil", 400,4, true);
        ItemSale item=new ItemSale();
        cart.addItem(item1);
        boolean saleItems=item.onSale();
        assertEquals(saleItems, sale);
    }

    @Test
    public void UpdatedList(){
        int list=0;
        ItemSale item1 = new ItemSale("Meezan oil", 400, 4,true);
        Cart cart=new Cart();
        cart.addItem(item1);
        cart.removeItem("Meezan Oil");
        int result=cart.getItem();
        assertEquals(list,result);        
    }

    @Test
    public void RemoveQty(){
        int list=0;
        ItemSale item1 = new ItemSale("Meezan oil", 400, 4,true);
        Cart cart=new Cart();
        cart.addItem(item1);
        cart.removeQty(1);
        int result=cart.getQtyUpdate();
        assertEquals(list,result);

    }


}

   
