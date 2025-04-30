package main.java.westga.edu.Lab01.model;

/**
 * this class will create a Shopping item which can be added to a list 
 *
 */
public class ShoppingItem {
	
	private String itemName;
	private int quantity;
	
	/**
	 * the constructor will accept one parameter for the item Name
	 * @param itemName takes a param of itemName
	 * @precondition itemName cannot be empty itemName cannot be null
	 */
	public ShoppingItem(String itemName) {
		if(itemName.equals(null)) {
			throw new IllegalArgumentException("Item cannot be null");
		}
		if(itemName.equals("")) {
			throw new IllegalArgumentException("Item cannot be empty");
		
		}
		this.itemName = itemName;	
		this.quantity = 0;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public void setItemQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getItemQuantity() {
		return this.quantity;
	}
	
	public String toString() {
		return this.getItemName() + " qty." + this.quantity; 
	}
	
}