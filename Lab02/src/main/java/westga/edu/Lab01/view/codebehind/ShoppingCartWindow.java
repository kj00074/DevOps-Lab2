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

public class ShoppingCartWindow {

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
    private Label priceLabel;

    @FXML
    private TextField priceTxtField;
	
	@FXML
	public void addItemToCart(ActionEvent event) {
		
		String itemName = this.ItmTextField.getText();
		String itemPrice = this.priceTxtField.getText();
		ShoppingItem myItem = new ShoppingItem(itemName, itemPrice);
		
		String result = myItem.toString();
		
		this.cartTxtArea.setText(result);
	
	}
}