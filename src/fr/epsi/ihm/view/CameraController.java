package fr.epsi.ihm.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

import fr.epsi.model.*;

public class CameraController {
	@FXML
	private ComboBox<Ecran> cbxEcran;
	
	@FXML
	private ComboBox<String> cbxString;

	@FXML
	private ComboBox<Camera> cbxCamera;
	
	@FXML
	private ToggleButton toggleBttnAlea;

	@FXML
	private TextField TxtFieldDurreAlea;
	
	private MainView mainView;
	
	private final static int NB_MAX_MONITEURS = 9;
	
	private final static ImageView IV00 = new ImageView();
	private final static ImageView IV10 = new ImageView();
	private final static ImageView IV20 = new ImageView();
	private final static ImageView IV01 = new ImageView();
	private final static ImageView IV11 = new ImageView();
	private final static ImageView IV12 = new ImageView();
	private final static ImageView IV02 = new ImageView();
	private final static ImageView IV21 = new ImageView();
	private final static ImageView IV22 = new ImageView();
	
	private final static Ecran e0 = new Ecran(IV00);
	private final static Ecran e1 = new Ecran(IV10);
	private final static Ecran e2 = new Ecran(IV20);
	private final static Ecran e3 = new Ecran(IV01);
	private final static Ecran e4 = new Ecran(IV11);
	private final static Ecran e5 = new Ecran(IV12);
	private final static Ecran e6 = new Ecran(IV02);
	private final static Ecran e7 = new Ecran(IV21);
	private final static Ecran e8 = new Ecran(IV22);
	
	private static Ecran[] lesEcrans = new Ecran[]{e0, e1, e2, e3, e5, e6, e7, e8};
	
	private final static Afficheur afficheur = new Afficheur(lesEcrans, null);
	private ObservableList<Ecran> ecranData  = FXCollections.observableArrayList(afficheur.getTabEcran());
	
	public ObservableList<Ecran> getEcranData() {
		return ecranData;
	}

	public CameraController() {	
	}
	
	public void setMainView(MainView aMainView) {
		this.mainView = aMainView;
		cbxEcran.setItems(getEcranData());
	}

	
}
