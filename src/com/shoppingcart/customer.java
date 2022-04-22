package com.shoppingcart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class customer {
    public List<Order> getOrder() {

        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private List<Order> order=new ArrayList<>();
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    public customer(int customerId, String customerName, String customerAddress, String customerPhone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

    public void addOrders(Order order) {
        this.order.add(order);
    }

}
