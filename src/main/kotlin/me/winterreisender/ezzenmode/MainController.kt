package me.winterreisender.ezzenmode

import javafx.fxml.FXML
import javafx.scene.control.TextField
import javafx.scene.layout.HBox

import javafx.stage.Stage
import java.awt.Desktop
import java.net.URI

class MainController {
    @FXML private lateinit var welcomeText   :TextField
    @FXML private lateinit var navigateText  :TextField
    @FXML private lateinit var navigateHBox  :HBox

    @FXML fun initialize() {
    }

    @FXML private fun onZenButtonClicked() {
        ZenApplication().start(Stage())
        //navigateHBox.scene.window.hide()
    }

    @FXML private fun onRotateBtnClicked() {
        navigateHBox.rotate = (navigateHBox.rotate + 180) % 360
    }
    @FXML fun onMenuHomepageClicked(){
        Desktop.getDesktop().browse(URI("https://gitee.com/winter_reisender/EzZenMode"))
    }
}
