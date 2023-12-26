package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Seller");
	}
	
	@FXML
	public void onMenuItemDeparmentAction() {
		System.out.println("Department");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("About");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
}
