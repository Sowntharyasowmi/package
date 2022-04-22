package com.shoppingcart;

public class Product {
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    private int productId;
    private String productName;
    private int productPrice;
    Product(int productId,String productName,int productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
}

