package com.example.jfxplay

import javafx.fxml.FXML
import javafx.scene.control.Alert
import javafx.scene.control.TextField
import javafx.scene.layout.HBox

import javafx.stage.Stage

class HelloController {
    @FXML private lateinit var welcomeText   :TextField
    //@FXML private lateinit var webBrowser0   :WebView
    @FXML private lateinit var navigateText  :TextField
    @FXML private lateinit var navigateHBox  :HBox

    @FXML fun initialize() {
        println("second")
        //webBrowser0.engine.load("https://liulanmi.com/labs/core.html")
    }

    @FXML private fun onHelloButtonClick() {
        //welcomeText.text = "JavaFX"
        //Alert(Alert.AlertType.CONFIRMATION).apply {
        //    contentText = "Hello"
        //}.showAndWait()
        AboutApplication().start(Stage())

        //navigateHBox.scene.window.hide()
    }

    @FXML private fun onNavigateBtnClicked() {
        //webBrowser0.engine.load(navigateText.text)
    }

    @FXML private fun onRotateBtnClicked() {
        navigateHBox.rotate = (navigateHBox.rotate + 180) % 360
    }
}
