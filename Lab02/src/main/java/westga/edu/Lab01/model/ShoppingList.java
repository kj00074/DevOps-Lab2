package main.java.westga.edu.Lab01.model;

import java.util.ArrayList;
import main.java.westga.edu.Lab01.model.ShoppingItem;

public class ShoppingList {
	
	private ArrayList<ShoppingItem> shopList;
	private int num;
	
	public ShoppingList() {
		this.shopList = new ArrayList<ShoppingItem>();
		this.num = 0;
		
	}
	
	/**
	 * this method will add a Valid item to shopping list
	 * @param item takes a param of item
	 * @precondition the name cannot be empty and the name cannot be null
	 */
	public void addItem(ShoppingItem item) {
		if(item.getItemName().equals(null)) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		
		if(item.getItemName().equals("")) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.shopList.add(item);
	}	
	
	public void removeItem(ShoppingItem item) {
		int index = this.shopList.indexOf(item);
		if(item.equals(null)) {
			throw new IllegalArgumentException("Item doesnt exist");
		}
		
		if(index >= 0) {
			this.shopList.remove(index);
		}
	}
	
	public void updateQuantity(ShoppingItem item, int quantity) {
		if(item.equals(null)) {
			throw new IllegalArgumentException("please select an item");
		}
		if(quantity <= 0) {
			throw new IllegalArgumentException("quantity must now be greater than 0");
		}
		if(item.equals(item)) {
			item.setItemQuantity(quantity);
		}
	}
	
	public String toString() {
		String result = "";
		
		for(int i = 0; i < this.shopList.size(); i++) {
			result = result + this.shopList.get(i) + System.lineSeparator();
		}
		return result;
	}
	
}