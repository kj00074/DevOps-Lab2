package main.java.westga.edu.Lab01.view.codebehind;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import main.java.westga.edu.Lab01.model.ShoppingItem;
import main.java.westga.edu.Lab01.model.ShoppingList;
import java.util.ArrayList;

public class ShoppingCartWindow {
	
	ShoppingList myList = new ShoppingList();

    @FXML
    private TextField ItmTextField;

    @FXML
    private Label ShpItem;

    @FXML
    private Button addButton;

    @FXML
    private TextArea cartTxtArea;

    @FXML
    private Button removeBtn;
	
	@FXML
    private Label quanLabel;

    @FXML
    private TextField quanTxtField;
	
	@FXML
	public void addItemToCart(ActionEvent event) {
		
		String itemName = this.ItmTextField.getText();
		ShoppingItem myItem = new ShoppingItem(itemName);
		
		this.myList.addItem(myItem);
		
		
		String result = this.myList.toString();
		
		this.cartTxtArea.setText(result);
	
	}
	
	@FXML
	public void removeItemName(ActionEvent event) {
		String itemName = this.ItmTextField.getText();
		ShoppingItem myItem = new ShoppingItem(itemName);
		
		this.myList.removeItem(myItem);
		
		String result = this.myList.toString();
		
		this.cartTxtArea.setText(result);
	}
	
	@FXML
	public void addQuantity(ActionEvent event) {
		String amount = this.quanTxtField.getText();
		int quantity = Integer.parseInt(amount);
		
		String itemName = this.ItmTextField.getText();
		ShoppingItem myItem = new ShoppingItem(itemName);
		
		this.myList.updateQuantity(myItem, quantity);
		
		
	}
	
}