package com.shoppingcart;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    private List<Product> products=new ArrayList<>();
    private int orderId;
    private int amount;
    private int customerId;
    Order(List<Product>products,int orderId,int customerId){
        this.products=products;
        this.orderId=orderId;
        this.amount=this.calculateAmount(products);
        this.customerId=customerId;
    }
    public void addProduct(Product product){

        this.products.add(product);
    }
    private Integer calculateAmount(List<Product> products){
        int amount =0 ;
        for (Product product:products) {
            amount += product.getProductPrice();
        }
        return amount;
    }
}


