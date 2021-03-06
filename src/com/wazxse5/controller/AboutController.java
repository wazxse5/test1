package com.wazxse5.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AboutController {
    private Stage aboutStage;

    @FXML private Label titleLabel;
    @FXML private Label infoLabel;
    @FXML private Label authorLabel;
    @FXML private Label versionLabel;

    @FXML public void initialize() {
        titleLabel.setText("O programie");

        infoLabel.setText("Program służy do sprawdzania poprawności różnych numerów.\n" +
                "Wprzyszłości zostanie dodana obsługa kolejnych numerów np. numer Regon czy numer dowodu osobistego");

        authorLabel.setText("Autor: Paweł Grzegórzko, wazxse5");
        versionLabel.setText("Wersja: v2.1-beta, 13 kwietnia 2018");
    }

    @FXML public void close() {
        aboutStage.close();
    }

    public void setAboutStage(Stage aboutStage) {
        this.aboutStage = aboutStage;
    }
}
