package sio.devoir1sioalt;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;

public class DevoirController implements Initializable {

    @FXML
    private Button btnExo1;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private Button btnExo2;
    @FXML
    private Slider sldNbLignes;
    @FXML
    private TextArea txtTriangle;
    @FXML
    private Button btnExo3;
    @FXML
    private Button btnDessiner;
    @FXML
    private TextField txtNbJours;
    @FXML
    private TextField txtNbEleves;
    @FXML
    private TextField txtCoutGlobal;
    @FXML
    private Button btnCalculer;
    @FXML
    private Button btnJouer;
    @FXML
    private TextArea txtResultatsTirages;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        apExo1.toFront();
    }

    @FXML
    public void btnExosMenuClicked(Event event)
    {
        if(event.getSource() == btnExo1)
        {
            apExo1.toFront();
        }
        else if(event.getSource() == btnExo2)
        {
            apExo2.toFront();
        }
        else
        {
            apExo3.toFront();;
        }
    }

    // Exercice n°1
    @FXML
    public void btnCalculerClicked(Event event)
    {
        if(txtNbJours.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choix du nombres de jours");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombres de jours");
            alert.showAndWait();
        }
        else if(txtNbEleves.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choix du nombres éleves");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombres d'éleves");
            alert.showAndWait();
        }
        else {

                int nbJours = Integer.parseInt(txtNbJours.getText());
                int nbEleves = Integer.parseInt(txtNbEleves.getText());

                double coutTrajet;
                if (nbEleves <= 25) {
                    coutTrajet = nbEleves * 67.30;
                } else {
                    coutTrajet = nbEleves * 61.00;
                }

                double coutNourriture = nbJours * nbEleves * 3.50;

                double coutHebergement;
                if (nbEleves <= 30) {
                    coutHebergement = nbJours * nbEleves * 4.75;
                } else if (nbEleves <= 35) {
                    coutHebergement = nbJours * nbEleves * 4.00;
                } else {
                    coutHebergement = nbJours * nbEleves * 3.50;
                }

                double coutGlobal = coutTrajet + coutNourriture + coutHebergement;

                DecimalFormat df = new DecimalFormat("#.##");
                txtCoutGlobal.setText(df.format(coutGlobal) + " €");


        }
    }





    // Exercice n°2
    @FXML
    public void btnDessinerClicked(Event event)
    {
        // A vous de jouer

    }

    // Exercice n°3
    @FXML
    public void btnJouerClicked(Event event)
    {
        // A vous de jouer

    }
}