package main.java.westga.edu.Lab01.model;

public class ShoppingItem {
	
	private String itemName;
	private double itemPrice;
	
	public ShoppingItem(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
}