package com.example.jfxplay

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.HBox
import java.awt.Desktop
import java.lang.Long.parseLong
import java.net.URI

fun Long.toTimeString() =
    if(this < 0) {
        "0:0:0"
    }else{
        "${this/3600}:${this/60%60}:${this%60}"
    }


class AboutController {
    @FXML private lateinit var timeLeftLabel :Label
    @FXML private lateinit var exitButton : Button
    @FXML private lateinit var startButton : Button
    @FXML private lateinit var zenTimeInput : TextField
    @FXML private lateinit var zenTimeHBox : HBox

    fun initialize() {

    }

    @FXML fun onExitButtonClicked() {
        Platform.exit();
    }

    @FXML fun onStartButtonClicked() {
        val initTimeLeft = parseLong(zenTimeInput.text) * 60
        Thread {
            Platform.runLater { zenTimeHBox.isVisible = false; }
            var timeLeft = initTimeLeft;
            while (timeLeft >= 0) {
                Platform.runLater {
                    timeLeftLabel.text = "剩余 ${timeLeft.toTimeString()}"
                }
                Thread.sleep(1000);
                timeLeft--
            }
            Platform.runLater {
                exitButton.isVisible = true;
            }
        }.start()
    }

}
