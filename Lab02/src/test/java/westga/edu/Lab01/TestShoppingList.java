package westga.edu.Lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.westga.edu.Lab01.model.ShoppingItem;
import main.java.westga.edu.Lab01.model.ShoppingList;

class TestShoppingList {
	
	@Test
	void testAddNullItem() {
		assertThrows(NullPointerException.class,
					 () -> {
							new ShoppingItem(null);
					 }
					 );
	}
	
	@Test
	void testAddEmptyItem() {
		assertThrows(IllegalArgumentException.class,
					 () -> {
							new ShoppingItem("");
					 }
					 );
	}
	
	@Test
	void testAddValidItem() {
		ShoppingItem myItem = new ShoppingItem("apple");
		ShoppingList myList = new ShoppingList();
		myList.addItem(myItem);
		
		String actual = myList.toString();
		
		assertEquals("apple qty.0" + System.lineSeparator(), actual);
	}
	
	@Test
	void testRemoveItem() {
		ShoppingItem myItem = new ShoppingItem("apple");
		ShoppingList myList = new ShoppingList();
		myList.addItem(myItem);
		myList.removeItem(myItem);
		
		Boolean actual = myList.toString().isEmpty();
		
		assertTrue(actual);
		
	}
	
}	