package com.oms.dto;

public class Order {
private String itemName;
private int quantity;
private double itemPrice;
private String orderId;
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getItemPrice() {
	return itemPrice;
}
public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}

}
