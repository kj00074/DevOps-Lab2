package main.java.westga.edu.Lab01.model;

public class ShoppingItem {
	
	private String itemName;
	private String itemPrice;
	
	public ShoppingItem(String itemName, String itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public String getItemPrice() {
		return this.itemPrice;
	}
	
	public String toString() {
		return this.getItemName() + " $" + this.getItemPrice();
	}
	
}