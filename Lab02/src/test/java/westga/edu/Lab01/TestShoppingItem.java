package westga.edu.Lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.westga.edu.Lab01.model.ShoppingItem;


class TestShoppingItem {
	
	@Test
	void TestShoppingItemGetItem() {
		ShoppingItem myItem = new ShoppingItem("apple");
		
		String actual = myItem.getItemName();
		
		assertEquals("apple", actual);
	}	
	
	@Test
	void TestShoppingItemToString() {
		ShoppingItem myItem = new ShoppingItem("apple");
		
		String actual = myItem.getItemName();
		
		assertEquals("apple", actual);
	
	}

}