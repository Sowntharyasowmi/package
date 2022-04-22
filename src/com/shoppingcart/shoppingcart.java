package com.shoppingcart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class shoppingcart {
        public static void main(String[] args) {

            Product p1=new Product(1,"AC",55000);
            Product p2=new Product(2,"TV",34000);
            Product p3=new Product(2,"FRIDGE",18000);
            //creating arraylist for products
            List<Product> products=new ArrayList<>();
            //adding products to the list
            products.add(p1);
            products.add(p2);
            products.add(p3);
            customer c1=new customer(01,"sahityan","tnd","875724195");
            //creating order one
            Order or1=new Order(products,22,01);
            c1.addOrders(or1);
            //clear the products in the list
            products.clear();
            products.add(p1);
            //creating order two
            Order or2=new Order(products,33,01);
            c1.addOrders(or2); //add orders to customer

            Iterator<Order> itr= c1.getOrder().iterator();
            int totalAmount=0;
            while (itr.hasNext()){
                Order ord=(Order) itr.next();
                totalAmount += ord.getAmount();
            }
            System.out.println("total amount is"+ "   "  +totalAmount);
        }
    }

