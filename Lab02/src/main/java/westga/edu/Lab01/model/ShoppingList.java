package main.java.westga.edu.Lab01.model;

import java.util.ArrayList;
import main.java.westga.edu.Lab01.model.ShoppingItem;

public class ShoppingList {
	
	private ArrayList<ShoppingItem> shopList;
	
	public ShoppingList() {
		this.shopList = new ArrayList<ShoppingItem>();
		
	}
	
	public void addItem(ShoppingItem item) {
		this.shopList.add(item);
	}	
	
}