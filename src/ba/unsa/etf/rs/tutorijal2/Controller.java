package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    public Label rezultat;
    public TextField broj;

    public void provjeri(ActionEvent actionEvent) {
        rezultat.setText("Rezultat je vec ispisan!");

    }
}
